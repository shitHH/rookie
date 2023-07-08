package com.property.vo;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 梁三岁
 * @name ：小区数量vo
 * @create 2022/9/15 14:06
 */
public class VillageCountVo {
    private int village_vid;
    /**
     * 小区名称
     */
    private String name;

    /**
     * 户数
     */
    private int value;

    public VillageCountVo() {
    }

    public VillageCountVo(int village_vid, String name, int value) {
        this.village_vid = village_vid;
        this.name = name;
        this.value = value;
    }

    public int getVillage_vid() {
        return village_vid;
    }

    public void setVillage_vid(int village_vid) {
        this.village_vid = village_vid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
