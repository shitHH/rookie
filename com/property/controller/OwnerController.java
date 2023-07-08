package com.property.controller;

import com.property.po.*;
import com.property.service.*;
import com.property.util.MD5Util;
import com.property.vo.CarportVO;
import com.property.vo.OwnerVo1;
import com.property.vo.PetVO;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * @author 梁三岁
 * @version 1.0
 * @description: TODO
 * @name: 业主控制器
 * @date 2022/9/12 11:50
 */
@Controller
@RequestMapping("/owner")
public class OwnerController {
    Logger logger = Logger.getLogger(OwnerController.class);

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
    PetService petService;
    @Autowired
    CarPortService carPortService;
    /****************************************注册*****************************************/
    /**
     * 去注册控制器
     *
     * @return 注册页面
     */
    @RequestMapping("/toregister")
    public String toregist() {
        logger.info("============================toregist action============================");

        return "owner/register";
    }

    @RequestMapping("/register")
    public String register(Owner owner) {
        logger.info(owner);
        logger.info(villageService.findByVillage_vid(owner.getVillage_vid()).getVillage_name());
        logger.info(buildingService.findByBid(owner.getBuilding_bid()).getBuilding_name());
        logger.info(unitService.findByUnit_uid(owner.getUnit_uid()).getUnit_name());
        logger.info(roomService.findByRoom_rid(owner.getRoom_rid()).getRoom_name());
        owner.setOwner_addr(villageService.findByVillage_vid(owner.getVillage_vid()).getVillage_name() +
                buildingService.findByBid(owner.getBuilding_bid()).getBuilding_name() + unitService.findByUnit_uid(owner.getUnit_uid()).getUnit_name() +
                roomService.findByRoom_rid(owner.getRoom_rid()).getRoom_name());
        boolean flag = ownerService.addOwner(owner);
        CarPort carPort = new CarPort();
        carPort.setOwner_id(owner.getOwner_id());
        carPort.setCarport_uid(1);
        carPort.setCarport_lid(3);
        carPortService.addCarPort(carPort);
        return "redirect:/owner/tologin.action";
    }

    @RequestMapping("/checktel")
    @ResponseBody
    public boolean checkTel(String tel) {
        logger.info(tel);
        Owner owner = ownerService.findTel(tel);
        boolean flag = owner == null ? true : false;
        return flag;
    }
    /****************************************登录*****************************************/
    /**
     * @return 去登陆控制器
     */
    @RequestMapping("/tologin")
    public String tologin() {
        logger.info("=======================tologin=======================");
        return "owner/login";
    }

    @RequestMapping("/login")
    public String login(Owner owner, String captcha, HttpSession session, HttpServletRequest request) {
        //判断用户的验证码是否输入正确
        String captchaSession = session.getAttribute("simpleCaptcha").toString();
        if (captcha.equals(captchaSession)) {
            logger.info("=======================login=======================");
            OwnerVo1 currentOwner = ownerService.findTelAndPass(owner);
            logger.info(currentOwner);
            if (currentOwner != null) {
                //登录成功，记录当前登录的人进入到Session当中
                session.setAttribute("currentOwner", currentOwner);
                return "redirect:/owner/tomain.action";
            } else {
                //登录失败，跳转到登录界面继续登录
                request.setAttribute("mess", "用户名或密码错误");
                return "owner/login";
            }
        } else {
            request.setAttribute("mess", "验证码输入错误");
            return "owner/login";
        }
    }

    /****************************************忘记密码*****************************************/

    @RequestMapping("/toreset")
    public String toreset() {
        logger.info("=======================toreset=======================");
        return "owner/confirmreset";
    }

    @RequestMapping("/confirmreset")
    public String confirmreset(Owner owner, Model model) {
        Owner owner1 = ownerService.findTelAndCid(owner);
        logger.info(owner1.getOwner_name());
        if (owner1 != null) {
            logger.info("进入去修改密码控制器");
            model.addAttribute("owner1", owner1);
            return "owner/reset";
        } else {
            logger.info("返回确认");
            return "owner/confirmreset";
        }
    }

