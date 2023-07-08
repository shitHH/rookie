package com.property.controller;

import com.property.po.Hcode;
import com.property.po.Owner;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 梁三岁
 * @name ：疫情防控控制器
 * @create 2022/9/13 16:32
 */
@Controller
@RequestMapping("/owner")
public class EpidemicController {
    @Autowired
    TravelReportService travelReportService;
    @Autowired
    HcodeService hcodeService;
    Logger logger = Logger.getLogger(EpidemicController.class);

    /****************************************返省上报****************************************/
    @RequestMapping("/totravelreport")
    public String totravelreport() {
        logger.info("=====================totravelreport=====================");
        return "owner/travelreport";
    }

    @RequestMapping("/travelreport")
    public String travelreport(TravelReport travelReport) {
        logger.info("=====================travelreport=====================");
        travelReportService.addTravelReport(travelReport);
        return "redirect:/owner/tomain.action";
    }

    @RequestMapping("/tohcode")
    public String tohcode() {
        logger.info("=====================tohcode=====================");
        return "owner/hcode";
    }
    /****************************************返省上报****************************************/
    @RequestMapping("/travelist")
    public String travelist(Model model, Owner owner){
        logger.info("=====================travelist=====================");
    List<TravelreportVo> list =  travelReportService.findByowner_id(owner.getOwner_id());
    model.addAttribute("list",list);
        return "owner/travelist";
    }
    /****************************************红黄码上报****************************************/
    @RequestMapping("/hcode.action")
    public String hcode(@RequestParam("files") CommonsMultipartFile file, Hcode hcode) {
        logger.info("=====================hcode=====================");
        if (file.getSize() > 0) {
            try {
                String names = this.creatName(file.getOriginalFilename());
                String path = "D:" + File.separator + "dir" + File.separator + names;
                File file1 = new File(path);
                file.transferTo(file1);
                hcode.setHcode_jpg(names);
                boolean fg = hcodeService.add(hcode);
                logger.info(fg);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        return "redirect:/owner/tomain.action";
    }

    private String creatName(String names) {
        //获得文件名.之前的字符串
        String caselsh = names.substring(0, names.lastIndexOf("."));
        //获得文件的后缀名
        String suffix = names.substring(names.lastIndexOf("."));
        int n = (int) (Math.random() * 100000 + 1);
        String newName = caselsh + System.currentTimeMillis() + n + suffix;

        return newName;
    }
    /****************************************红黄码上报记录****************************************/
    @RequestMapping("/hcodelist.action")
    public String hcodeList(Model model, Owner owner) {
        logger.info("=====================hcodelist=====================");
        List<HcodeVo> list = hcodeService.findByOwner_id(owner.getOwner_id());
        model.addAttribute("list", list);
        return "owner/hcodelist";

    }

}
