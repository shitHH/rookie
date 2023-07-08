package com.property.controller;

import com.property.po.Owner;
import com.property.service.ActivityService;
import com.property.vo.ActivityVo1;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 梁三岁
 * @name ：活动控制器
 * @create 2022/9/14 14:02
 */
@Controller
@RequestMapping("/owner")
public class OwnerActivityController {
    @Autowired
    ActivityService activityService ;
Logger logger = Logger.getLogger(OwnerActivityController.class);
    @RequestMapping("/activitylist")
    public String activitylist(Owner owner, Model model ) {
        logger.info("========================================activitylist========================================");
     List<ActivityVo1> list= activityService.findByOwner_id(owner.getOwner_id());
     logger.info(list);
     model.addAttribute("list",list);
        return "owner/activitylist";
    }
}
