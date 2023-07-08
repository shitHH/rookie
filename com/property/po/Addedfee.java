package com.property.po;

import java.sql.Timestamp;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : CD
 * @ClassName ：增值收入表
 * @CreateTime 2022/9/9 15:58
 */
public class Addedfee {
    /**
     * 增值收入编号
     */
    private int addedfee_id;
    /**
     * 小区编号
     */
    private int village_vid;
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

    public Addedfee() {
    }

    public Addedfee(int addedfee_id, int village_vid, String addedfee_type, double addedfee_sum, String addedfee_eg, Timestamp addedfee_ctime) {
        this.addedfee_id = addedfee_id;
        this.village_vid = village_vid;
        this.addedfee_type = addedfee_type;
        this.addedfee_sum = addedfee_sum;
        this.addedfee_eg = addedfee_eg;
        this.addedfee_ctime = addedfee_ctime;
    }

    @Override
    public String toString() {
        return "addedfee{" +
                "addedfee_id=" + addedfee_id +
                ", village_vid='" + village_vid + '\'' +
                ", addedfee_type='" + addedfee_type + '\'' +
                ", addedfee_sum=" + addedfee_sum +
                ", addedfee_eg='" + addedfee_eg + '\'' +
                ", addedfee_ctime=" + addedfee_ctime +
                '}';
    }

    public int getAddedfee_id() {
        return addedfee_id;
    }

    public void setAddedfee_id(int addedfee_id) {
        this.addedfee_id = addedfee_id;
    }

    public int getvillage_vid() {
        return village_vid;
    }

    public void setvillage_vid(int village_vid) {
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
}
