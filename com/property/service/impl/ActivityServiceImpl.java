package com.property.service.impl;

import com.property.dao.ActivityDao;
import com.property.po.Activity;
import com.property.service.ActivityService;
import com.property.vo.ActivityVO;
import com.property.vo.ActivityVo1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : CD
 * @ClassName ：社区活动业务逻辑实现
 * @CreateTime：2022/9/12 001214:45
 */
@Service
public class ActivityServiceImpl implements ActivityService {
    @Autowired
    ActivityDao activityDao;
    @Override
    public List<Activity> findAll() {
        return activityDao.findAll();
    }

    @Override
    public List<ActivityVO> findVOAll() {
        return activityDao.findVOAll();
    }

    @Override
    public Activity findById(int activity_id) {
        return activityDao.findById(activity_id);
    }

    @Override
    public ActivityVO findVOById(int activity_id) {
        return activityDao.findVOById(activity_id);
    }

    @Override
    public List<Activity> findByVid(int village_vid) {
        return activityDao.findByVid(village_vid);
    }

    @Override
    public List<ActivityVO> findByAtitle(String activity_title) {
        return activityDao.findByAtitle(activity_title);
    }

    @Override
    public List<ActivityVO> findByAddr(String activity_addr) {
        return activityDao.findByAddr(activity_addr);
    }

    @Override
    public List<ActivityVO> findByTitleAddrComp(String activity_title, String activity_addr, String activity_comp) {
        return activityDao.findByTitleAddrComp(activity_title,activity_addr,activity_comp);
    }

    @Override
    public List<ActivityVO> findByTitleAddrCompVid(String activity_title, String activity_addr, String activity_comp, int village_vid) {
        return activityDao.findByTitleAddrCompVid(activity_title,activity_addr,activity_comp,village_vid);
    }

    @Override
    public List<Activity> findByAaddr(String activity_addr) {
        return activityDao.findByAaddr(activity_addr);
    }

    @Override
    public List<Activity> findByAcomp(String activity_comp) {
        return activityDao.findByAcomp(activity_comp);
    }

    @Override
    public List<Activity> findByAstat(String activity_stat) {
        return activityDao.findByAstat(activity_stat);
    }

    @Override
    public List<ActivityVO> findVOByStat(String activity_stat) {
        return activityDao.findVOByStat(activity_stat);
    }

    @Override
    public List<ActivityVO> findVOByStatVid(String activity_stat, int village_vid) {
        return activityDao.findVOByStatVid(activity_stat,village_vid);
    }

    @Override
    public boolean addActivity(Activity activity) {
        activity.setActivity_ctime(new Timestamp(System.currentTimeMillis()));
        return activityDao.addActivity(activity)>0?true:false;
    }

    @Override
    public boolean deleteActivity(int[] array) {
        return activityDao.deleteActivity(array)>0?true:false;
    }

    @Override
    public boolean updateActivity(Activity activity) {
        return activityDao.updateActivity(activity)>0?true:false;
    }

    @Override
    public List<ActivityVo1> findByOwner_id(int owner_id)  {
        List<ActivityVo1> list =activityDao.findByOwner_id(owner_id);
        return list;
    }

    @Override
    public List<ActivityVO> findAllByVid(int vid) {
        return activityDao.findAllByVid(vid);
    }
}
