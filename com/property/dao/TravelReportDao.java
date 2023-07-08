package com.property.dao;

import com.property.po.TravelReport;
import com.property.vo.TravelreportVo;

import java.util.Date;
import java.util.List;

/**
 * author: Eeerosss
 * date: 2022/9/11 0:30
 * 行程报表实体类数据访问接口
 */
public interface TravelReportDao {
    /**
     * 查询所有行程报表
     * @return 行程报表对象集合
     */
    public List<TravelReport> findAll();

    /**
     * 查询所有行程视图报表
     * @return 行程报表视图对象集合
     */
    public List<TravelreportVo> findVOAll();

    /**
     * 根据编号查询行程报表对象
     * @param travelreport_id 编号
     * @return 行程报表对象
     */
    public TravelReport findByTravelReport_id(int travelreport_id);

    /**
     * 根据业主编号查询行程报表集合
     * @param owner_id 业主编号
     * @return 行程报表集合
     */
    public List<TravelReport> findByOwner_id(int owner_id);

    /**
     * 根据省编号查询行程报表对象集合
     * @param province_pid 省编号
     * @return 行程报表对象集合
     */
    public List<TravelReport> findByProvince_pid(String province_pid);

    /**
     * 根据城市编号查询行程报表对象集合
     * @param city_cid 城市编号
     * @return 行程报表对象集合
     */
    public List<TravelReport> findByCity_cid(String city_cid);

    /**
     * 根据区编号查询行程报表对象集合
     * @param area_aid 区编号
     * @return 行程报表对象集合
     */
    public List<TravelReport> findByArea_aid(String area_aid);

    /**
     * 根据前往时间查询行程报表对象集合
     * @param go_time 前往时间
     * @return 行程报表对象集合
     */
    public List<TravelReport> findByGo_time(Date go_time);

    /**
     * 根据返回时间查询行程报表对象集合
     * @param back_time 返回时间
     * @return 行程报表对象集合
     */
    public List<TravelReport> findByBack_time(Date back_time);

    /**
     * 根据交通方式查询行程报表对象集合
     * @param travelreport_type 交通方式
     * @return 行程报表对象集合
     */
    public List<TravelReport> findByTravelReport_type(String travelreport_type);

    /**
     * 增加行程报表
     * @param travelReport 行程报表对象
     * @return 受影响行数
     */
    public int addTravelReport(TravelReport travelReport);

    /**
     *修改行程报表
     * @param travelReport 行程报表对象
     * @return 受影响行数
     */
    public int updateTravelReport(TravelReport travelReport);

    /**
     * @param owner_id 业主编号
     * @return
     */
    public List<TravelreportVo> findByowner_id(int owner_id);

    /**
     * 根据查询所有行程视图报表
     * @return 行程报表视图对象集合
     */
    public List<TravelreportVo> findVOAllByVid(int vid);
}
