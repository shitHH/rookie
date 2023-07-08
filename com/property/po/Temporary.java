package com.property.po;

import java.sql.Timestamp;

/**
 * @Author : bugger
 * @create 2022/9/18 12:12
 * 临时停车实体类
 */
public class Temporary {
    /**
     * 临时停车编号
     */
    private int temporary_id;
    /**
     * 临时停车名称
     */
    private String carport_name;
    /**
     * 临时停车车牌号
     */
    private String temporary_carnum;
    /**
     * 入场时间
     */
    private Timestamp approach_time;
    /**
     * 出场时间
     */
    private Timestamp playing_time;
    /**
     * 停车费用
     */
    private Double parking_fee;

    public Temporary() {
    }

    public int getTemporary_id() {
        return temporary_id;
    }

    public void setTemporary_id(int temporary_id) {
        this.temporary_id = temporary_id;
    }

    public String getCarport_name() {
        return carport_name;
    }

    public void setCarport_name(String carport_name) {
        this.carport_name = carport_name;
    }

    public String getTemporary_carnum() {
        return temporary_carnum;
    }

    public void setTemporary_carnum(String temporary_carnum) {
        this.temporary_carnum = temporary_carnum;
    }

    public Timestamp getApproach_time() {
        return approach_time;
    }

    public void setApproach_time(Timestamp approach_time) {
        this.approach_time = approach_time;
    }

    public Timestamp getPlaying_time() {
        return playing_time;
    }

    public void setPlaying_time(Timestamp playing_time) {
        this.playing_time = playing_time;
    }

    public Double getParking_fee() {
        return parking_fee;
    }

    public void setParking_fee(Double parking_fee) {
        this.parking_fee = parking_fee;
    }

    public Temporary(int temporary_id, String carport_name, String temporary_carnum, Timestamp approach_time, Timestamp playing_time, Double parking_fee) {
        this.temporary_id = temporary_id;
        this.carport_name = carport_name;
        this.temporary_carnum = temporary_carnum;
        this.approach_time = approach_time;
        this.playing_time = playing_time;
        this.parking_fee = parking_fee;
    }

    @Override
    public String toString() {
        return "Temporary{" +
                "temporary_id=" + temporary_id +
                ", carport_name='" + carport_name + '\'' +
                ", temporary_carnum='" + temporary_carnum + '\'' +
                ", approach_time=" + approach_time +
                ", playing_time=" + playing_time +
                ", parking_fee='" + parking_fee + '\'' +
                '}';
    }
}
