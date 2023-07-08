package com.property.vo;

/**
 * @author : Eeerosss
 * @create 2022/9/16 12:33
 * 小区资产统计实体类vo
 */
public class PropertyCountVo {
    private  String name;
    private int value;

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

    public PropertyCountVo() {
    }

    public PropertyCountVo(String name, int value) {
        this.name = name;
        this.value = value;
    }
}
