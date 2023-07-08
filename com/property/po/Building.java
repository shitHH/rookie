package com.property.po;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : CD
 * @ClassName ：楼宇表
 * @CreateTime 2022/9/9 16:31
 */
public class Building {
    /**
     * 楼宇编号
     */
    private int building_bid;
    /**
     * 小区编号
     */
    private int village_vid;
    /**
     * 楼号
     */
    private String building_name;

    public Building() {
    }

    public Building(int building_bid, int village_vid, String building_name) {
        this.building_bid = building_bid;
        this.village_vid = village_vid;
        this.building_name = building_name;
    }

    @Override
    public String toString() {
        return "building{" +
                "building_bid=" + building_bid +
                ", village_vid=" + village_vid +
                ", building_name='" + building_name + '\'' +
                '}';
    }

    public int getBuilding_bid() {
        return building_bid;
    }

    public void setBuilding_bid(int building_bid) {
        this.building_bid = building_bid;
    }

    public int getVillage_vid() {
        return village_vid;
    }

    public void setVillage_vid(int village_vid) {
        this.village_vid = village_vid;
    }

    public String getBuilding_name() {
        return building_name;
    }

    public void setBuilding_name(String building_name) {
        this.building_name = building_name;
    }
}
