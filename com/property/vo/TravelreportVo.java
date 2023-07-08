package com.property.vo;

import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 梁三岁
 * @name ：返省上报Vo
 * @create 2022/9/14 10:50
 */
public class TravelreportVo {
    /**
     * 编号
     */
    private int travelreport_id;
    /**
     * 业主编号
     */
    private int owner_id;
    /**
     * 业主姓名
     */
    private String owner_name;

    /**
     * 业主家庭住址
     */
    private String owner_addr;
    /**
     * 省份编号
     */
    private String province_pid;
    /**
     * 省份名称
     */
    private String province_name;
    /**
     * 城市编号
     */
    private String city_cid;
    /**
     * 城市名称
     */
    private String city_name;
    /**
     * 区编号
     */
    private String area_aid;
    /**
     * 区县名称
     */
    private String area_name;
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

    public TravelreportVo() {
    }

    public TravelreportVo(int travelreport_id, int owner_id, String owner_name, String owner_addr, String province_pid, String city_cid, String area_aid, Date go_time, Date back_time, String travelreport_type, Timestamp travelreport_ctime) {
        this.travelreport_id = travelreport_id;
        this.owner_id = owner_id;
        this.owner_name = owner_name;
        this.owner_addr = owner_addr;
        this.province_pid = province_pid;
        this.city_cid = city_cid;
        this.area_aid = area_aid;
        this.go_time = go_time;
        this.back_time = back_time;
        this.travelreport_type = travelreport_type;
        this.travelreport_ctime = travelreport_ctime;
    }

    public TravelreportVo(int travelreport_id, int owner_id, String owner_name, String owner_addr, String province_pid, String province_name, String city_cid, String city_name, String area_aid, String area_name, Date go_time, Date back_time, String travelreport_type, Timestamp travelreport_ctime) {
        this.travelreport_id = travelreport_id;
        this.owner_id = owner_id;
        this.owner_name = owner_name;
        this.owner_addr = owner_addr;
        this.province_pid = province_pid;
        this.province_name = province_name;
        this.city_cid = city_cid;
        this.city_name = city_name;
        this.area_aid = area_aid;
        this.area_name = area_name;
        this.go_time = go_time;
        this.back_time = back_time;
        this.travelreport_type = travelreport_type;
        this.travelreport_ctime = travelreport_ctime;
    }

    public String getProvince_name() {
        return province_name;
    }

    public void setProvince_name(String province_name) {
        this.province_name = province_name;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    public String getArea_name() {
        return area_name;
    }

    public void setArea_name(String area_name) {
        this.area_name = area_name;
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

    public String getOwner_name() {
        return owner_name;
    }

    public void setOwner_name(String owner_name) {
        this.owner_name = owner_name;
    }

    public String getOwner_addr() {
        return owner_addr;
    }

    public void setOwner_addr(String owner_addr) {
        this.owner_addr = owner_addr;
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
