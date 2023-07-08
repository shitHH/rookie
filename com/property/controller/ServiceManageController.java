package com.property.controller;

import com.property.po.*;
import com.property.service.*;
import com.property.vo.*;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author bugger
 * @date 2022-09-12 14:25
 */
@Controller
@RequestMapping("/admin")
public class ServiceManageController {
    Logger logger = Logger.getLogger(ServiceManageController.class);

    @Autowired
    ActivityService activityService;

    @Autowired
    VillageService villageService;

    @Autowired
    InformService informService;

    @Autowired
    RepairsService repairsService;

    @Autowired
    RepairsListService repairsListService;

    @Autowired
    ComplaintService complaintService;

    @Autowired
    ComplaintListService complaintListService;

    @Autowired
    AdminService adminService;

/**************************************************这是活动模块开始*****************************************************************/
    /***********************************************公共权限********************************************************/
    @RequestMapping("/activityinfo")
    public String activityInfo(int id,Model model){
        logger.info("activityinfo action...");
        ActivityVO activity = activityService.findVOById(id);
        model.addAttribute("activity",activity);
        return "admin/activityinfo";
    }

    /***********************************************总经理权限********************************************************/
    /**
     * 前往活动列表的链接地址的控制器
     * @return
     */
    @RequestMapping("/goactivitylist")
    public String goActivityList(){
        logger.info("goactivitylist action...");
        return "redirect:/admin/activitylist.action";
    }

    /**
     * 活动管理列表控制器
     * @param model
     * @return
     */
    @RequestMapping("/activitylist")
    public String activityList(Model model){
        logger.info("activitylist action...");
        List<ActivityVO> list = activityService.findVOAll();
        model.addAttribute("list",list);
        return "admin/activitylist";
    }

    /**
     * 根据活动标题查找活动记录
     * @param title
     * @param model
     * @return
     */
    @RequestMapping("/findactivitybytitle")
    public String findActivityByTitle(String title,Model model){
        logger.info("findactivitybytitle action...");
        List<ActivityVO> list =  activityService.findByAtitle(title);
        model.addAttribute("list",list);
        for (ActivityVO activityVO:list){
            logger.info(activityVO);
        }
        return "admin/activitylist";
    }

    /**
     * 根据举办地点查询活动记录
     * @param title
     * @param model
     * @return
     */
    @RequestMapping("/findactivitybytitleaddrcomp")
    public String findByTitleAddrComp(String title,String addr,String comp,Model model){
        logger.info("findactivitybytitleaddrcomp action...");
        List<ActivityVO> list =  activityService.findByTitleAddrComp(title,addr,comp);
        Map<String,Object> map = new HashMap<>();
        logger.info("params:"+title+addr+comp);
        map.put("list",list);
        map.put("title",title);
        map.put("addr",addr);
        map.put("comp",comp);
        model.addAllAttributes(map);
        return "admin/activitylist";
    }

    /**
     * 根据活动状态查询活动
     * @param stat
     * @param model
     * @return
     */
    @RequestMapping("/findactivitybystat")
    public String findByStat(String stat,Model model){
        logger.info("******************************findactivitybystat action****************************");
        List<ActivityVO> list =  activityService.findVOByStat(stat);
        model.addAttribute("list",list);
        for (ActivityVO activityVO:list){
            logger.info(activityVO);
        }
        return "admin/activitylist";
    }

    /***********************************************管理员权限********************************************************/
    /**
     * 根据小区编号查询所有的活动
     * @param vid
     * @param model
     * @return
     */
    @RequestMapping("/activitylistbyvid")
    public String findAllByVid(int vid,Model model){
        logger.info("******************************activitylistbyvid action****************************");
        List<ActivityVO> list =  activityService.findAllByVid(vid);
        model.addAttribute("list",list);
        return "admin/activitylist";
    }

