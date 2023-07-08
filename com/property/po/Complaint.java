package com.property.po;


import java.sql.Timestamp;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : chengxia
 * @ClassName ：投诉实体类
 * @CreateTime 2022/9/9 15:51
 */
public class Complaint {
    /**
     * 投诉编号
     */
    private int complaint_id;
    /**
     * 业主编号
     */
    private int owner_id;
    /**
     * 投诉名称
     */
    private String complaint_name;
    /**
     * 投诉事由
     */
    private String complaint_reason;
    /**
     * 隐私状态
     */
    private String complaint_stat;
    /**
     * 创建时间
     */
    private Timestamp complaint_ctime;

    public Complaint() {
    }

    public Complaint(int complaint_id, int owner_id, String complaint_name, String complaint_reason, String complaint_stat, Timestamp complaint_ctime) {
        this.complaint_id = complaint_id;
        this.owner_id = owner_id;
        this.complaint_name = complaint_name;
        this.complaint_reason = complaint_reason;
        this.complaint_stat = complaint_stat;
        this.complaint_ctime = complaint_ctime;
    }

    @Override
    public String toString() {
        return "Complaint{" +
                "complaint_id=" + complaint_id +
                ", owner_id=" + owner_id +
                ", complaint_name='" + complaint_name + '\'' +
                ", complaint_reason='" + complaint_reason + '\'' +
                ", complaint_stat='" + complaint_stat + '\'' +
                ", complaint_ctime=" + complaint_ctime +
                '}';
    }

    public int getComplaint_id() {
        return complaint_id;
    }

    public void setComplaint_id(int complaint_id) {
        this.complaint_id = complaint_id;
    }

    public int getOwner_id() {
        return owner_id;
    }

    public void setOwner_id(int owner_id) {
        this.owner_id = owner_id;
    }

    public String getComplaint_name() {
        return complaint_name;
    }

    public void setComplaint_name(String complaint_name) {
        this.complaint_name = complaint_name;
    }

    public String getComplaint_reason() {
        return complaint_reason;
    }

    public void setComplaint_reason(String complaint_reason) {
        this.complaint_reason = complaint_reason;
    }

    public String getComplaint_stat() {
        return complaint_stat;
    }

    public void setComplaint_stat(String complaint_stat) {
        this.complaint_stat = complaint_stat;
    }

    public Timestamp getComplaint_ctime() {
        return complaint_ctime;
    }

    public void setComplaint_ctime(Timestamp complaint_ctime) {
        this.complaint_ctime = complaint_ctime;
    }
}
