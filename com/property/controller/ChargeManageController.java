package com.property.controller;

import com.property.po.Addedfee;
import com.property.po.Temporary;
import com.property.po.Village;
import com.property.service.AddedFeeService;
import com.property.service.PaymentService;
import com.property.service.TemporaryService;
import com.property.service.VillageService;
import com.property.vo.AddedfeeVO;
import com.property.vo.AdminVO;
import com.property.vo.PaymentVO2;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author : bugger
 * @create 2022/9/14 11:02
 * 收费管理的控制器
 */
@Controller
@RequestMapping("/admin")
public class ChargeManageController {
    Logger logger = Logger.getLogger(ChargeManageController.class);

    @Autowired
    VillageService villageService;

    @Autowired
    AddedFeeService addedFeeService;

    @Autowired
    PaymentService paymentService;

    @Autowired
    TemporaryService temporaryService;

    /*************************************************增值收入记录*****************************************************************/
    /***********************************************总经理权限********************************************************/
    /**
     * 增值费管理列表
     * @param model
     * @return
     */
    @RequestMapping("/prolist")
    public String prolist(Model model){
        logger.info("prolist action...");
        List<AddedfeeVO> list = addedFeeService.findVOAll();
        model.addAttribute("list",list);
        return "admin/pro_list";
    }

    /***********************************************管理员权限********************************************************/
    /**
     * 增值费管理列表
     * @param model
     * @return
     */
    @RequestMapping("/prolistbyvid")
    public String prolistByVid(int vid,Model model){
        logger.info("********************************prolistbyvid action************************************");
        List<AddedfeeVO> list = addedFeeService.findVOAllByVid(vid);
        model.addAttribute("list",list);
        return "admin/pro_list";
    }

    /**
     * 前往添加增值费的页面
     * @param model
     * @return
     */
    @RequestMapping("/goproadd")
    public String GoProAdd(HttpSession session, Model model){
        logger.info("goproadd action...");
        /*List<Village> list = villageService.findAll();
        model.addAttribute("list",list);*/
        AdminVO admin = (AdminVO)session.getAttribute("currentAdminVO");
        model.addAttribute("admin",admin);
        return "admin/pro_add";
    }

    /**
     * 添加增值费的控制器
     * @param addedfee
     * @return
     */
    @RequestMapping("/proadd")
    public String ProAdd(Addedfee addedfee){
        logger.info("proadd action...");
        boolean flag = addedFeeService.addAddedfee(addedfee);
        logger.info(flag);
        int vid = addedfee.getvillage_vid();
        return "redirect:/admin/prolistbyvid.action?vid="+vid;
    }

    /**
     * 前往增值记录更新页面
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("/goprolistupdate")
    public String goProListUpdate(int id,Model model){
        logger.info("***************************goprolistupdate action**********************");
        AddedfeeVO addedfee = addedFeeService.findVOById(id);
        List<Village> list = villageService.findAll();
        Map<String,Object> map = new HashMap<>();
        map.put("list",list);
        map.put("addedfee",addedfee);
        model.addAllAttributes(map);
        return "admin/prolistupdate";
    }

    /**
     * 更新增值收入
     * @param addedfee
     * @return
     */
    @RequestMapping("/prolistupdate")
    public String prolistUpdate(Addedfee addedfee){
        logger.info("*********************************prolistupdate action*****************************");
        boolean flag = addedFeeService.updateAddedfee(addedfee);
        logger.info("prolistupdate"+flag);
        int vid = addedfee.getvillage_vid();
        return "redirect:/admin/prolistbyvid.action?vid="+vid;
    }

    /*************************************************物业费缴费记录*****************************************************************/
    /***********************************************总经理权限********************************************************/
    /**
     * 物业费记录列表
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("/propertychargelist")
    public String PropertyChargeList(int id,Model model){
        logger.info("propertychargelist action...");
        List<PaymentVO2> list = paymentService.findByPaymenttypeid(id);
        model.addAttribute("list",list);
        return "admin/propertychargelist";
    }
    /***********************************************管理员权限********************************************************/
    /**
     * 物业费记录列表
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("/propertychargelistbyvid")
    public String propertyChargeListByVid(int vid,int id,Model model){
        logger.info("propertychargelistbyvid action...");
        List<PaymentVO2> list = paymentService.findByPaymenttypeidByVid(vid,id);
        model.addAttribute("list",list);
        return "admin/propertychargelist";
    }

    /*************************************************停车费缴费记录*****************************************************************/
    /***********************************************总经理权限********************************************************/
    /**
     * 停车费缴费记录列表
     * @param model
     * @return
     */
    @RequestMapping("/parkingfeelist")
    public String parkingFeeList(Model model){
        logger.info("*************************parkingfeelist action***********************");
        List<Temporary> list = temporaryService.findAll();
        for (Temporary temporary:list){
           String str= temporary.getTemporary_carnum().substring(0,7);
            temporary.setTemporary_carnum(str);
            logger.info(temporary);
        }
        model.addAttribute("list",list);
        return "admin/parkingfeelist";
    }
    /***********************************************管理员权限********************************************************/

}