    /**
     * 前往添加活动的表单页面
     * @param model
     * @return
     */
    @RequestMapping("/goactivityadd")
    public String goActivityAdd(HttpSession session,Model model){
        logger.info("************************goactivityadd action*********************");
        /*List<Village> list = villageService.findAll();
        model.addAttribute("list",list);*/
        AdminVO admin = (AdminVO)session.getAttribute("currentAdminVO");
        model.addAttribute("admin",admin);
        logger.info(admin.getAdmin_name()+"--"+admin.getVillage_vid());
        return "admin/activityadd";
    }

    /**
     * 添加活动的控制器
     * @param
     * @return
     */
    @RequestMapping("/activityadd")
    public String activityAdd(HttpSession session,Activity activity){
        logger.info("activityadd action...");
        boolean flag = activityService.addActivity(activity);
        logger.info("添加"+flag);
        AdminVO admin = (AdminVO)session.getAttribute("currentAdminVO");
        int vid = admin.getVillage_vid();
        return "redirect:/admin/activitylistbyvid.action?vid="+vid;
    }

    /**
     * 前往活动更新的页面
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("/goactivityupdate")
    public String goActivityUpdate(int id,HttpSession session,Model model){
        logger.info("goactivityupdate action...");
        AdminVO admin = (AdminVO)session.getAttribute("currentAdminVO");
        model.addAttribute("admin",admin);
        /*List<Village> list = villageService.findAll();
        model.addAttribute("list",list);*/
        ActivityVO activity = activityService.findVOById(id);
        model.addAttribute("activity",activity);
        return "admin/activityupdate";
    }

    /**
     * 活动更新功能的控制器
     * @param activity
     * @return
     */
    @RequestMapping("/activityupdate")
    public String activityUpdate(HttpSession session,Activity activity){
        logger.info("activityupdate action...");
        boolean flag = activityService.updateActivity(activity);
        logger.info(flag);
        AdminVO admin = (AdminVO)session.getAttribute("currentAdminVO");
        int vid = admin.getVillage_vid();
        return "redirect:/admin/activitylistbyvid.action?vid="+vid;
    }

    /**
     * 普通管理员根据小区权限和举办地点查询活动记录
     * @param title
     * @param model
     * @return
     */
    @RequestMapping("/findactivitybytitleaddrcompvid")
    public String findByTitleAddrCompVid(HttpSession session,String title,String addr,String comp,Model model){
        logger.info("*************************findactivitybytitleaddrcompvid action***********************");
        AdminVO admin = (AdminVO)session.getAttribute("currentAdminVO");
        int vid = admin.getVillage_vid();
        List<ActivityVO> list =  activityService.findByTitleAddrCompVid(title,addr,comp,vid);
        Map<String,Object> map = new HashMap<>();
        logger.info("params:"+title+addr+comp);
        map.put("list",list);
        map.put("title",title);
        map.put("addr",addr);
        map.put("comp",comp);
        model.addAllAttributes(map);
        return "admin/activitylist";
    }

    /**
     * 普通管理员根据活动状态查询活动
     * @param stat
     * @param model
     * @return
     */
    @RequestMapping("/findactivitybystatvid")
    public String findByStatVid(String stat,HttpSession session,Model model){
        logger.info("******************************findactivitybystatvid action****************************");
        AdminVO admin = (AdminVO)session.getAttribute("currentAdminVO");
        int vid = admin.getVillage_vid();
        List<ActivityVO> list =  activityService.findVOByStatVid(stat,vid);
        model.addAttribute("list",list);
        return "admin/activitylist";
    }

/**************************************************这是活动模块结束*****************************************************************/