    @RequestMapping("/reset")
    public String reset(Owner owner) {
        logger.info("=================reset=================");
        logger.info(owner.getOwner_pass());
        owner.setOwner_pass(MD5Util.md5(owner.getOwner_pass()));
        logger.info(owner.getOwner_pass());
        ownerService.reset(owner);
        return "owner/login";
    }

    /****************************************修改个人信息****************************************/
    @RequestMapping("/toupdate")
    public String toUpdate() {
        logger.info("=======================toupdate=======================");
        return "owner/alterinfo";
    }

    @RequestMapping("/update")
    public String update(Owner owner) {
        logger.info("=======================update=======================");
        owner.setVillage_vid(owner.getVillage_vid());
        owner.setBuilding_bid(owner.getBuilding_bid());
        owner.setUnit_uid(owner.getUnit_uid());
        owner.setRoom_rid(owner.getRoom_rid());
        owner.setOwner_rid(owner.getOwner_rid());
        owner.setOwner_pass(owner.getOwner_pass());
        owner.setOwner_name(owner.getOwner_name());
        owner.setowner_cid(owner.getowner_cid());
        owner.setowner_tel(owner.getowner_tel());
        owner.setowner_sex(owner.getowner_sex());
        boolean flag = ownerService.updateOwner(owner);
        logger.info(flag);
        return "redirect:/owner/tomain.action";
    }

    /****************************************添加业主宠物信息****************************************/

    @RequestMapping("/toaddPet")
    public String toaddPet() {
        logger.info("=======================toaddPet=======================");

        return "owner/pet";
    }

    @RequestMapping("/addPet")
    public String addPet(@RequestParam("files") CommonsMultipartFile file, Pet pet) {

        if (file.getSize() > 0) {
            try {
                String names = this.creatName(file.getOriginalFilename());
                String path = "D:" + File.separator + "dir" + File.separator + names;
                File file1 = new File(path);
                file.transferTo(file1);
                pet.setpet_jpg(names);
                boolean flag = petService.addPet(pet);
                logger.info(pet.getpet_jpg());
                logger.info(flag);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return "redirect:/owner/tomain.action";
    }

    private String creatName(String names) {
        //获得文件名.之前的字符串
        String caselsh = names.substring(0, names.lastIndexOf("."));
        //获得文件的后缀名
        String suffix = names.substring(names.lastIndexOf("."));
        int n = (int) (Math.random() * 100000 + 1);
        String newName = caselsh + System.currentTimeMillis() + n + suffix;

        return newName;
    }

    /****************************************业主宠物信息列表****************************************/

    @RequestMapping("/topetlist")
    public String topetlist(Model model,Owner owner){
        logger.info("=======================topetlist=======================");
       List<PetVO>list= petService.findByOwner_id(owner.getOwner_id());
       logger.info(list);
       model.addAttribute("list",list);
        return "owner/petlist";
    }
    /****************************************修改业主宠物信息****************************************/
    @RequestMapping("/toupdatepet")
    public String toupdatepet(Model model,Owner owner){
        logger.info("=======================toupdatepet=======================");
        logger.info(owner.getOwner_id());
        List<PetVO>list= petService.findByOwner_id(owner.getOwner_id());
        logger.info(list);
        model.addAttribute("list",list);
        return "owner/alterpetinfo";
    }
    @RequestMapping("/updatepet")
    public String updatePet(@RequestParam("files") CommonsMultipartFile file, Pet pet) {
        logger.info("进入修改宠物图片");
        if (file.getSize() > 0) {
            try {
                String names = this.creatName(file.getOriginalFilename());
                String path = "D:" + File.separator + "dir" + File.separator + names;
                logger.info(names);
                File file1 = new File(path);
                file.transferTo(file1);
                pet.setpet_jpg(names);
                boolean flag = petService.updatePet(pet);
                logger.info(pet.getpet_jpg());
                logger.info(flag);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return "redirect:/owner/tomain.action";
    }

    /****************************************退出登录****************************************/

    @RequestMapping("/exit")
    public String exit(HttpSession session ){
        session.invalidate();
        return "redirect:/owner/index.action";
    }
}