package com.property.service;

import com.property.po.Activity;
import com.property.vo.ActivityVO;
import com.property.vo.ActivityVo1;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : CD
 * @ClassName ：社区活动业务逻辑接口
 * @CreateTime：2022/9/12 14:38
 */
public interface ActivityService {
    /**
     * 查询所有活动
     * @return 活动对象集合
     */
    public List<Activity> findAll();

    /**
     * 查询所有活动视图对象
     * @return 活动视图对象集合
     */
    public List<ActivityVO> findVOAll();

    /**
     * 根据活动编号查询活动对象
     * @param activity_id 活动编号
     * @return 活动对象
     */
    public Activity findById(int activity_id);

    /**
     * 根据活动编号查询活动视图对象
     * @param activity_id 活动编号
     * @return 活动对象
     */
    public ActivityVO findVOById(int activity_id);

    /**
     * 根据小区编号查询活动
     * @param village_vid 小区编号
     * @return 活动对象集合
     */
    public List<Activity> findByVid(int village_vid);

    /**
     * 根据活动名称查询活动
     * @param activity_title 活动名称
     * @return 活动对象
     */
    public List<ActivityVO> findByAtitle(String activity_title);

    /**
     * 根据活动举办地查询活动
     * @param activity_addr 活动举办地
     * @return 活动对象
     */
    public List<ActivityVO> findByAddr(String activity_addr);

    /**
     * 根据活动名称、活动举办地、活动举办公司查询活动
     * @param activity_title 活动名称
     * @param activity_addr 活动举办地
     * @param activity_comp 活动举办公司
     * @return 活动对象
     */
    public List<ActivityVO> findByTitleAddrComp(@Param("activity_title") String activity_title,@Param("activity_addr") String activity_addr,@Param("activity_comp")String activity_comp);

    /**
     * 根据活动名称、活动举办地、活动举办公司查询活动
     * @param activity_title 活动名称
     * @param activity_addr 活动举办地
     * @param activity_comp 活动举办公司
     * @return 活动对象
     */
    public List<ActivityVO> findByTitleAddrCompVid(@Param("activity_title") String activity_title,@Param("activity_addr") String activity_addr,@Param("activity_comp")String activity_comp,@Param("village_vid")int village_vid);

    /**
     * 根据活动地址查询活动
     * @param activity_addr 活动地址
     * @return 活动对象集合
     */
    public List<Activity> findByAaddr(String activity_addr);

    /**
     * 根据活动举办单位查询活动
     * @param activity_comp 活动举办单位
     * @return 活动对象集合
     */
    public List<Activity> findByAcomp(String activity_comp);
    /**
     * 根据活动状态查询活动
     * @param activity_stat 活动状态
     * @return 活动对象集合
     */
    public List<Activity> findByAstat(String activity_stat);

    /**
     * 根据活动状态查询活动视图
     * @param activity_stat 活动状态
     * @return 活动视图对象集合
     */
    public List<ActivityVO> findVOByStat(String activity_stat);

    /**
     * 普通管理员根据小区权限和活动状态查询活动视图
     * @param activity_stat 活动状态
     * @return 活动视图对象集合
     */
    public List<ActivityVO> findVOByStatVid(@Param("activity_stat") String activity_stat,@Param("village_vid")int village_vid);


    /**
     * 添加活动
     * @param activity 活动对象
     * @return 受影响行数
     */
    public boolean addActivity (Activity activity);

    /**
     * 删除活动
     * @param array 活动id数组
     * @return 受影响行数
     */
    public boolean deleteActivity (int[] array);

    /**
     * 更新活动
     * @param activity 活动对象
     * @return 受影响行数
     */
    public boolean updateActivity (Activity activity);


    /**
     * @return
     */
    public List<ActivityVo1> findByOwner_id(int owner_id) ;

    /**
     * 根据小区编号查询所有活动
     * @param vid 小区编号
     * @return 活动视图对象的集合
     */
    public List<ActivityVO> findAllByVid(int vid);
}