/**************************************************这是通知模块开始*****************************************************************/
    /***********************************************总经理权限********************************************************/
    /**
     * 通知公告列表控制器
     * @param model
     * @return
     */
    @RequestMapping("/informlist")
    public String InformList(Model model){
        logger.info("*************************informlist action*************************");
        List<InformVO> list = informService.findVOAll();
        model.addAttribute("list",list);
        return "admin/informlist";
    }

    /***********************************************管理员权限********************************************************/
    /**
     * 根据小区编号通知公告列表控制器
     * @param model
     * @return
     */
    @RequestMapping("/informlistbyvid")
    public String informList(int vid,Model model){
        logger.info("*************************informlistbyvid action*************************");
        List<InformVO> list = informService.findVOAllByVid(vid);
        model.addAttribute("list",list);
        return "admin/informlist";
    }

    /**
     * 前往通知添加页面
     * @param model
     * @return
     */
    @RequestMapping("/goinformadd")
    public String GoInformAdd(HttpSession session,Model model){
        logger.info("goinformadd action...");
        /*List<Village> list = villageService.findAll();
        model.addAttribute("list",list);*/
        AdminVO admin = (AdminVO)session.getAttribute("currentAdminVO");
        model.addAttribute("admin",admin);
        return "admin/informadd";
    }

    /**
     * 添加公告控制器
     * @param inform 公告通知对象
     * @return 字符串
     */
    @RequestMapping("/informadd")
    public String InformAdd(Inform inform){
        logger.info("informadd action...");
        boolean flag = informService.add(inform);
        logger.info("informadd"+flag);
        int vid = inform.getVillage_vid();
        return "redirect:/admin/informlistbyvid.action?vid="+vid;
    }

    /**
     * 前往公告更新页面
     * @param id 公告编号
     * @param model 作用域
     * @return 字符串
     */
    @RequestMapping("/goinformupdate")
    public String GoInformUpdate(int id,HttpSession session,Model model){
        logger.info("*********************goinformupdate action**********************");
        List<Village> list = villageService.findAll();
        InformVO informVO = informService.findVOById(id);
        Map<String,Object> map = new HashMap<>();
        AdminVO admin = (AdminVO)session.getAttribute("currentAdminVO");
        map.put("admin",admin);
        map.put("list",list);
        map.put("informVO",informVO);
        model.addAllAttributes(map);
        return "admin/informupdate";
    }

    /**
     * 公告更新
     * @param inform 公告对象
     * @return 字符串
     */
    @RequestMapping("/informupdate")
    public String InformUpdate(Inform inform){
        logger.info("****************************informupdate action****************************");
        boolean flag = informService.update(inform);
        logger.info(flag);
        int vid = inform.getVillage_vid();
        return "redirect:/admin/informlistbyvid.action?vid="+vid;
    }

/**************************************************这是通知模块结束*****************************************************************/
/**************************************************这是报修模块开始*****************************************************************/
    /***********************************************总经理权限********************************************************/
    /**
     * 报修列表页面
     * @param model
     * @return
     */
    @RequestMapping("/repair")
    public String Repair(Model model){
        logger.info("repair action...");
        List<Repairs> list = repairsService.findAll();
        List<Integer> arrlist = new ArrayList<>();
        for (Repairs repairs:list){
            int id = repairs.getRepairs_id();
            RepairsListVo repairsList = repairsListService.findByRepairs_id(id);
            if (repairsList==null){
                arrlist.add(id);
            }else {
                arrlist.add(-1);
            }
        }
        Map<String,Object> map = new HashMap<>();
        map.put("list",list);
        map.put("arrlist",arrlist);
        model.addAllAttributes(map);
        return "admin/repair";
    }

    /***********************************************管理员权限********************************************************/
    /**
     * 报修列表页面
     * @param model
     * @return
     */
    @RequestMapping("/repairbyvid")
    public String repairByVid(int vid,Model model){
        logger.info("**************************************repairbyvid action***********************************");
        List<RepairsVO> list = repairsService.findAllByVid(vid);
        List<Integer> arrlist = new ArrayList<>();
        for (RepairsVO repairs:list){
            int id = repairs.getRepairs_id();
            RepairsListVo repairsList = repairsListService.findByRepairs_id(id);
            if (repairsList==null){
                arrlist.add(id);
            }else {
                arrlist.add(-1);
            }
        }
        Map<String,Object> map = new HashMap<>();
        map.put("list",list);
        map.put("arrlist",arrlist);
        model.addAllAttributes(map);
        return "admin/repair";
    }

    /**
     * 前往报修记录添加页面
     * @param model
     * @return
     */
    @RequestMapping("/gorepairlistadd")
    public String GoRepairListAdd(int id,Model model){
        logger.info("gorepairlistadd action...");
        List<Admin> list = adminService.findAll();
        Repairs repairs = repairsService.findByRepairs_id(id);
        Map<String,Object> map = new HashMap<>();
        map.put("list",list);
        map.put("repairs",repairs);
        model.addAllAttributes(map);
        return "admin/repairlistadd";
    }

    /**
     * 报修记录添加
     * @param repairsList
     * @return
     */
    @RequestMapping("/repairlistadd")
    public String RepairListAdd(HttpSession session,RepairsList repairsList){
        logger.info("repairlistadd action...");
        logger.info(repairsList);
        boolean flag = repairsListService.addRepairsList(repairsList);
        logger.info(flag);
        AdminVO admin = (AdminVO)session.getAttribute("currentAdminVO");
        int vid = admin.getVillage_vid();
        return "redirect:/admin/repairbyvid.action?vid="+vid;
    }

