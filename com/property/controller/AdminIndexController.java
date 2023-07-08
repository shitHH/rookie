package com.property.controller;

import com.property.po.Inform;
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
 * @author bugger  chengxia
 * @date 2022-09-12 12:44
 */
@Controller
@RequestMapping("/admin")
public class AdminIndexController {
    Logger logger = Logger.getLogger(AdminIndexController.class);
    @Autowired
    VillageService villageService;

    @Autowired
    ComplaintService complaintService;

    @Autowired
    ComplaintListService complaintListService;

    @Autowired
    RepairsService repairsService;

    @Autowired
    RepairsListService repairsListService;
    @Autowired
    CountService countService;
    @Autowired
    PropertyService propertyService;
    @Autowired
    InformService informService;


    @RequestMapping("/toindex")
    public String index( Model model){

        logger.info("toindex action...");
        return "admin/index";
    }

    @RequestMapping("/toindex2")
    public String index2( Model model){

        logger.info("toindex action...");
        return "admin/index2";
    }

    /***************************************消息通知***********************************************/
    /**
     * 查找未处理的投诉数量
     * @return
     */
    @RequestMapping("/finddiscomplnum")
    @ResponseBody
    public int findDisComplNum(){
        logger.info("***********************finddiscomplnum action************************");
        int complaintNum = complaintService.findComplaintNum();
        int complaintListNum = complaintListService.findComplaintListNum();
        int result = complaintNum-complaintListNum;
        logger.info(result);
        return result;
    }

    @RequestMapping("/finddisrepairnum")
    @ResponseBody
    public int findDisRepairNum(){
        logger.info("***********************finddisrepairnum action************************");
        int repairNum = repairsService.findRepairNum();
        int repairListNum = repairsListService.findRepairListNum();
        int result = repairNum-repairListNum;
        logger.info(repairNum+"--"+repairListNum+"--"+result);
        return result;
    }
    @RequestMapping("/towelcome")
    public String toWelcome(CountVo countVo,Model model){
        logger.info("======================================towelcome======================================");
        List<InformVO> list1=informService.findVOAll();
        List<RepairsVO> list2=repairsService.findVOAll();
        List<VillageCountVo> list= villageService.findRoomCount();
        logger.info(list);
        countVo.setCarport_count(countService.findCarport_count());
        countVo.setOwner_count(countService.findOwner_count());
        countVo.setRoom_count(countService.findRoom_count());
        countVo.setLessee_count(countService.findLessee_count());
        model.addAttribute("countVo",countVo);
        model.addAttribute("list2",list2);
        model.addAttribute("list1",list1);
        model.addAttribute("list",list);
        return "admin/welcome";
    }
    @RequestMapping("/welcome")
    @ResponseBody
    public  List<VillageCountVo> welcome(){
        List<VillageCountVo> list= villageService.findRoomCount();
        logger.info(list);
        return list;
    }

    @RequestMapping("/chartsecond")
    @ResponseBody
    public Map<String, List> chartSecode() {
        Map<String, List> map = villageService.findStatBar();
        return map;
    }

    @RequestMapping("/welcome2")
    @ResponseBody
    public  List<ComplaintCountVo> welcome2(){
        List<ComplaintCountVo> list= complaintService.findComplaintCount();
        logger.info(list);
        return list;
    }
    @RequestMapping("/welcome3")
    @ResponseBody
    public Map<String, List> welcome3() {
        Map<String, List> map = propertyService.findPropertyCount2();
        return map;
    }
}
