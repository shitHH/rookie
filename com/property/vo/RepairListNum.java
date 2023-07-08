package com.property.vo;

/**
 * @Author : bugger
 * @create 2022/9/15 17:02
 * 报修记录的数目
 */
public class RepairListNum {
    /**
     * 报修记录的数目
     */
    private int repairListNum;

    public RepairListNum() {
    }

    public RepairListNum(int repairListNum) {
        this.repairListNum = repairListNum;
    }

    public int getRepairListNum() {
        return repairListNum;
    }

    public void setRepairListNum(int repairListNum) {
        this.repairListNum = repairListNum;
    }

    @Override
    public String toString() {
        return "RepairListNum{" +
                "repairListNum=" + repairListNum +
                '}';
    }
}
