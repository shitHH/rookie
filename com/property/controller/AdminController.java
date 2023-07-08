package com.property.controller;

import com.property.po.*;
import com.property.service.*;
import com.property.vo.*;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.apache.log4j.Logger;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.jws.WebParam;
import java.util.Arrays;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : chengxia
 * @ClassName ：管理端控制器
 * @create 2022-09-12 15:33
 */
@Controller
@RequestMapping("/admin")
public class AdminController {

    Logger logger = Logger.getLogger(AdminController.class);

    @Autowired
    OwnerService ownerService;
    @Autowired
    VillageService villageService;
    @Autowired
    BuildingService buildingService;
    @Autowired
    UnitService unitService;
    @Autowired
    RoomService roomService;
    @Autowired
    OwnerRoleService ownerRoleService;
    @Autowired
    AdminService adminService;
    @Autowired
    CarService carService;
    @Autowired
    PetService petService;
    @Autowired
    Admin_RoleService admin_roleService;
    @Autowired
    Admin_StateService admin_stateService;


    @RequestMapping("/toownerlist")
    public String toOwnerList(int village_vid, Model model) {
        logger.info("toownerlist action");
        logger.info(village_vid);
        List<OwnerVO> list = ownerService.findVOAllByVid(village_vid);
        model.addAttribute("list", list);
        return "admin/personnel_list";
    }

    @RequestMapping("/tologin")
    public String toLogin() {
        logger.info("----tologin action----");
        return "admin/login";
    }

    @RequestMapping("/login")
    public String login(Admin admin, HttpSession session, HttpServletRequest request) {
        logger.info("----login action----");
        logger.info(admin);
        AdminVO currentAdminVO = adminService.findByTelAndPass(admin);
        logger.info(currentAdminVO);
        if (currentAdminVO != null) {
            if (currentAdminVO.getAdmin_rid() == 3) {
                if (currentAdminVO.getAdmin_sid() == 1) {
                    //登录成功，把当前登录人 放入到session作用域中
                    session.setAttribute("currentAdminVO", currentAdminVO);
                    //重定向
                    return "redirect:/admin/toindex2.action";
                } else {
                    request.setAttribute("mess", "该账号已停用");
                    return "admin/login";
                }

            } else {
                if (currentAdminVO.getAdmin_sid() == 1) {
                    //登录成功，把当前登录人 放入到session作用域中
                    session.setAttribute("currentAdminVO", currentAdminVO);
                    //重定向
                    return "redirect:/admin/toindex.action";
                } else {
                    request.setAttribute("mess", "该账号已停用");
                    return "admin/login";
                }
            }

        } else {
            //登录失败
            request.setAttribute("mess", "登陆名或密码错误！");
            //跳转到登录界面继续登录
            return "admin/login";

        }

    }


    @RequestMapping("/tologin2")
    public String toLogin2() {
        logger.info("进入小区选择页面");
        return "admin/login2";
    }

    @RequestMapping("/login2")
    public String login2(HttpSession session, int vid) {
        logger.info("进入login2");
        AdminVO adminVO = (AdminVO) session.getAttribute("currentAdminVO");
        adminVO.setVillage_vid(vid);
        logger.info(adminVO.getAdmin_name());
        logger.info(adminVO.getVillage_vid());
        session.setAttribute("currentAdminVO", adminVO);
        return "admin/index";
    }

    @RequestMapping("/tocarlist")
    public String toCarList(int village_vid, Model model) {
        logger.info("------toCarList  action----------");
        logger.info(village_vid);
        List<CarVO> list = carService.findVOAllByVid(village_vid);
        logger.info(list.size());
        for (CarVO carVO : list) {
            logger.info(carVO);
        }
        model.addAttribute("list", list);
        return "admin/car_list";
    }

    @RequestMapping("/toaddcar")
    public String toAddCar(int village_vid, Model model) {
        logger.info("------toAddCar  action----------");
        logger.info(village_vid);
        List<OwnerVO> ownerVOList = ownerService.findVOAllByVid(village_vid);
        model.addAttribute("ownerVOList", ownerVOList);
        return "admin/car_add";
    }

