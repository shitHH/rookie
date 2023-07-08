package com.property.po;

import java.sql.Timestamp;

/**
 * @author : Eeerosss
 * @create 2022/9/9 15:37
 * 报修记录实体类
 */
public class RepairsList {
    /**
     * 报修记录编号
     */
    private int repairslist_id;
    /**
     *报修编号
     */
    private int repairs_id;
    /**
     * 管理员编号
     */
    private int admin_id;
    /**
     *报修状态
     */
    private String repairlist_stat;
    /**
     * 维修时间
     */
    private Timestamp repairslist_dtime;

    @Override
    public String toString() {
        return "RepairsList{" +
                "repairslist_id=" + repairslist_id +
                ", repairs_id=" + repairs_id +
                ", admin_id=" + admin_id +
                ", repairlist_stat='" + repairlist_stat + '\'' +
                ", repairslist_dtime=" + repairslist_dtime +
                '}';
    }

    public RepairsList() {
    }

    public RepairsList(int repairslist_id, int repairs_id, int admin_id, String repairlist_stat, Timestamp repairslist_dtime) {
        this.repairslist_id = repairslist_id;
        this.repairs_id = repairs_id;
        this.admin_id = admin_id;
        this.repairlist_stat = repairlist_stat;
        this.repairslist_dtime = repairslist_dtime;
    }

    public int getRepairslist_id() {
        return repairslist_id;
    }

    public void setRepairslist_id(int repairslist_id) {
        this.repairslist_id = repairslist_id;
    }

    public int getRepairs_id() {
        return repairs_id;
    }

    public void setRepairs_id(int repairs_id) {
        this.repairs_id = repairs_id;
    }

    public int getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(int admin_id) {
        this.admin_id = admin_id;
    }

    public String getRepairlist_stat() {
        return repairlist_stat;
    }

    public void setRepairlist_stat(String repairlist_stat) {
        this.repairlist_stat = repairlist_stat;
    }

    public Timestamp getRepairslist_dtime() {
        return repairslist_dtime;
    }

    public void setRepairslist_dtime(Timestamp repairslist_dtime) {
        this.repairslist_dtime = repairslist_dtime;
    }
}
