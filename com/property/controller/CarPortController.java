package com.property.controller;

import com.property.po.CarPort;
import com.property.po.Carport_LeasState;
import com.property.po.Owner;
import com.property.service.CarPortService;
import com.property.service.Carport_LeasStateService;
import com.property.vo.CarportVO;
import com.property.vo.PaymentVo;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author : Eeerosss
 * @create 2022/9/14 13:29
 */
@RequestMapping("/owner")
@Controller
public class CarPortController {
    @Autowired
    CarPortService carPortService;
    @Autowired
    Carport_LeasStateService carport_leasStateService;
    Logger logger = Logger.getLogger(CarPortController.class);

    @RequestMapping("/carportlist")
    public  String carPortList(Model model, int village_vid){
        logger.info("进入我要租车位控制器");
        List<CarportVO> list= carPortService.findByVillage_vidAndCarport_lid(village_vid,2);
        model.addAttribute("list",list);
        return  "owner/carportlist";
    }

    @RequestMapping("/toupdatecarport_l")
    public String toUpdateCarport_l( Model model,CarPort owner){
        List<CarportVO> list = carPortService.findByOwner_id(owner.getOwner_id());
        model.addAttribute("list",list);
        logger.info("进入修改车位状态控制器");
        return "owner/updatecarport_l";
    }
    @RequestMapping("/updatecarport_l")
    public String updateCarport_l(CarPort carPort){
        logger.info(carPort.getCarport_lid());
        logger.info("修改车位状态控制器");
        boolean fg= carPortService.updateCarPort2(carPort);
        logger.info(fg);
        return "redirect:/owner/tomain.action";
    }

    @RequestMapping("/toaddcarport")
    public String toAddCarport(){
        logger.info("登记车位信息控制器");
        return "owner/addcarport";
    }
    @RequestMapping("/addcarport")
    public String  addCarport( CarPort carPort){
        boolean fg=carPortService.addCarPort(carPort);
        logger.info(fg);
        return "redirect:/owner/tomain.action";
    }

    @RequestMapping("/toupdatecarport_num")
    public String toUpdateCarport_num( Model model,CarPort owner){
        List<CarportVO> list = carPortService.findByOwner_id(owner.getOwner_id());
        model.addAttribute("list",list);
        logger.info("进入修改车位车牌号控制器");
        return "owner/updatecarport_num";
    }
    @RequestMapping("/updatecarport_num")
    public String updateCarport_num(CarPort carPort){
        logger.info(carPort.getCarport_lid());
        logger.info("修改车位车牌号控制器");
        boolean fg= carPortService.updateCarPort3(carPort);
        logger.info(fg);
        return "redirect:/owner/tomain.action";
    }

}
