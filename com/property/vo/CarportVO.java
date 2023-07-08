package com.property.vo;

import java.sql.Timestamp;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : CD
 * @ClassName ：
 * @CreateTime 2022/9/13 17:24
 * 车位状态vo
 */
public class CarportVO {
    /**
     * 小区编号
     */
    private int village_vid;
    /**
     * 小区名称
     */
    private String village_name;
    /**
     * 车位编号
     */
    private int carport_id;

    /**
     * 业主编号
     */
    private int owner_id;
    /**
     * 业主姓名
     */
    private String owner_name;
    /**
     * 业主电话
     */
    private String owner_tel;
    /**
     * 车牌号
     */
    private int car_id;
    /**
     * 车牌号
     */
    private String car_num;
    /**
     * 车位使用状态编号
     */
    private int carport_uid;
    /**
     * 车位租赁状态编号
     */
    private int carport_lid;
    /**
     * 车位使用状态
     */
    private String carport_uname;
    /**
     * 车位租赁状态
     */
    private String carport_lstat;
    /**
     * 创建时间
     */
    private Timestamp carport_ctime;

    public CarportVO() {
    }

    public CarportVO(int village_vid, String village_name, int carport_id, int owner_id, String owner_name, String owner_tel, int car_id, String car_num, int carport_uid, int carport_lid, String carport_uname, String carport_lstat, Timestamp carport_ctime) {
        this.village_vid = village_vid;
        this.village_name = village_name;
        this.carport_id = carport_id;
        this.owner_id = owner_id;
        this.owner_name = owner_name;
        this.owner_tel = owner_tel;
        this.car_id = car_id;
        this.car_num = car_num;
        this.carport_uid = carport_uid;
        this.carport_lid = carport_lid;
        this.carport_uname = carport_uname;
        this.carport_lstat = carport_lstat;
        this.carport_ctime = carport_ctime;
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

    public int getCarport_id() {
        return carport_id;
    }

    public void setCarport_id(int carport_id) {
        this.carport_id = carport_id;
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

    public int getCarport_uid() {
        return carport_uid;
    }

    public void setCarport_uid(int carport_uid) {
        this.carport_uid = carport_uid;
    }

    public int getCarport_lid() {
        return carport_lid;
    }

    public void setCarport_lid(int carport_lid) {
        this.carport_lid = carport_lid;
    }

    public String getCarport_uname() {
        return carport_uname;
    }

    public void setCarport_uname(String carport_uname) {
        this.carport_uname = carport_uname;
    }

    public String getCarport_lstat() {
        return carport_lstat;
    }

    public void setCarport_lstat(String carport_lstat) {
        this.carport_lstat = carport_lstat;
    }

    public Timestamp getCarport_ctime() {
        return carport_ctime;
    }

    public void setCarport_ctime(Timestamp carport_ctime) {
        this.carport_ctime = carport_ctime;
    }
}
