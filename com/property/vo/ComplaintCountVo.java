package com.property.vo;

/**
 * @author : Eeerosss
 * @create 2022/9/16 11:50
 * 小区投诉统计数据类
 */
public class ComplaintCountVo {
    /**
     * 小区编号
     */
    private int village_vid;
    /**
     * 小区名称
     */
    private String names;
    /**
     * 投诉数量
     */
    private String values;

    public String getName() {
        return names;
    }

    public ComplaintCountVo(int village_vid, String name, String value) {
        this.village_vid = village_vid;
        this.names = name;
        this.values = value;
    }

    public int getVillage_vid() {
        return village_vid;
    }

    public void setVillage_vid(int village_vid) {
        this.village_vid = village_vid;
    }

    public void setName(String name) {
        this.names = name;
    }

    public String getValue() {
        return values;
    }

    public void setValue(String value) {
        this.values = value;
    }

    public ComplaintCountVo() {
    }

    public ComplaintCountVo(String name, String value) {
        this.names = name;
        this.values = value;
    }
}
