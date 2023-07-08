package com.property.po;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : chengxia
 * @ClassName ：车位使用状态实体类
 * @CreateTime 2022/9/9 15:47
 */
public class Carport_UseState {
    /**
     * 车位使用状态编号
     */
    private int carport_uid;
    /**
     * 车位使用状态
     */
    private String carport_uname;

    public Carport_UseState() {
    }

    public Carport_UseState(int carport_uid, String carport_uname) {
        this.carport_uid = carport_uid;
        this.carport_uname = carport_uname;
    }

    @Override
    public String toString() {
        return "Carport_UseState{" +
                "carport_uid=" + carport_uid +
                ", carport_uname='" + carport_uname + '\'' +
                '}';
    }


    public int getCarport_uid() {
        return carport_uid;
    }

    public void setCarport_uid(int carport_uid) {
        this.carport_uid = carport_uid;
    }

    public String getCarport_uname() {
        return carport_uname;
    }

    public void setCarport_uname(String carport_uname) {
        this.carport_uname = carport_uname;
    }
}
