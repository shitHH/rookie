package com.property.interceptor;

import com.property.vo.OwnerVo1;
import org.apache.log4j.Logger;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author : Eeerosss
 * @create 2022/9/15 9:56
 * 登陆拦截器
 */
public class LoginInterceptor implements HandlerInterceptor {
    Logger logger = Logger.getLogger(LoginInterceptor.class);
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        logger.info("进入权限管理器");
        //获取session对象
        HttpSession session = httpServletRequest.getSession();
        //从会话中获取用户对象
        Object obj = session.getAttribute("currentOwner");
        if(obj!=null){
            OwnerVo1 ownerVo1 = (OwnerVo1)obj;
            logger.info(ownerVo1);
            return true;
        }else {
            logger.info("未登录");
        }
        //通过拦截器跳转到指定页面
        httpServletResponse.sendRedirect(httpServletRequest.getContextPath()+"/owner/index.action");
        return false;

    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
