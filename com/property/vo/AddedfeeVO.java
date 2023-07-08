package com.property.vo;

import java.sql.Timestamp;

/**
 * @Author : bugger
 * @create 2022/9/15 9:21
 * 增值收入视图
 */
public class AddedfeeVO {
    /**
     * 增值收入编号
     */
    private int addedfee_id;
    /**
     * 小区编号
     */
    private String village_vid;
    /**
     * 增值收入类型
     */
    private String addedfee_type;
    /**
     * 收入总额
     */
    private double addedfee_sum;
    /**
     * 备注
     */
    private String addedfee_eg;
    /**
     * 缴费时间
     */
    private Timestamp addedfee_ctime;
    /**
     * 小区名称
     */
    private String village_name;

    public AddedfeeVO() {
    }

    public AddedfeeVO(int addedfee_id, String village_vid, String addedfee_type, double addedfee_sum, String addedfee_eg, Timestamp addedfee_ctime, String village_name) {
        this.addedfee_id = addedfee_id;
        this.village_vid = village_vid;
        this.addedfee_type = addedfee_type;
        this.addedfee_sum = addedfee_sum;
        this.addedfee_eg = addedfee_eg;
        this.addedfee_ctime = addedfee_ctime;
        this.village_name = village_name;
    }

    public int getAddedfee_id() {
        return addedfee_id;
    }

    public void setAddedfee_id(int addedfee_id) {
        this.addedfee_id = addedfee_id;
    }

    public String getVillage_vid() {
        return village_vid;
    }

    public void setVillage_vid(String village_vid) {
        this.village_vid = village_vid;
    }

    public String getAddedfee_type() {
        return addedfee_type;
    }

    public void setAddedfee_type(String addedfee_type) {
        this.addedfee_type = addedfee_type;
    }

    public double getAddedfee_sum() {
        return addedfee_sum;
    }

    public void setAddedfee_sum(double addedfee_sum) {
        this.addedfee_sum = addedfee_sum;
    }

    public String getAddedfee_eg() {
        return addedfee_eg;
    }

    public void setAddedfee_eg(String addedfee_eg) {
        this.addedfee_eg = addedfee_eg;
    }

    public Timestamp getAddedfee_ctime() {
        return addedfee_ctime;
    }

    public void setAddedfee_ctime(Timestamp addedfee_ctime) {
        this.addedfee_ctime = addedfee_ctime;
    }

    public String getVillage_name() {
        return village_name;
    }

    public void setVillage_name(String village_name) {
        this.village_name = village_name;
    }

    @Override
    public String toString() {
        return "AddedfeeVO{" +
                "addedfee_id=" + addedfee_id +
                ", village_vid='" + village_vid + '\'' +
                ", addedfee_type='" + addedfee_type + '\'' +
                ", addedfee_sum=" + addedfee_sum +
                ", addedfee_eg='" + addedfee_eg + '\'' +
                ", addedfee_ctime=" + addedfee_ctime +
                ", village_name='" + village_name + '\'' +
                '}';
    }
}
