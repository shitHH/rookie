package com.property.vo;


/**
 * Created by IntelliJ IDEA.
 *
 * @Author : CD
 * @ClassName ：
 * @CreateTime：2022/9/12 001217:29
 */
public class VillageVO {
    private int village_vid;
    private String village_name;
    private String building_num;
    private String room_num;

    public VillageVO() {
    }

    public VillageVO(int village_vid, String village_name, String building_num, String room_num) {
        this.village_vid = village_vid;
        this.village_name = village_name;
        this.building_num = building_num;
        this.room_num = room_num;
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

    public String getBuilding_num() {
        return building_num;
    }

    public void setBuilding_num(String building_num) {
        this.building_num = building_num;
    }

    public String getRoom_num() {
        return room_num;
    }

    public void setRoom_num(String room_num) {
        this.room_num = room_num;
    }
}
