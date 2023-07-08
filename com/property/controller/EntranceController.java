package com.property.controller;

import com.property.po.CarPort;
import com.property.po.Temporary;
import com.property.service.CarPortService;
import com.property.service.TemporaryService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.Timestamp;

/**
 * @Author : bugger
 * @create 2022/9/18 12:00
 * 进出场控制器
 */
@Controller
@RequestMapping("/owner")
public class EntranceController {
    Logger logger = Logger.getLogger(EntranceController.class);
@Autowired
    CarPortService carPortService;
@Autowired
    TemporaryService temporaryService;
@RequestMapping("/toentrance")
public  String toEntrance(){

    return "owner/entrance";
}
    @RequestMapping("/toentrance2")
    public  String toEntrance2(){

        return "owner/entrance2";
    }

@RequestMapping("/entrance")
public  String Entrance(String car_num){
    CarPort carPort= carPortService.findByCar_num(car_num);
    return "owner/main";
}
    @RequestMapping("/entrance2")
    public  String Entrance2(String car_num){
        CarPort carPort= carPortService.findByCar_num(car_num);
        return "owner/index";
    }

@RequestMapping("/toplaying")
    public String toPlaying(){
    return "owner/playing";
}
    @RequestMapping("/toplaying2")
    public String toPlaying2(){
        return "owner/playing2";
    }

    @RequestMapping("/playing")
    public String playing(String car_num, Model model) {
        logger.info("11111111");
        logger.info(new Timestamp(System.currentTimeMillis()));
        logger.info(car_num);
        Temporary temporary = temporaryService.findByCar_num(car_num);
        logger.info(temporary.getTemporary_carnum());
        double d = new Timestamp(System.currentTimeMillis()).getTime();
        temporaryService.updateTime(temporary);

        double d2 = temporary.getApproach_time().getTime();
        double d3 = d - d2;
        temporary.setParking_fee(d3 * 5 / 1000 / 60 / 60);
        temporaryService.updateTime2(temporary);
        int d4 = (int)d3 * 5 / 1000 / 60 / 60;
        logger.info(carPortService.findByCar_num2(car_num));
        if (carPortService.findByCar_num2(car_num) == null) {
            logger.info(carPortService.findByCar_num2(car_num));
            model.addAttribute("d4", d4);
            return "owner/pay";
        } else {
            return "owner/main";
        }
}

    @RequestMapping("/playing2")
    public String playing2(String car_num, Model model) {
        logger.info("11111111");
        logger.info(new Timestamp(System.currentTimeMillis()));
        logger.info(car_num);
        Temporary temporary = temporaryService.findByCar_num(car_num);
        logger.info(temporary.getTemporary_carnum());
        double d = new Timestamp(System.currentTimeMillis()).getTime();
        temporaryService.updateTime(temporary);

        double d2 = temporary.getApproach_time().getTime();
        double d3 = d - d2;
        temporary.setParking_fee(d3 * 5 / 1000 / 60 / 60);
        temporaryService.updateTime2(temporary);
        int d4 = (int)d3 * 5 / 1000 / 60 / 60;
        logger.info(carPortService.findByCar_num2(car_num));
        if (carPortService.findByCar_num2(car_num) == null) {
            logger.info(carPortService.findByCar_num2(car_num));
            model.addAttribute("d4", d4);
            return "owner/pay2";
        } else {
            return "redirect:/owner/index.action";
        }
    }
}
