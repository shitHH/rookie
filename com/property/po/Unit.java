package com.property.po;

/**
 * @author : Eeerosss
 * @create 2022/9/9 15:59
 * 单元表实体类
 */
public class Unit {
    /**
     * 单元编号
     */
   private int unit_uid;
    /**
     * 单元号
     */
   private String unit_name;
    /**
     * 楼宇编号
     */
   private int building_bid;

    @Override
    public String toString() {
        return "Unit{" +
                "unit_uid=" + unit_uid +
                ", unit_name='" + unit_name + '\'' +
                ", building_bid=" + building_bid +
                '}';
    }

    public Unit() {
    }

    public Unit(int unit_uid, String unit_name, int building_bid) {
        this.unit_uid = unit_uid;
        this.unit_name = unit_name;
        this.building_bid = building_bid;
    }

    public int getUnit_uid() {
        return unit_uid;
    }

    public void setUnit_uid(int unit_uid) {
        this.unit_uid = unit_uid;
    }

    public String getUnit_name() {
        return unit_name;
    }

    public void setUnit_name(String unit_name) {
        this.unit_name = unit_name;
    }

    public int getBuilding_bid() {
        return building_bid;
    }

    public void setBuilding_bid(int building_bid) {
        this.building_bid = building_bid;
    }
}
