package com.property.interceptor;

import com.property.vo.AdminVO;
import org.apache.log4j.Logger;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : chengxia
 * @ClassName ：管理员登陆状态拦截器
 * @CreateTime 2022/9/15 15:47
 */
public class AdminLoginStatedInterceptor implements HandlerInterceptor {

    Logger logger= Logger.getLogger(AdminLoginStatedInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {
        logger.info("=======进入 管理员登陆状态验证 拦截器  =====前====");
        //1.得到session对象
        HttpSession session = request.getSession();
        //2.得到当前登陆的管理员对象
        AdminVO adminVO=(AdminVO)session.getAttribute("currentAdminVO");
        //3.判断管理员是否登陆
        if(adminVO!=null){
            //说明已经登陆
            logger.info(adminVO.getAdmin_name()+":管理员已经登陆");
            return true;
        }else {
            //说明未登陆，重定向 去登陆
            logger.info("未登陆。。。。");
            String str=request.getContextPath()+"/admin/tologin.action";
            response.sendRedirect(str);
            return false;
        }

    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}