    @RequestMapping("/addcar")
    public String addCar(Car car, int village_vid) {
        logger.info("------addcar  action----------");
        logger.info(village_vid);
        logger.info(car.getCar_num() + "/" + car.getOwner_id());
        boolean b = carService.add(car);
        logger.info(b);
        return "redirect:/admin/tocarlist.action?village_vid=" + village_vid;
    }

    @RequestMapping("/delete")
    public String delete(int[] ids, int village_vid) {
        logger.info("------delete  action----------");
        logger.info(village_vid);
        logger.info(Arrays.toString(ids));
        boolean b = carService.deleteById(ids);
        logger.info(b);
        return "redirect:/admin/tocarlist.action?village_vid=" + village_vid;
    }

    @RequestMapping("/toupdate")
    public String toUpdate(int car_id, int village_vid, Model model) {
        logger.info("------toUpdate  action----------");
        logger.info(car_id);
        logger.info(village_vid);
        Car car = carService.findById(car_id);
        List<OwnerVO> list = ownerService.findVOAllByVid(village_vid);
        model.addAttribute("car", car);
        model.addAttribute("list", list);
        return "admin/car_update";
    }

    @RequestMapping("/update")
    public String update(Car car, int village_vid) {
        logger.info("------update  action----------");
        logger.info(car.getCar_num());
        boolean b = carService.update(car);
        logger.info(b);
        return "redirect:/admin/tocarlist.action?village_vid=" + village_vid;
    }

    @RequestMapping("/topetlist")
    public String toPetList(int village_vid, Model model) {
        logger.info("------topetList  action----------");
        logger.info(village_vid);
        List<PetVO> list = petService.findVOByVid(village_vid);
        for (PetVO petVO : list) {
            logger.info(petVO);
        }
        model.addAttribute("list", list);
        return "admin/pet_list";
    }

    @RequestMapping("/toaddpet")
    public String toAddPet(int village_vid, Model model) {
        logger.info("------toAddPet  action----------");
        logger.info(village_vid);
        List<OwnerVO> list = ownerService.findVOAllByVid(village_vid);
        logger.info(list.size());
        model.addAttribute("list", list);
        return "admin/pet_add";
    }

    @RequestMapping("/addpet")
    public String addPet(Pet pet, int village_vid) {
        logger.info("------addPet  action----------");
        logger.info(pet);
        logger.info(village_vid);
        boolean b = petService.addPet(pet);
        logger.info(b);
        return "redirect:/admin/topetlist.action?village_vid=" + village_vid;
    }

    @RequestMapping("/toupdatepet")
    public String toUpdatePet(int pet_id, int village_vid, Model model) {
        logger.info("------toUpdatePet  action----------");
        logger.info(pet_id);
        logger.info(village_vid);
        Pet pet = petService.findById(pet_id);
        List<OwnerVO> list = ownerService.findVOAllByVid(village_vid);
        model.addAttribute("pet", pet);
        model.addAttribute("list", list);
        return "admin/pet_update";
    }

    @RequestMapping("/updatepet")
    public String updatePet(Pet pet, int village_vid) {
        logger.info("------updatePet  action----------");
        logger.info(pet);
        logger.info(village_vid);
        boolean b = petService.updatePet(pet);
        logger.info(b);
        return "redirect:/admin/topetlist.action?village_vid=" + village_vid;
    }

    @RequestMapping("/deletepet")
    public String deletePet(int[] ids, int village_vid) {
        logger.info("------deletepet  action----------");
        logger.info(Arrays.toString(ids));
        logger.info(village_vid);
        boolean b = petService.deleteById(ids);
        logger.info(b);
        return "redirect:/admin/topetlist.action?village_vid=" + village_vid;

    }

    @RequestMapping("/exit")
    public String exit(HttpSession session) {
        logger.info("----------exit  action-----------");
        session.setMaxInactiveInterval(0);
        session.invalidate();
        return "redirect:/owner/index.action";
    }

    @RequestMapping("/adminlist")
    public String adminList(int village_vid, Model model) {
        logger.info("----------adminList  action-----------");
        logger.info(village_vid);
        List<AdminVO> list = adminService.findVOByVid(village_vid);
        logger.info(list.size());
        model.addAttribute("list", list);
        return "admin/adminlist";
    }

