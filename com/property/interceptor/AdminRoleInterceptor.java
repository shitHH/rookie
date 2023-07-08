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
 * @ClassName ：管理端角色拦截器(总经理)
 * @CreateTime 2022/9/18 10:00
 */
public class AdminRoleInterceptor implements HandlerInterceptor {

    Logger logger=Logger.getLogger(AdminRoleInterceptor.class);


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {
        logger.info("============进入  管理端角色拦截器  前=============");
        //1.得到session对象
        HttpSession session = request.getSession();
        //2.得到当前登陆的管理员对象
        AdminVO adminVO=(AdminVO)session.getAttribute("currentAdminVO");
        //3.判断是否登陆
        if(adminVO!=null){
            //说明已经登陆
            logger.info(adminVO.getAdmin_name()+":管理员已经登陆");
            //得到当前登陆人的角色
            int admin_rid = adminVO.getAdmin_rid();
            logger.info(admin_rid);
            if (admin_rid==3){
                //总经理角色
                logger.info("当前管理员已经登陆，角色是："+adminVO.getAdmin_rname());
                return true;
            }else {
                //非总经理角色 重定向 去登陆
                logger.info("当前管理员已经登陆，角色是："+adminVO.getAdmin_rname()+",权限不够！");
                String str=request.getContextPath()+"/admin/tologin.action";
                response.sendRedirect(str);
                return  false;
            }
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
