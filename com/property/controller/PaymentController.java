package com.property.controller;

import com.mysql.cj.Session;
import com.property.po.Owner;
import com.property.po.Payment;
import com.property.service.PaymentService;
import com.property.vo.PaymentVo;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * author: Eeerosss
 * date: 2022/9/12 16:34
 * 缴费记录控制器
 */
@Controller
@RequestMapping("/owner")
public class PaymentController {

    @Autowired
    PaymentService paymentService;
    Logger logger = Logger.getLogger(PaymentController.class);

    @RequestMapping("/toaddpayment_s")
    public String toAddPayment_s(){
        logger.info("去添加水费缴费记录控制器");
        return "owner/addpayment_s";
    }

    @RequestMapping("/zongfei_s")
    @ResponseBody
    public  int  addpayment_s(int payment_mon){
        logger.info(payment_mon);
        int payment_sum=payment_mon*50;
        return payment_sum;
    }
    @RequestMapping("/addpayment_s")
    public String addpayment_s(Payment payment){
        logger.info("进入交水费控制器");
        logger.info(payment);
        boolean fg= paymentService.addPayment(payment);
        logger.info(fg);
        return "redirect:tomain.action";
    }

    @RequestMapping("/toaddpayment_wy")
    public String toAddPayment_wy(){
        logger.info("去添加物业费缴费记录控制器");
        return "owner/addpayment_wy";
    }
    @RequestMapping("/zongfei_wy")
    @ResponseBody
    public  int  addpayment_wy(int payment_mon){
        logger.info(payment_mon);
        int payment_sum=payment_mon*400;
        return payment_sum;
    }
    @RequestMapping("/addpayment_wy")
    public String addpayment_wy(Payment payment){
        logger.info("进入交物业费控制器");
        logger.info(payment);
        boolean fg= paymentService.addPayment(payment);
        logger.info(fg);
        return "redirect:tomain.action";
    }

    @RequestMapping("/paymentlist")
    public String PaymentList(Model model,Owner owner){
        logger.info("进入缴费列表控制器");
        logger.info(owner.getOwner_id());
        List<PaymentVo> list = paymentService.findByOwner_id(owner.getOwner_id());
        model.addAttribute("list",list);
        return "owner/paymentlist";
    }
}
