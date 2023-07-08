package com.property.vo;

/**
 * @Author : bugger
 * @create 2022/9/15 17:01
 * 报修的数目
 */
public class RepairNum {
    /**
     * 报修的数目
     */
    private int repairNum;

    public RepairNum() {
    }

    public RepairNum(int repairNum) {
        this.repairNum = repairNum;
    }

    public int getRepairNum() {
        return repairNum;
    }

    public void setRepairNum(int repairNum) {
        this.repairNum = repairNum;
    }

    @Override
    public String toString() {
        return "RepairNum{" +
                "repairNum=" + repairNum +
                '}';
    }
}
