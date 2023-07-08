package com.property.po;

import java.sql.Timestamp;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : CD
 * @ClassName ：
 * @CreateTime：2022/9/16 00160:18
 */
public class Parking {
    private int parking_id;
    private int owner_id;
    private String car_num;
    private int carport_uid;
    private Timestamp parking_ctime;

    public Parking() {
    }

    public Parking(int parking_id, int owner_id, String car_num, int carport_uid, Timestamp parking_ctime) {
        this.parking_id = parking_id;
        this.owner_id = owner_id;
        this.car_num = car_num;
        this.carport_uid = carport_uid;
        this.parking_ctime = parking_ctime;
    }

    public int getParking_id() {
        return parking_id;
    }

    public void setParking_id(int parking_id) {
        this.parking_id = parking_id;
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

    public int getCarport_uid() {
        return carport_uid;
    }

    public void setCarport_uid(int carport_uid) {
        this.carport_uid = carport_uid;
    }

    public Timestamp getParking_ctime() {
        return parking_ctime;
    }

    public void setParking_ctime(Timestamp parking_ctime) {
        this.parking_ctime = parking_ctime;
    }
}
