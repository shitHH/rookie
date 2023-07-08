package com.property.po;

import java.sql.Timestamp;

/**
 * @Author : bugger
 * @create 2022/9/9 17:18
 * 车位实体类
 */
public class CarPort {
    /**
     * 车位编号
     */
    private int carport_id;

    /**
     * 业主编号
     */
    private int owner_id;

    /**
     * 车位使用状态编号
     */
    private int carport_uid;

    /**
     * 车位租赁状态编号
     */
    private int carport_lid;
    /**
     * 车位绑定车牌号
     */
    private String car_num;

    /**
     * 创建时间
     */
    private Timestamp carport_ctime;

    public CarPort() {
    }

    public CarPort(int carport_id, int owner_id, int carport_uid, int carport_lid, String car_num, Timestamp carport_ctime) {
        this.carport_id = carport_id;
        this.owner_id = owner_id;
        this.carport_uid = carport_uid;
        this.carport_lid = carport_lid;
        this.car_num = car_num;
        this.carport_ctime = carport_ctime;
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

    public String getCar_num() {
        return car_num;
    }

    public void setCar_num(String car_num) {
        this.car_num = car_num;
    }

    public Timestamp getCarport_ctime() {
        return carport_ctime;
    }

    public void setCarport_ctime(Timestamp carport_ctime) {
        this.carport_ctime = carport_ctime;
    }

    @Override
    public String toString() {
        return "CarPort{" +
                "carport_id=" + carport_id +
                ", owner_id=" + owner_id +
                ", carport_uid=" + carport_uid +
                ", carport_lid=" + carport_lid +
                ", car_num='" + car_num + '\'' +
                ", carport_ctime=" + carport_ctime +
                '}';
    }
}
