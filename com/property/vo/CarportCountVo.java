package com.property.vo;

/**
 * @author : Eeerosss
 * @create 2022/9/15 20:13
 */
public class CarportCountVo {

    private String name;

    private int value;

    public CarportCountVo() {
    }

    public CarportCountVo(String name, int value) {
        this.name = name;
        this.value = value;
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
