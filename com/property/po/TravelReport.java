package com.property.po;

import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Timestamp;
import java.util.Date;

/**
 * @author : Eeerosss
 * @create 2022/9/9 15:53
 * 行程报表实体类
 */
public class TravelReport {
    /**
     * 行程报表编号
     */
    private int travelreport_id;
    /**
     * 业主编号
     */
    private int owner_id;
    /**
     * 省份编号
     */
    private String province_pid;
    /**
     * 城市编号
     */
    private String city_cid;
    /**
     * 区编号
     */
    private String area_aid;
    /**
     * 前往日期
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date go_time;
    /**
     * 返回日期
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date back_time;
    /**
     * 交通方式
     */
    private String travelreport_type;
    /**
     * 创建时间
     */
    private Timestamp travelreport_ctime;

    @Override
    public String toString() {
        return "TravelReport{" +
                "travelreport_id=" + travelreport_id +
                ", owner_id=" + owner_id +
                ", province_pid='" + province_pid + '\'' +
                ", city_cid='" + city_cid + '\'' +
                ", area_aid='" + area_aid + '\'' +
                ", go_time=" + go_time +
                ", back_time=" + back_time +
                ", travelreport_type='" + travelreport_type + '\'' +
                ", travelreport_ctime=" + travelreport_ctime +
                '}';
    }

    public TravelReport() {
    }

    public TravelReport(int travelreport_id, int owner_id, String province_pid, String city_cid, String area_aid, Date go_time, Date back_time, String travelreport_type, Timestamp travelreport_ctime) {
        this.travelreport_id = travelreport_id;
        this.owner_id = owner_id;
        this.province_pid = province_pid;
        this.city_cid = city_cid;
        this.area_aid = area_aid;
        this.go_time = go_time;
        this.back_time = back_time;
        this.travelreport_type = travelreport_type;
        this.travelreport_ctime = travelreport_ctime;
    }

    public int getTravelreport_id() {
        return travelreport_id;
    }

    public void setTravelreport_id(int travelreport_id) {
        this.travelreport_id = travelreport_id;
    }

    public int getOwner_id() {
        return owner_id;
    }

    public void setOwner_id(int owner_id) {
        this.owner_id = owner_id;
    }

    public String getProvince_pid() {
        return province_pid;
    }

    public void setProvince_pid(String province_pid) {
        this.province_pid = province_pid;
    }

    public String getCity_cid() {
        return city_cid;
    }

    public void setCity_cid(String city_cid) {
        this.city_cid = city_cid;
    }

    public String getArea_aid() {
        return area_aid;
    }

    public void setArea_aid(String area_aid) {
        this.area_aid = area_aid;
    }

    public Date getGo_time() {
        return go_time;
    }

    public void setGo_time(Date go_time) {
        this.go_time = go_time;
    }

    public Date getBack_time() {
        return back_time;
    }

    public void setBack_time(Date back_time) {
        this.back_time = back_time;
    }

    public String getTravelreport_type() {
        return travelreport_type;
    }

    public void setTravelreport_type(String travelreport_type) {
        this.travelreport_type = travelreport_type;
    }

    public Timestamp getTravelreport_ctime() {
        return travelreport_ctime;
    }

    public void setTravelreport_ctime(Timestamp travelreport_ctime) {
        this.travelreport_ctime = travelreport_ctime;
    }
}