/**************************************************这是报修模块开始*****************************************************************/
/**************************************************这是报修记录模块开始*****************************************************************/

    /**
     * 报修记录列表页面
     * @param model
     * @return
     */
    @RequestMapping("/repairlist")
    public String RepairList(Model model){
        logger.info("repairlist action...");
        List<RepairsVO> list = repairsService.findVOAll();
        model.addAttribute("list",list);
        return "admin/repairlist";
    }

    /**
     * 前往报修记录添加页面
     * @param model
     * @return
     */
    @RequestMapping("/gorepairadd")
    public String GoRepairAdd(Model model){
        logger.info("gorepairadd action...");
        List<Repairs> list = repairsService.findAll();
        model.addAttribute("list",list);
        return "admin/repairadd";
    }


    /***********************************************管理员权限********************************************************/
    /**
     * 报修记录列表页面
     * @param model
     * @return
     */
    @RequestMapping("/repairlistbyvid")
    public String repairListByVid(int vid,Model model){
        logger.info("repairlistbyvid action...");
        List<RepairsVO> list = repairsService.findVOAllByVid(vid);
        model.addAttribute("list",list);
        return "admin/repairlist";
    }

    /**
     * 前往报修记录信息的更新页面
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("/gorepairupdate")
    public String GoRepairUpdate(int id,Model model){
        logger.info("gorepairupdate action...");
        RepairsVO repairs = repairsService.findVOByRepairs_id(id);
        model.addAttribute("repairs",repairs);
        return "admin/repairupdate";
    }

    /**
     * 更新报修记录信息
     * @return
     */
    @RequestMapping("/repairupdate")
    public String RepairUpdate(HttpSession session,RepairsList repairsList){
        logger.info("repairupdate action...");
        boolean flag = repairsListService.updateRepairsList(repairsList);
        logger.info("repairupdate"+flag);
        AdminVO admin = (AdminVO)session.getAttribute("currentAdminVO");
        int vid = admin.getVillage_vid();
        return "redirect:/admin/repairlistbyvid.action?vid="+vid;
    }

/**************************************************这是报修记录模块结束*****************************************************************/

