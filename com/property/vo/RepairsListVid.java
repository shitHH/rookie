package com.property.vo;

/**
 * @author 梁三岁
 * @version 1.0
 * @description: TODO
 * @name: 小区报修
 * @date 2022/9/17 10:42
 */
public class RepairsListVid {

    private int repairs_id;

    private String repairlist_stat;

    private String repairs_name;

    public RepairsListVid() {
    }

    public RepairsListVid(int repairs_id, String repairlist_stat, String repairs_name) {
        this.repairs_id = repairs_id;
        this.repairlist_stat = repairlist_stat;
        this.repairs_name = repairs_name;
    }

    public int getRepairs_id() {
        return repairs_id;
    }

    public void setRepairs_id(int repairs_id) {
        this.repairs_id = repairs_id;
    }

    public String getRepairlist_stat() {
        return repairlist_stat;
    }

    public void setRepairlist_stat(String repairlist_stat) {
        this.repairlist_stat = repairlist_stat;
    }

    public String getRepairs_name() {
        return repairs_name;
    }

    public void setRepairs_name(String repairs_name) {
        this.repairs_name = repairs_name;
    }
}