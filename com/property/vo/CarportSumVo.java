package com.property.vo;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 梁三岁
 * @name ：小区车位类型统计
 * @create 2022/9/16 17:54
 */
public class CarportSumVo {

    private String name;

    private int value;

    public CarportSumVo() {
    }

    public CarportSumVo(String name, int value) {
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
