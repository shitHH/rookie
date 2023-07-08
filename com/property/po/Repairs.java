package com.property.po;

import java.sql.Timestamp;

/**
 * @author : Eeerosss
 * @create 2022/9/9 15:32
 * 报修表实体类
 */
public class Repairs {
    /**
     * 报修编号
     */
    private int repairs_id;
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

    @Override
    public String toString() {
        return "Repairs{" +
                "repairs_id=" + repairs_id +
                ", owner_id=" + owner_id +
                ", repairs_name='" + repairs_name + '\'' +
                ", repairs_reason='" + repairs_reason + '\'' +
                ", repairs_jpg='" + repairs_jpg + '\'' +
                ", repairs_stime=" + repairs_stime +
                '}';
    }

    public Repairs() {
    }

    public Repairs(int repairs_id, int owner_id, String repairs_name, String repairs_reason, String repairs_jpg, Timestamp repairs_stime) {
        this.repairs_id = repairs_id;
        this.owner_id = owner_id;
        this.repairs_name = repairs_name;
        this.repairs_reason = repairs_reason;
        this.repairs_jpg = repairs_jpg;
        this.repairs_stime = repairs_stime;
    }

    public int getRepairs_id() {
        return repairs_id;
    }

    public void setRepairs_id(int repairs_id) {
        this.repairs_id = repairs_id;
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
}
