package com.property.vo;

import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Timestamp;
import java.util.Date;

/**
 * @Author : bugger
 * @create 2022/9/13 11:30
 * 活动视图类
 */
public class ActivityVO {
    /**
     *社区活动编号
     */
    private int activity_id;
    /**
     *小区编号
     */
    private String village_vid;

    /**
     * 小区名称
     */
    private String village_name;

    /**
     *活动标题
     */
    private String activity_title;
    /**
     *活动地点
     */
    private String activity_addr;
    /**
     *活动举办单位
     */
    private String activity_comp;
    /**
     *活动开始时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date activity_stime;

    /**
     *活动结束时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date activity_dtime;
    /**
     * 活动状态
     */
    private String activity_stat;
    /**
     * 活动创建时间
     */
    private Timestamp activity_ctime;
    /**
     * 活动内容
     */
    private String activity_content;

    public ActivityVO() {
    }

    public ActivityVO(String village_vid, String village_name, String activity_title, String activity_addr, String activity_comp, Date activity_stime, Date activity_dtime, String activity_stat, Timestamp activity_ctime) {
        this.village_vid = village_vid;
        this.village_name = village_name;
        this.activity_title = activity_title;
        this.activity_addr = activity_addr;
        this.activity_comp = activity_comp;
        this.activity_stime = activity_stime;
        this.activity_dtime = activity_dtime;
        this.activity_stat = activity_stat;
        this.activity_ctime = activity_ctime;
    }

    public ActivityVO(int activity_id, String village_vid, String village_name, String activity_title, String activity_addr, String activity_comp, Date activity_stime, Date activity_dtime, String activity_stat, Timestamp activity_ctime) {
        this.activity_id = activity_id;
        this.village_vid = village_vid;
        this.village_name = village_name;
        this.activity_title = activity_title;
        this.activity_addr = activity_addr;
        this.activity_comp = activity_comp;
        this.activity_stime = activity_stime;
        this.activity_dtime = activity_dtime;
        this.activity_stat = activity_stat;
        this.activity_ctime = activity_ctime;
    }

    public ActivityVO(int activity_id, String village_vid, String village_name, String activity_title, String activity_addr, String activity_comp, Date activity_stime, Date activity_dtime, String activity_stat, Timestamp activity_ctime, String activity_content) {
        this.activity_id = activity_id;
        this.village_vid = village_vid;
        this.village_name = village_name;
        this.activity_title = activity_title;
        this.activity_addr = activity_addr;
        this.activity_comp = activity_comp;
        this.activity_stime = activity_stime;
        this.activity_dtime = activity_dtime;
        this.activity_stat = activity_stat;
        this.activity_ctime = activity_ctime;
        this.activity_content = activity_content;
    }

    public int getActivity_id() {
        return activity_id;
    }

    public void setActivity_id(int activity_id) {
        this.activity_id = activity_id;
    }

    public String getVillage_vid() {
        return village_vid;
    }

    public void setVillage_vid(String village_vid) {
        this.village_vid = village_vid;
    }

    public String getVillage_name() {
        return village_name;
    }

    public void setVillage_name(String village_name) {
        this.village_name = village_name;
    }

    public String getActivity_title() {
        return activity_title;
    }

    public void setActivity_title(String activity_title) {
        this.activity_title = activity_title;
    }

    public String getActivity_addr() {
        return activity_addr;
    }

    public void setActivity_addr(String activity_addr) {
        this.activity_addr = activity_addr;
    }

    public String getActivity_comp() {
        return activity_comp;
    }

    public void setActivity_comp(String activity_comp) {
        this.activity_comp = activity_comp;
    }

    public Date getActivity_stime() {
        return activity_stime;
    }

    public void setActivity_stime(Date activity_stime) {
        this.activity_stime = activity_stime;
    }

    public Date getActivity_dtime() {
        return activity_dtime;
    }

    public void setActivity_dtime(Date activity_dtime) {
        this.activity_dtime = activity_dtime;
    }

    public String getActivity_stat() {
        return activity_stat;
    }

    public void setActivity_stat(String activity_stat) {
        this.activity_stat = activity_stat;
    }

    public Timestamp getActivity_ctime() {
        return activity_ctime;
    }

    public void setActivity_ctime(Timestamp activity_ctime) {
        this.activity_ctime = activity_ctime;
    }

    public String getActivity_content() {
        return activity_content;
    }

    public void setActivity_content(String activity_content) {
        this.activity_content = activity_content;
    }

    @Override
    public String toString() {
        return "ActivityVO{" +
                "activity_id=" + activity_id +
                ", village_vid='" + village_vid + '\'' +
                ", village_name='" + village_name + '\'' +
                ", activity_title='" + activity_title + '\'' +
                ", activity_addr='" + activity_addr + '\'' +
                ", activity_comp='" + activity_comp + '\'' +
                ", activity_stime=" + activity_stime +
                ", activity_dtime=" + activity_dtime +
                ", activity_stat='" + activity_stat + '\'' +
                ", activity_ctime=" + activity_ctime +
                ", activity_content='" + activity_content + '\'' +
                '}';
    }
}
