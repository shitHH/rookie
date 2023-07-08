package com.property.vo;

import java.sql.Timestamp;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : CD
 * @ClassName ：
 * @CreateTime 2022/9/16 14:00
 */
public class ParkingVO {
    private int parking_id;
    private int village_vid;
    private String village_name;
    private int owner_id;
    private String owner_name;
    private String owner_tel;
    private String car_num;
    private int carport_uid;
    private String carport_uname;
    private Timestamp parking_ctime;

    public int getParking_id() {
        return parking_id;
    }

    public void setParking_id(int parking_id) {
        this.parking_id = parking_id;
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

    public String getCarport_uname() {
        return carport_uname;
    }

    public void setCarport_uname(String carport_uname) {
        this.carport_uname = carport_uname;
    }

    public Timestamp getParking_ctime() {
        return parking_ctime;
    }

    public void setParking_ctime(Timestamp parking_ctime) {
        this.parking_ctime = parking_ctime;
    }
}
