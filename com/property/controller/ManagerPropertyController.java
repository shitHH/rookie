package com.property.controller;

import com.property.po.Property;
import com.property.service.PropertyService;
import com.property.service.VillageService;
import com.property.vo.PropertyVO;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : CD
 * @ClassName ：
 * @CreateTime 2022/9/13 11:48
 */
@Controller
@RequestMapping("/admin/manager")
public class ManagerPropertyController {
    @Autowired
    PropertyService propertyService;
    @Autowired
    VillageService villageService;
    Logger logger = Logger.getLogger(VillageListController.class);
    @RequestMapping("/topropertylist")
    public String topropertylist(Model model){
        logger.info("前往资产列表控制器");
        List<PropertyVO> list = propertyService.findAllVOM();
        model.addAttribute("list",list);
        return "admin/propertylist";
    }
    @RequestMapping("/topropertyadd")
    public String topropertyadd(){
        logger.info("前往资产添加控制器");
        return "admin/propertyadd";
    }
    @RequestMapping("/propertyadd")
    public String propertyadd(int village_vid,Property property){
        logger.info("资产添加控制器");
        propertyService.addProperty(property);
        return "redirect:/admin/topropertylist.action?village_vid="+village_vid;
    }
    @RequestMapping("/deleteproperty")
    public String deleteproperty(int village_vid,int[] ids){
        logger.info(ids);
        logger.info(Arrays.toString(ids));
        propertyService.deleteProperty(ids);
        return "redirect:/admin/topropertylist.action?village_vid="+village_vid;
    }
}
