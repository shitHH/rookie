package com.property.po;

import java.sql.Timestamp;

/**
 * @Author : bugger
 * @create 2022/9/9 17:29
 * 投诉记录实体类
 */
public class ComplaintList {

    /**
     * 投诉记录编号
     */
    private int complaintlist_id;

    /**
     * 投诉编号
     */
    private int complaint_id;

    /**
     * 投诉状态
     */
    private String complaintlist_stat;

    /**
     * 处理结果
     */
    private String complaintlist_rs;

    /**
     * 管理员编号
     */
    private int admin_id;

    /**
     * 处理时间
     */
    private Timestamp complaintlist_ctime;

    public ComplaintList() {
    }

    public ComplaintList(int complaint_id, String complaintlist_stat, String complaintlist_rs, int admin_id, Timestamp complaintlist_ctime) {
        this.complaint_id = complaint_id;
        this.complaintlist_stat = complaintlist_stat;
        this.complaintlist_rs = complaintlist_rs;
        this.admin_id = admin_id;
        this.complaintlist_ctime = complaintlist_ctime;
    }

    public ComplaintList(int complaintlist_id, int complaint_id, String complaintlist_stat, String complaintlist_rs, int admin_id, Timestamp complaintlist_ctime) {
        this.complaintlist_id = complaintlist_id;
        this.complaint_id = complaint_id;
        this.complaintlist_stat = complaintlist_stat;
        this.complaintlist_rs = complaintlist_rs;
        this.admin_id = admin_id;
        this.complaintlist_ctime = complaintlist_ctime;
    }

    public int getComplaintlist_id() {
        return complaintlist_id;
    }

    public void setComplaintlist_id(int complaintlist_id) {
        this.complaintlist_id = complaintlist_id;
    }

    public int getComplaint_id() {
        return complaint_id;
    }

    public void setComplaint_id(int complaint_id) {
        this.complaint_id = complaint_id;
    }

    public String getComplaintlist_stat() {
        return complaintlist_stat;
    }

    public void setComplaintlist_stat(String complaintlist_stat) {
        this.complaintlist_stat = complaintlist_stat;
    }

    public String getComplaintlist_rs() {
        return complaintlist_rs;
    }

    public void setComplaintlist_rs(String complaintlist_rs) {
        this.complaintlist_rs = complaintlist_rs;
    }

    public int getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(int admin_id) {
        this.admin_id = admin_id;
    }

    public Timestamp getComplaintlist_ctime() {
        return complaintlist_ctime;
    }

    public void setComplaintlist_ctime(Timestamp complaintlist_ctime) {
        this.complaintlist_ctime = complaintlist_ctime;
    }

    @Override
    public String toString() {
        return "ComplaintList{" +
                "complaintlist_id=" + complaintlist_id +
                ", complaint_id=" + complaint_id +
                ", complaintlist_stat='" + complaintlist_stat + '\'' +
                ", complaintlist_rs='" + complaintlist_rs + '\'' +
                ", admin_id=" + admin_id +
                ", complaintlist_ctime=" + complaintlist_ctime +
                '}';
    }
}
