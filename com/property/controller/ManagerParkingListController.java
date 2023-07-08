package com.property.controller;

import com.property.po.Owner;
import com.property.po.Parking;
import com.property.service.*;
import com.property.vo.CarportVO;
import com.property.vo.OwnerVO;
import com.property.vo.ParkingVO;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : CD
 * @ClassName ：
 * @CreateTime 2022/9/13 11:27
 */
@Controller
@RequestMapping("/admin/manager")
public class ManagerParkingListController {
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
    public String toparkingusagelist(Model model){
        List<CarportVO> list =carPortService.findAllVO();
        model.addAttribute("list",list);
        logger.info("前往停车位使用控制器");
        return "admin/parkingusagelist";
    }
//    @RequestMapping("/toparkingusageadd")
//    public String toparkingusageadd(int parking_id,int village_vid,Model model){
//        logger.info("前往停车位添加控制器");
//        ParkingVO parkingVO = parkingService.findAllVOByPid(parking_id);
//        List<OwnerVO> list = ownerService.findVOAllByVid(village_vid);
//        model.addAttribute("parkingVO",parkingVO);
//        model.addAttribute("list",list);
//        return "admin/parkingusageadd";
//    }
//    @RequestMapping("/parkinguseradd")
//    public String parkinguseradd(int village_vid,int parking_id,String car_num,String owner_tel){
//        logger.info("车位使用人添加控制器");
//        logger.info(owner_tel);
//        logger.info(village_vid);
//        logger.info(parking_id);
//        logger.info(car_num);
//        Parking parking= parkingService.findById(parking_id);
//        Owner owner = ownerService.findTel(owner_tel);
//        logger.info(owner.getOwner_id());
//        parking.setOwner_id(owner.getOwner_id());
//        parking.setCar_num(car_num);
//        parkingService.updateParking(parking);
//        return "redirect:/admin/toparkingusagelist.action?village_vid="+village_vid;
//    }
}
