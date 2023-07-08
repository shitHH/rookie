package com.property.vo;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 梁三岁
 * @name ：每栋楼人数统计
 * @create 2022/9/16 14:56
 */
public class OwnerSumVo {

    private String name;

    private int value;


    public OwnerSumVo() {
    }

    public OwnerSumVo(String name, int value) {
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
