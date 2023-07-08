package com.property.controller;
import com.property.po.Owner;
import com.property.po.Repairs;
import com.property.service.RepairsListService;
import com.property.service.RepairsService;
import com.property.vo.RepairsVO;
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
 * author: Eeerosss
 * date: 2022/9/12 11:45
 * 线上保修控制器
 */

@Controller
@RequestMapping("/owner")
public class RepairsController {
    @Autowired
    RepairsService repairsService;
    @Autowired
    RepairsListService repairsListService;
    Logger logger=Logger.getLogger(RepairsController.class);

    @RequestMapping("/toaddrepairs.action")
    public String toAddRepairs(){
        logger.info("去添加线上报修控制器");
        return "owner/addrepairs";
    }

    @RequestMapping("/addrepairs.action")
    public String addRepairs(@RequestParam("file") CommonsMultipartFile file, Repairs repairs){
        logger.info("进入报修控制器");
            if (file.getSize() > 0) {
                try {
                    String path = "D:" + File.separator + "dir" + File.separator + file.getOriginalFilename();
                    File file1 = new File(path);
                    file.transferTo(file1);
                    repairs.setRepairs_jpg(file.getOriginalFilename());
                    boolean fg=repairsService.addRepairs(repairs);
                    logger.info(fg);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        return "redirect:/owner/tomain.action";
    }

    @RequestMapping("/repairslist.action")
    public String repairsList(Model model, Owner owner){
        logger.info("进入报修列表控制器");
        List<RepairsVO> list = repairsService.findByOwner_id(owner.getOwner_id());
        model.addAttribute("list",list);
        return "owner/repairslist";

    }

}
