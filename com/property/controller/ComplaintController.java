package com.property.controller;

import com.property.po.Complaint;
import com.property.po.ComplaintList;
import com.property.po.Owner;
import com.property.service.ComplaintListService;
import com.property.service.ComplaintService;
import com.property.vo.ComplaintVO;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author : Eeerosss
 * @create 2022/9/14 9:03
 * 投诉控制器
 */
@Controller
@RequestMapping("/owner")
public class ComplaintController {
    Logger logger = Logger.getLogger(ComplaintController.class);
    @Autowired
    ComplaintService complaintService;


    @RequestMapping("/toaddcomplaint")
    public String toAddComplaint() {
        logger.info("进入去投诉控制器");
        return "owner/addcomplaint";
    }

    @RequestMapping("/addcomplaint")
    public String addComplaint(Complaint complaint) {
        logger.info("进入投诉控制器");
        boolean fg = complaintService.add(complaint);
        logger.info(fg);
        return "redirect:/owner/tomain.action";
    }

    @RequestMapping("/complaintlist")
    public String complaintList(Model model, Owner owner) {
        logger.info("进入投诉受理查询");
        List<ComplaintVO> list =complaintService.findByOwnerId(owner.getOwner_id());
        model.addAttribute("list",list);
        return "owner/complaintlist";
    }
}