    @RequestMapping("/toaddadmin")
    public String toAddAdmin(Model model) {
        logger.info("----------toAddAdmin  action-----------");
        List<Admin_Role> admin_roleList = admin_roleService.findAll();
        List<Admin_State> admin_stateList = admin_stateService.findAll();
        model.addAttribute("admin_roleList", admin_roleList);
        model.addAttribute("admin_stateList", admin_stateList);
        return "admin/admin_add";
    }

    @RequestMapping("/addadmin")
    public String addAdmin(Admin admin) {
        logger.info("----------addAdmin  action-----------");
        logger.info(admin);
        logger.info(admin.getVillage_vid());
        adminService.addAdmin(admin);
        return "redirect:/admin/adminlist.action?village_vid=" + admin.getVillage_vid();
    }

    @RequestMapping("/toupdateadmin")
    public String toUpdateAdmin(int admin_id, Model model) {
        logger.info("----------toUpdateAdmin  action-----------");
        logger.info(admin_id);
        Admin admin = adminService.findById(admin_id);

        List<Admin_Role> admin_roleList = admin_roleService.findAll();
        List<Admin_State> admin_stateList = admin_stateService.findAll();
        model.addAttribute("admin", admin);
        model.addAttribute("admin_roleList", admin_roleList);
        model.addAttribute("admin_stateList", admin_stateList);
        return "admin/admin_update";
    }

    @RequestMapping("/updateadmin")
    public String updateAdmin(Admin admin) {
        logger.info("----------updateAdmin  action-----------");
        logger.info(admin);
        adminService.updateAdmin(admin);
        return "redirect:/admin/adminlist.action?village_vid=" + admin.getVillage_vid();
    }

    @RequestMapping("/deleteadmin")
    public String deleteAdmin(int[] ids, int village_vid) {
        logger.info("----------deleteadmin  action-----------");
        logger.info(Arrays.toString(ids));
        logger.info(village_vid);
        boolean b = adminService.deleteAdmin(ids);
        logger.info(b);
        return "redirect:/admin/adminlist.action?village_vid=" + village_vid;
    }


    @RequestMapping("/rolelist")
    public String roleList(Model model) {
        logger.info("----------roleList  action-----------");
        List<Admin_Role> list = admin_roleService.findAll();
        logger.info(list);
        model.addAttribute("list", list);
        return "admin/admin_rolelist";
    }


    @RequestMapping("/toaddadminrole")
    public String toAddAdminRole() {
        logger.info("----------toAddAdminRole  action-----------");
        return "admin/admin_addrole";
    }


    @RequestMapping("/addadminrole")
    public String addAdminRole(Admin_Role admin_role) {
        logger.info("----------addAdminRole  action-----------");
        logger.info(admin_role);
        boolean b = admin_roleService.addAdmin_Role(admin_role);
        logger.info(b);
        return "redirect:/admin/rolelist.action";
    }


    @RequestMapping("/toone_set")
    public String toOneSet() {
        logger.info("----------toOneSet  action-----------");
        return "admin/one_set";
    }

    @RequestMapping("/toone_set2")
    public String toOneSet2() {
        logger.info("----------toOneSet2  action-----------");
        return "admin/one_set2";
    }


    @RequestMapping("/one_set")
    public String oneSet(Admin admin, String admin_passnew, HttpSession session) {
        logger.info("----------oneSet  action-----------");
        logger.info(admin);
        logger.info(admin_passnew);
        AdminVO currentAdminVO = (AdminVO) session.getAttribute("currentAdminVO");
        admin.setAdmin_id(currentAdminVO.getAdmin_id());
        admin.setVillage_vid(currentAdminVO.getVillage_vid());
        admin.setAdmin_sid(currentAdminVO.getAdmin_sid());
        admin.setAdmin_rid(currentAdminVO.getAdmin_rid());
        admin.setAdmin_time(currentAdminVO.getAdmin_time());
        String admin_passnew1 = admin_passnew.trim();
        if (admin_passnew1 == "") {
            //用户没有修改密码
            admin.setAdmin_pass(currentAdminVO.getAdmin_pass());
            boolean b = adminService.updateAdminNOPass(admin);
            logger.info(b);
        } else {
            //用户修改了密码
            admin.setAdmin_pass(admin_passnew);
            boolean b1 = adminService.updateAdmin(admin);
            logger.info(b1);
        }
        return "redirect:/admin/exit.action";
    }


