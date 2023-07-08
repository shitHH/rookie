package com.property.controller;

import com.property.po.Inform;
import com.property.po.Owner;
import com.property.service.InformService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author : Eeerosss
 * @create 2022/9/14 10:55
 * 公告控制器
 */
@Controller
@RequestMapping("/owner")
public class InformController {
    @Autowired
    InformService informService;
    Logger logger = Logger.getLogger(InformController.class);
    @RequestMapping("/informlist")
    public String informList(Model model , Inform inform){
        logger.info("进入公告控制器");
        List<Inform> list = informService.findByVid(inform.getVillage_vid());
        model.addAttribute("list",list);
        return "owner/informlist";
    }
}
