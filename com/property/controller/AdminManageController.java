package com.property.controller;

import com.property.po.Admin_Role;
import com.property.po.Owner;
import com.property.po.Village;
import com.property.service.*;
import com.property.vo.AdminVO;
import com.property.vo.CarVO;
import com.property.vo.OwnerVO;
import com.property.vo.PetVO;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : chengxia
 * @ClassName ：管理端管理人员控制器
 * @CreateTime 2022/9/16 19:12
 */
@Controller
@RequestMapping("/admin/manager")
public class AdminManageController {

    Logger logger=Logger.getLogger(AdminManageController.class);

    @Autowired
    OwnerService ownerService;
    @Autowired
    CarService carService;
    @Autowired
    PetService petService;
    @Autowired
    AdminService adminService;
    @Autowired
    VillageService villageService;
    @Autowired
    Admin_RoleService admin_roleService;


    @RequestMapping("/managerownerlist")
    public String managerOwnerList(Model model){
        logger.info("===========   managerOwnerList action   ===========");
        List<OwnerVO> ownerVOList = ownerService.findVOAll();
        logger.info("共有业主数："+ownerVOList.size());
        model.addAttribute("ownerVOList",ownerVOList);
        return "admin/personnel_list_manager";

    }

    @RequestMapping("/managercarlist")
    public String managerCarList(Model model){
        logger.info("===========   managerCarList action   ===========");
        List<CarVO> carVOList = carService.findVOAll();
        for (CarVO carVO:carVOList){
            logger.info(carVO.getVillage_name());
        }

        model.addAttribute("carVOList",carVOList);
        return "admin/car_list_manager";

    }

    @RequestMapping("/managerpetlist")
    public String managerPetList(Model model){
        logger.info("===========   managerPetList action   ===========");
        List<PetVO> petVOList = petService.findVOAll();
        logger.info("共有宠物数："+petVOList.size());
        model.addAttribute("petVOList",petVOList);
        return "admin/pet_list_manager";

    }

    @RequestMapping("/manageradminlist")
    public String managerAdminList(Model model){
        logger.info("===========   managerAdminList action   ===========");
        List<AdminVO> list = adminService.findVOAll();
        logger.info("共有宠物数："+list.size());
        model.addAttribute("list",list);
        return "admin/adminlist_manager";

    }

    @RequestMapping("/searchvillagelistbyvname")
    public String searchVillageListByVname(Village village,Model model){
        logger.info("===========   searchVillageListByVname action   ===========");
        logger.info(village);
        List<Village> villageList = villageService.findByVillageName(village);
        logger.info(villageList);
        if(villageList.size()>0){
            List<Integer> vids=new ArrayList<>();
            for (Village v:villageList){
                vids.add(v.getVillage_vid());
            }
            List<AdminVO> list = adminService.findVOByVids(vids);
            model.addAttribute("list",list);
            return "admin/adminlist_manager";
        }else{
            return "redirect:/admin/manager/manageradminlist.action";
        }
    }








}
