package com.property.vo;

import java.sql.Timestamp;

/**
 * author: Eeerosss
 * date: 2022/9/12 10:48
 * 报修记录vo实体类
 */
public class RepairsListVo {
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
     *保修状态
     */
    private String repairlist_stat;
    /**
     * 维修时间
     */
    private Timestamp repairslist_dtime;
    /**
     * 业主编号
     */
    private int owner_id;
    /**
     * 报修设备名称
     */
    private String repairs_name;
    /**
     * 报修描述
     */
    private String repairs_reason;
    /**
     * 报修照片
     */
    private  String repairs_jpg;
    /**
     * 报修时间
     */
    private Timestamp repairs_stime;

    public RepairsListVo() {
    }

    public RepairsListVo(int repairslist_id, int repairs_id, int admin_id, String repairlist_stat, Timestamp repairslist_dtime, int owner_id, String repairs_name, String repairs_reason, String repairs_jpg, Timestamp repairs_stime) {
        this.repairslist_id = repairslist_id;
        this.repairs_id = repairs_id;
        this.admin_id = admin_id;
        this.repairlist_stat = repairlist_stat;
        this.repairslist_dtime = repairslist_dtime;
        this.owner_id = owner_id;
        this.repairs_name = repairs_name;
        this.repairs_reason = repairs_reason;
        this.repairs_jpg = repairs_jpg;
        this.repairs_stime = repairs_stime;
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

    public int getOwner_id() {
        return owner_id;
    }

    public void setOwner_id(int owner_id) {
        this.owner_id = owner_id;
    }

    public String getRepairs_name() {
        return repairs_name;
    }

    public void setRepairs_name(String repairs_name) {
        this.repairs_name = repairs_name;
    }

    public String getRepairs_reason() {
        return repairs_reason;
    }

    public void setRepairs_reason(String repairs_reason) {
        this.repairs_reason = repairs_reason;
    }

    public String getRepairs_jpg() {
        return repairs_jpg;
    }

    public void setRepairs_jpg(String repairs_jpg) {
        this.repairs_jpg = repairs_jpg;
    }

    public Timestamp getRepairs_stime() {
        return repairs_stime;
    }

    public void setRepairs_stime(Timestamp repairs_stime) {
        this.repairs_stime = repairs_stime;
    }

    @Override
    public String toString() {
        return "RepairsListVo{" +
                "repairslist_id=" + repairslist_id +
                ", repairs_id=" + repairs_id +
                ", admin_id=" + admin_id +
                ", repairlist_stat='" + repairlist_stat + '\'' +
                ", repairslist_dtime=" + repairslist_dtime +
                ", owner_id=" + owner_id +
                ", repairs_name='" + repairs_name + '\'' +
                ", repairs_reason='" + repairs_reason + '\'' +
                ", repairs_jpg='" + repairs_jpg + '\'' +
                ", repairs_stime=" + repairs_stime +
                '}';
    }
}
