package com.property.po;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : chengxia
 * @ClassName ：车位租赁状态实体类
 * @CreateTime 2022/9/9 15:33
 */
public class Carport_LeasState {
    /**
     * 车位租赁状态编号
     */
    private int carport_lid;
    /**
     * 车位租赁状态
     */
    private String carport_lstat;

    public Carport_LeasState() {
    }

    public Carport_LeasState(int carport_lid, String carport_lstat) {
        this.carport_lid = carport_lid;
        this.carport_lstat = carport_lstat;
    }

    @Override
    public String toString() {
        return "Carport_LeasState{" +
                "carport_lid=" + carport_lid +
                ", carport_lstat='" + carport_lstat + '\'' +
                '}';
    }

    public int getCarport_lid() {
        return carport_lid;
    }

    public void setCarport_lid(int carport_lid) {
        this.carport_lid = carport_lid;
    }

    public String getCarport_lstat() {
        return carport_lstat;
    }

    public void setCarport_lstat(String carport_lstat) {
        this.carport_lstat = carport_lstat;
    }
}
