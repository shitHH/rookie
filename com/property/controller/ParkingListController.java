package com.property.controller;

import com.property.po.*;
import com.property.service.*;
import com.property.vo.CarportVO;
import com.property.vo.OwnerVO;
import com.property.vo.ParkingVO;
import com.property.vo.VillageVO;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : CD
 * @ClassName ：
 * @CreateTime 2022/9/13 11:27
 */
@Controller
@RequestMapping("/admin")
public class ParkingListController {
    Logger logger = Logger.getLogger(VillageListController.class);
    @Autowired
    CarPortService carPortService;
    @Autowired
    VillageService villageService;
    @Autowired
    OwnerService ownerService;
    @Autowired
    CarService carService;

    @RequestMapping("/toparkingusagelist")
    public String toparkingusagelist(int village_vid, Model model) {
        List<CarportVO> list = carPortService.findAllVOByVidAndUid(village_vid);
        model.addAttribute("list", list);
        logger.info("前往停车位使用控制器");
        return "admin/parkingusagelist";
    }

    @RequestMapping("/toparkingusageadd")
    public String toparkingusageadd(int carport_id, Model model) {
        logger.info("前往停车位添加控制器");
        CarportVO carportVO = carPortService.findAllVOByCid(carport_id);
        model.addAttribute("carportVO", carportVO);
        return "admin/parkingusageadd2";
    }

    @RequestMapping("/parkinguseradd")
    public String parkinguseradd(int village_vid, int carport_id, String car_num, String owner_tel) {
        logger.info("车位使用人添加控制器");
        logger.info(owner_tel);
        logger.info(village_vid);
        logger.info(carport_id);
        logger.info(car_num);
        CarPort carport = carPortService.findById(carport_id);
        Owner owner = ownerService.findTel(owner_tel);
        logger.info(owner.getOwner_id());
        carport.setOwner_id(owner.getOwner_id());
        carport.setCar_num(car_num);
        carPortService.updateCarPort(carport);
        return "redirect:/admin/toparkingusagelist.action?village_vid=" + village_vid;
    }

    //    ajax控制器
    @RequestMapping(value = "/checktel_owner", produces = {"text/html;charset=UTF-8;", "application/json;"})
    @ResponseBody
    public String ownerlist(String owner_tel, int village_vid,String village_name) {
        logger.info("============checktel_owner===================");
        logger.info(owner_tel);
        logger.info(village_vid);
   Owner owner= ownerService.findTelAndVid(owner_tel,village_vid);

//        logger.info(owner.getOwner_name());
//        boolean flag = owner.getVillage_vid() == village_vid ? true : false;
//        if (owner!=null) {
//            boolean flag = owner.getVillage_vid() == village_vid ? true : false;
//            return flag;
//        }else {
//            boolean flag;
//            return false;
//        }

        if (owner!=null){
            String owner_name=owner.getOwner_name();
            logger.info(owner_name);
            return owner_name;
        }else{
            String warning="您输入的的手机号未在"+village_name+"物业系统注册";
            logger.info("------------------------------------------------------------");
            return warning;
        }
    }



    @RequestMapping("/checkcar_num")
    @ResponseBody
    public boolean car_num(String car_num) {
        logger.info(car_num);
        CarPort carPort = carPortService.findByCar_numcd(car_num);
        boolean flag = carPort == null ? true : false;
        return flag;
    }
//    @RequestMapping("/ownercarportlist")
//    @ResponseBody
//    public List<CarportVO> ownercarportlist(int owner_id){
//        logger.info("前往业主列表控制器");
//        List<CarportVO> list = carPortService.findByOwner_id(owner_id);
//        return list;
//    }
//    @RequestMapping("/ownercarnumlist")
//    @ResponseBody
//    public List<Car> ownercarnumlist(int owner_id){
//        logger.info("前往业主列表控制器");
//        List<Car> list = carService.findByOwnerId(owner_id);
//        return list;
//    }
//    @RequestMapping("/ownertel")
//    @ResponseBody
//    public Owner ownertel(int owner_id){
//        logger.info("前往业主列表控制器");
//        Owner ownerTel = ownerService.findById(owner_id);
//        return ownerTel;
//    }
}
