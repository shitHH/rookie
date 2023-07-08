package com.property.controller;

import com.property.po.Admin;
import com.property.po.Inform;
import com.property.po.Owner;
import com.property.po.Village;
import com.property.service.*;
import com.property.vo.*;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 梁三岁
 * @name ：小区图标统计控制器
 * @create 2022/9/16 11:47
 */
@Controller
@RequestMapping("/admin")
public class EchartsController {
    Logger logger = Logger.getLogger(EchartsController.class);
    @Autowired
    ParkingService parkingService ;
    @Autowired
    VillageService villageService ;
    @Autowired
    OwnerService ownerService ;
    @Autowired
    CarPortService carPortService ;
    @Autowired
    InformService informService;
    @Autowired
    RepairsListService repairsListService ;
    @RequestMapping("/towelcomebyvid")
    public String toWelcomeByVid(HttpSession session ,Model model){
    AdminVO adminVO =(AdminVO) session.getAttribute("currentAdminVO");
        logger.info("================================toWelcomeByVid================================");
        logger.info(adminVO.getVillage_vid());
        CountVoVid countVoVid1 =carPortService .findCount(adminVO.getVillage_vid());
        CountVoVid countVoVid2 = villageService.findRCount(adminVO.getVillage_vid());
        CountVoVid countVoVid3 = ownerService.findSum(adminVO.getVillage_vid());
        CountVoVid countVoVid4 = ownerService.findLSum(adminVO.getVillage_vid());
        List<InformVO> list1=   informService.findInformlist(adminVO.getVillage_vid());
        logger.info(list1);
        List<RepairsListVid> list2= repairsListService.findRepairslist(adminVO.getVillage_vid());
        logger.info(list2);
        model.addAttribute("countVoVid1",countVoVid1);
        model.addAttribute("countVoVid2",countVoVid2);
        model.addAttribute("countVoVid3",countVoVid3);
        model.addAttribute("countVoVid4",countVoVid4);
        model.addAttribute("list1",list1);
        model.addAttribute("list2",list2);
        return "admin/welcomebyvid";
    }

    @RequestMapping("/welcomebyvid")
    @ResponseBody
    public List<OwnerSumVo> welcomebyvid(HttpSession session){
        AdminVO adminVO =(AdminVO) session.getAttribute("currentAdminVO");
        logger.info(adminVO.getVillage_vid());
        List<OwnerSumVo> list=ownerService.findSumVo(adminVO.getVillage_vid());
        return list;
    }

    @RequestMapping("/findcarportsum")
    @ResponseBody
    public Map<String, List> findCarportSum(HttpSession session){
        AdminVO adminVO =(AdminVO) session.getAttribute("currentAdminVO");
        Map<String,List> map =carPortService.findStatBar(adminVO.getVillage_vid());
        return map;
    }

}
