package com.property.vo;

/**
 * @author : Eeerosss
 * @create 2022/9/16 9:42
 * 数据统计类
 */
public class CountVo {
    /**
     * 车位数
     */
    private int carport_count;
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

    public CountVo() {
    }

    public int getCarport_count() {
        return carport_count;
    }

    public void setCarport_count(int carport_count) {
        this.carport_count = carport_count;
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

    public CountVo(int carport_count, int room_count, int owner_count, int lessee_count) {
        this.carport_count = carport_count;
        this.room_count = room_count;
        this.owner_count = owner_count;
        this.lessee_count = lessee_count;
    }
}
