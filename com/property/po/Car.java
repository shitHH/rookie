package com.property.po;

import java.sql.Timestamp;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 成夏
 * @ClassName ：车辆类
 * @CreateTime 2022/9/9 15:02
 */
public class Car {
    /**
     * 车辆编号
     */
    private int car_id;
    /**
     * 业主编号
     */
    private int owner_id;
    /**
     * 车牌号
     */
    private String car_num;
    /**
     * 创建时间
     */
    private Timestamp car_ctime;

    public Car() {
    }

    public Car(int car_id, int owner_id, String car_num, Timestamp car_ctime) {
        this.car_id = car_id;
        this.owner_id = owner_id;
        this.car_num = car_num;
        this.car_ctime = car_ctime;
    }

    @Override
    public String toString() {
        return "Car{" +
                "car_id=" + car_id +
                ", owner_id=" + owner_id +
                ", car_num='" + car_num + '\'' +
                ", car_ctime=" + car_ctime +
                '}';
    }

    public int getCar_id() {
        return car_id;
    }

    public void setCar_id(int car_id) {
        this.car_id = car_id;
    }

    public int getOwner_id() {
        return owner_id;
    }

    public void setOwner_id(int owner_id) {
        this.owner_id = owner_id;
    }

    public String getCar_num() {
        return car_num;
    }

    public void setCar_num(String car_num) {
        this.car_num = car_num;
    }

    public Timestamp getCar_ctime() {
        return car_ctime;
    }

    public void setCar_ctime(Timestamp car_ctime) {
        this.car_ctime = car_ctime;
    }
}