/**************************************************这是投诉模块开始*****************************************************************/
    /***********************************************总经理权限********************************************************/

    /**
     * 投诉列表控制器
     * @param model
     * @return
     */
    @RequestMapping("/complain")
    public String Complain(Model model){
        logger.info("complain action...");
        List<Complaint> list = complaintService.findAll();
        List<Integer> arrlist = new ArrayList<>();
        for (Complaint complaint:list){
            int id = complaint.getComplaint_id();
            ComplaintVO complaintVO = complaintService.findVOById(id);
            if (complaintVO==null){
                arrlist.add(id);
            }else {
                arrlist.add(-1);
            }
        }
        Map<String,Object> map = new HashMap<>();
        map.put("list",list);
        map.put("arrlist",arrlist);
        model.addAllAttributes(map);
        return "admin/complain";
    }

    /***********************************************管理员权限********************************************************/
    /**
     * 管理员投诉列表控制器
     * @param model
     * @return
     */
    @RequestMapping("/complainbyvid")
    public String ComplainByVid(int vid,Model model){
        logger.info("********************************************complainbyvid action*************************************************");
        List<ComplaintVO> list = complaintService.findAllByVid(vid);
        List<Integer> arrlist = new ArrayList<>();
        for (ComplaintVO complaint:list){
            int id = complaint.getComplaint_id();
            ComplaintVO complaintVO = complaintService.findVOById(id);
            if (complaintVO==null){
                arrlist.add(id);
            }else {
                arrlist.add(-1);
            }
        }
        Map<String,Object> map = new HashMap<>();
        map.put("list",list);
        map.put("arrlist",arrlist);
        model.addAllAttributes(map);
        logger.info(map.toString());
        return "admin/complain";
    }

    /**
     * 前往投诉添加的页面
     * @param model
     * @return
     */
    @RequestMapping("/gocomplaintadd")
    public String GoComplaintListAdd(int id,Model model){
        logger.info("gocomplaintlistadd action...");
        List<Admin> list = adminService.findAll();
        Complaint complaint = complaintService.findById(id);
        Map<String,Object> map = new HashMap<>();
        map.put("list",list);
        map.put("complaint",complaint);
        model.addAllAttributes(map);
        return "admin/complaintlistadd";
    }

    /**
     * 投诉记录添加
     * @param complaintList
     * @return
     */
    @RequestMapping("/complaintlistadd")
    public String ComplaintListAdd(HttpSession session,ComplaintList complaintList){
        logger.info("complaintlistadd action...");
        boolean flag = complaintListService.addComplaintList(complaintList);
        logger.info(flag);
        AdminVO admin = (AdminVO)session.getAttribute("currentAdminVO");
        int vid = admin.getVillage_vid();
        return "redirect:/admin/complainbyvid.action?vid="+vid;
    }

/**************************************************这是投诉模块结束*****************************************************************/

/**************************************************这是投诉记录模块开始*****************************************************************/
    /***********************************************总经理权限********************************************************/
    /**
     * 投诉记录列表控制器
     * @param model
     * @return
     */
    @RequestMapping("/complainlist")
    public String ComplainList(Model model){
        logger.info("complainlist action...");
        List<ComplaintVO> list = complaintService.findVOAll();
        model.addAttribute("list",list);
        return "admin/complainlist";
    }

    /**
     * 前往投诉记录添加的页面
     * @param model
     * @return
     */
    @RequestMapping("/gocomplainadd")
    public String GoComplainAdd(Model model){
        logger.info("gocomplainadd action...");
        List<Complaint> list = complaintService.findAll();
        model.addAttribute("list",list);
        return "admin/complainadd";
    }

    /***********************************************管理员权限********************************************************/
    /**
     * 根据小区查询投诉记录列表控制器
     * @param model
     * @return
     */
    @RequestMapping("/complainlistbyvid")
    public String complainListByVid(int vid,Model model){
        logger.info("complainlistbyvid action...");
        List<ComplaintVO> list = complaintService.findVOAllByVid(vid);
        model.addAttribute("list",list);
        return "admin/complainlist";
    }

    /**
     * 前往投诉记录更新页面
     * @param id 前端传来的参数
     * @param model 作用域
     * @return
     */
    @RequestMapping("/gocomplaintlistupdate")
    public String GoComplaintListUpdate(int id,Model model){
        logger.info("gocomplaintlistupdate action...");
        ComplaintVO complaint = complaintService.findVOById(id);
        model.addAttribute("complaint",complaint);
        return "admin/complaintlistupdate";
    }

    /**
     * 投诉记录的更新控制器
     * @param complaintList 传来的投诉记录对象
     * @return
     */
    @RequestMapping("/complaintlistupdate")
    public String ComplaintListUpdate(HttpSession session,ComplaintList complaintList){
        logger.info("complaintlistupdate action...");
        boolean flag = complaintListService.updateComplaintList(complaintList);
        logger.info("complaintlistupdate"+flag);
        AdminVO admin = (AdminVO)session.getAttribute("currentAdminVO");
        int vid = admin.getVillage_vid();
        return "redirect:/admin/complainlistbyvid.action?vid="+vid;
    }

/**************************************************这是投诉记录模块结束*****************************************************************/
}