    @RequestMapping("/toaddowner")
    public String toAddOwner(int village_vid, Model model) {
        logger.info("----------toaddowner action-----------");
        logger.info(village_vid);
        Village village = villageService.findByVillage_vid(village_vid);
        logger.info(village);
        List<OwnerRole> ownerRoleList = ownerRoleService.findAll();


        model.addAttribute("village", village);
        model.addAttribute("ownerRoleList", ownerRoleList);

        return "admin/personnel_add2";
    }


    @RequestMapping("/checktel")
    @ResponseBody
    public boolean checkTel(String owner_tel) {
        logger.info(owner_tel);
        Owner owner = ownerService.findTel(owner_tel);
        //判断
        if (owner != null) {
            //该电话号码已经注册过了
            logger.info("该电话号码已经注册过了");
            return false;
        } else {
            //该电话号码没有注册过
            logger.info("该电话号码NO注册过");
            return true;
        }
    }


    @RequestMapping("checkadmintel")
    @ResponseBody
    public boolean checkaAminTel(String admin_tel) {
        logger.info(admin_tel);
        Admin admin = adminService.findByTel(admin_tel);
        //判断
        if (admin != null) {
            //该电话号码已经注册过了
            logger.info("该电话号码已经注册过了");
            return false;
        } else {
            //该电话号码没有注册过
            logger.info("该电话号码NO注册过");
            return true;
        }


    }


    @RequestMapping("/addowner")
    public String addOwner(Owner owner) {
        logger.info("----------addOwner action------------------");
        logger.info(owner);
        String str = villageService.findByVillage_vid(owner.getVillage_vid()).getVillage_name() + buildingService.findByBid(owner.getBuilding_bid()).getBuilding_name() +
                unitService.findByUnit_uid(owner.getUnit_uid()).getUnit_name() + roomService.findByRoom_rid(owner.getRoom_rid()).getRoom_name();
        owner.setOwner_addr(str);
        boolean b = ownerService.addOwner(owner);
        logger.info(b);
        logger.info(owner.getVillage_vid());

        return "redirect:/admin/toownerlist.action?village_vid=" + owner.getVillage_vid();
    }

    @RequestMapping("/toupdateowner")
    public String toUpdateOwner(int owner_id, Model model) {
        logger.info("----------toUpdateOwner action------------------");
        logger.info(owner_id);
        Owner owner = ownerService.findById(owner_id);
        List<OwnerRole> ownerRoleList = ownerRoleService.findAll();
        model.addAttribute("owner", owner);
        model.addAttribute("ownerRoleList", ownerRoleList);
        return "admin/personnel_update";

    }

    @RequestMapping("/updateowner")
    public String updateOwner(Owner owner) {
        logger.info("----------updateOwner action------------------");
        logger.info(owner);
        String str = villageService.findByVillage_vid(owner.getVillage_vid()).getVillage_name() + buildingService.findByBid(owner.getBuilding_bid()).getBuilding_name() +
                unitService.findByUnit_uid(owner.getUnit_uid()).getUnit_name() + roomService.findByRoom_rid(owner.getRoom_rid()).getRoom_name();
        owner.setOwner_addr(str);
        boolean b = ownerService.updateOwner(owner);
        logger.info(b);

        return "redirect:/admin/toownerlist.action?village_vid=" + owner.getVillage_vid();

    }


    @RequestMapping("/buildinglist")
    @ResponseBody
    public List<Building> buildingList(int village_vid) {
        logger.info("----------buildingList action------------------");
        logger.info(village_vid);
        List<Building> buildingList = buildingService.findByVid(village_vid);
        logger.info(buildingList);
        return buildingList;
    }

    @RequestMapping("/unitlist")
    @ResponseBody
    public List<Unit> unitList(int building_bid) {
        logger.info("----------unitList action------------------");
        logger.info(building_bid);
        List<Unit> unitList = unitService.findByBuilding_bid(building_bid);
        logger.info(unitList);
        return unitList;
    }

    @RequestMapping("/roomlist2")
    @ResponseBody
    public List<Room> roomList(int unit_uid) {
        logger.info("----------roomList action------------------");
        logger.info(unit_uid);
        List<Room> roomList = roomService.findByUnit_uid(unit_uid);
        logger.info(roomList);
        return roomList;
    }


}
