package com.property.vo;

import java.sql.Timestamp;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : chengxia
 * @ClassName ：车辆VO
 * @CreateTime 2022/9/13 11:33
 */
public class CarVO {
    /**
     * 车辆编号
     */
    private int car_id;
    /**
     * 车牌号
     */
    private String car_num;
    /**
     * 业主编号
     */
    private int owner_id;
    /**
     * 姓名
     */
    private String owner_name;
    /**
     * 电话号码
     */
    private String owner_tel;
    /**
     * 所属小区编号
     */
    private int village_vid;
    /**
     * 小区名称
     */
    private String village_name;
    /**
     * 创建时间
     */
    private Timestamp car_ctime;

    public CarVO() {
    }

    public CarVO(int car_id, String car_num, int owner_id, String owner_name, String owner_tel, int village_vid, String village_name, Timestamp car_ctime) {
        this.car_id = car_id;
        this.car_num = car_num;
        this.owner_id = owner_id;
        this.owner_name = owner_name;
        this.owner_tel = owner_tel;
        this.village_vid = village_vid;
        this.village_name = village_name;
        this.car_ctime = car_ctime;
    }

    @Override
    public String toString() {
        return "CarVO{" +
                "car_id=" + car_id +
                ", car_num='" + car_num + '\'' +
                ", owner_id=" + owner_id +
                ", owner_name='" + owner_name + '\'' +
                ", owner_tel='" + owner_tel + '\'' +
                ", village_vid=" + village_vid +
                ", village_name='" + village_name + '\'' +
                ", car_ctime=" + car_ctime +
                '}';
    }

    public int getCar_id() {
        return car_id;
    }

    public void setCar_id(int car_id) {
        this.car_id = car_id;
    }

    public String getCar_num() {
        return car_num;
    }

    public void setCar_num(String car_num) {
        this.car_num = car_num;
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

    public String getOwner_tel() {
        return owner_tel;
    }

    public void setOwner_tel(String owner_tel) {
        this.owner_tel = owner_tel;
    }

    public int getVillage_vid() {
        return village_vid;
    }

    public void setVillage_vid(int village_vid) {
        this.village_vid = village_vid;
    }

    public String getVillage_name() {
        return village_name;
    }

    public void setVillage_name(String village_name) {
        this.village_name = village_name;
    }

    public Timestamp getCar_ctime() {
        return car_ctime;
    }

    public void setCar_ctime(Timestamp car_ctime) {
        this.car_ctime = car_ctime;
    }
}
