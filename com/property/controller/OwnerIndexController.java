package com.property.controller;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 梁三岁
 * @name ：业主首页控制器
 * @create 2022/9/13 10:07
 */

import com.property.util.Captcha;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Date;
import java.util.Map;

@Controller
@RequestMapping("/owner")
public class OwnerIndexController {

    @RequestMapping("/index")
    public String index(){
        return "owner/index";
    }

    @RequestMapping("/tomain")
    public String toMain(){
        return "owner/main";
    }
    @RequestMapping("/captcaha")
    public void captcaha(HttpServletRequest request, HttpServletResponse response){
        try {
            response.setDateHeader("Expires", 0);
            response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");
            response.addHeader("Cache-Control", "post-check=0, pre-check=0");
            response.setHeader("Pragma", "no-cache");
            response.setContentType("image/jpeg");
            HttpSession session = request.getSession();
            OutputStream os = response.getOutputStream();
            // 返回验证码和图片的map
            Map<String, Object> map = Captcha.getImageCode(86, 37, os);
            String simpleCaptcha = "simpleCaptcha";
            session.setAttribute(simpleCaptcha, map.get("strEnsure").toString().toLowerCase());
            session.setAttribute("codeTime", new Date().getTime());
            ImageIO.write((BufferedImage) map.get("image"), "jpg", os);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
