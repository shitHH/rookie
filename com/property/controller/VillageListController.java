package com.property.controller;

import com.property.po.Village;
import com.property.service.BuildingService;
import com.property.service.OwnerService;
import com.property.service.RoomService;
import com.property.service.VillageService;
import com.property.vo.OwnerVO;
import com.property.vo.VillageVO;
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
 * @CreateTime：2022/9/12 001216:39
 */
@Controller
@RequestMapping("/admin")
public class VillageListController {
    Logger logger = Logger.getLogger(VillageListController.class);
    @Autowired
    VillageService villageService;
    @Autowired
    BuildingService buildingService;
    @Autowired
    OwnerService ownerService;
    @RequestMapping("/tovillagelist")
    public String tovillagelist(Model model){
        logger.info("前往小区列表");
        List<VillageVO> list = villageService.findAllVO();
        model.addAttribute("list",list);
        return "admin/villagelist";
    }
    @RequestMapping("/roomlist")
    public String roomlist(int village_vid,Model model){
        logger.info("前往房产管理控制器");
        List<OwnerVO> list = ownerService.findByVidVO(village_vid);
        model.addAttribute("list",list);
        return "admin/roomlist";
    }
}
