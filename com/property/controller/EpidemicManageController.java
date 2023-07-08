package com.property.controller;

import com.property.po.Hcode;
import com.property.po.TravelReport;
import com.property.service.HcodeService;
import com.property.service.TravelReportService;
import com.property.vo.HcodeVo;
import com.property.vo.TravelreportVo;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Author : bugger
 * @create 2022/9/14 13:59
 * 疫情管理控制器
 */
@Controller
@RequestMapping("/admin")
public class EpidemicManageController {

    Logger logger = Logger.getLogger(EpidemicManageController.class);

    @Autowired
    TravelReportService travelReportService;

    @Autowired
    HcodeService hcodeService;

    /**************************************************返省上报管理***********************************************************/
    /***********************************************总经理权限********************************************************/
    /**
     * 返省上报列表
     * @param model
     * @return
     */
    @RequestMapping("/travellist")
    public String TravelList(Model model){
        logger.info("prolist action...");
        List<TravelreportVo> list = travelReportService.findVOAll();
        model.addAttribute("list",list);
        return "admin/travellist";
    }

    /***********************************************管理员权限********************************************************/
    /**
     * 根据小区编号查询返省上报列表
     * @param model
     * @return
     */
    @RequestMapping("/travellistbyvid")
    public String travelListByVid(int vid,Model model){
        logger.info("****************************travellistbyvid action****************************");
        List<TravelreportVo> list = travelReportService.findVOAllByVid(vid);
        model.addAttribute("list",list);
        return "admin/travellist";
    }

    /**************************************************健康码管理***********************************************************/
    /***********************************************总经理权限********************************************************/
    /**
     * 查询健康码管理列表
     * @param model
     * @return
     */
    @RequestMapping("/hcodelist")
    public String HcodeList(Model model){
        logger.info("hcodelist action...");
        List<HcodeVo> list = hcodeService.findVOAll();
        model.addAttribute("list",list);
        return "admin/hcodelist";
    }

    /***********************************************管理员权限********************************************************/
    /**
     * 查询健康码管理列表
     * @param model
     * @return
     */
    @RequestMapping("/hcodelistbyvid")
    public String hcodeListByVid(int vid,Model model){
        logger.info("hcodelistbyvid action...");
        List<HcodeVo> list = hcodeService.findVOAllByVid(vid);
        model.addAttribute("list",list);
        return "admin/hcodelist";
    }

}
