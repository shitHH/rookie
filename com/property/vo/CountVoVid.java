package com.property.vo;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 梁三岁
 * @name ：小区数据统计
 * @create 2022/9/16 11:53
 */
public class CountVoVid {

    /**
     * 小区编号
     */
    private int village_vid;
    /**
     * 小区总车位数
     */
    private int parking_count;
    /**
     * 总户数
     */
    private int room_count;
    /**
     * 总人数
     */
    private int owner_count;
    /**
     * 租户数量
     */
    private int lessee_count;

    public CountVoVid() {
    }

    public CountVoVid(int village_vid, int parking_count, int room_count, int owner_count, int lessee_count) {
        this.village_vid = village_vid;
        this.parking_count = parking_count;
        this.room_count = room_count;
        this.owner_count = owner_count;
        this.lessee_count = lessee_count;
    }

    public CountVoVid(int parking_count, int room_count, int owner_count, int lessee_count) {
        this.parking_count = parking_count;
        this.room_count = room_count;
        this.owner_count = owner_count;
        this.lessee_count = lessee_count;
    }

    public int getVillage_vid() {
        return village_vid;
    }

    public void setVillage_vid(int village_vid) {
        this.village_vid = village_vid;
    }

    public int getParking_count() {
        return parking_count;
    }

    public void setParking_count(int parking_count) {
        this.parking_count = parking_count;
    }

    public int getRoom_count() {
        return room_count;
    }

    public void setRoom_count(int room_count) {
        this.room_count = room_count;
    }

    public int getOwner_count() {
        return owner_count;
    }

    public void setOwner_count(int owner_count) {
        this.owner_count = owner_count;
    }

    public int getLessee_count() {
        return lessee_count;
    }

    public void setLessee_count(int lessee_count) {
        this.lessee_count = lessee_count;
    }
}
