package com.property.vo;

import java.sql.Timestamp;

/**
 * @Author : bugger
 * @create 2022/9/13 15:59
 */
public class ComplaintVO {
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

    /**
     * 投诉记录编号
     */
    private int complaintlist_id;

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

    /**
     * 所属小区编号
     */
    private int village_vid;

    /**
     * 单元编号
     */
    private int unit_uid;

    /**
     * 房间编号
     */
    private int room_rid;

    /**
     * 业主角色编号
     */
    private int owner_rid;

    /**
     * 楼宇编号
     */
    private int building_bid;

    /**
     * 详细地址
     */
    private String owner_addr;

    /**
     * 姓名
     */
    private String owner_name;

    /**
     * 身份证号码
     */
    private String owner_cid;

    /**
     * 电话号码
     */
    private String owner_tel;

    /**
     * 性别
     */
    private String owner_sex;

    /**
     * 创建时间
     */
    private Timestamp owner_ctime;

    /**
     * 业主密码
     */
    private String owner_pass;

    /**
     * 小区名称
     */
    private String village_name;

    public ComplaintVO() {
    }

    public ComplaintVO(int complaint_id, int owner_id, String complaint_name, String complaint_reason, String complaint_stat, Timestamp complaint_ctime, int complaintlist_id, String complaintlist_stat, String complaintlist_rs, int admin_id, Timestamp complaintlist_ctime, int village_vid, int unit_uid, int room_rid, int owner_rid, int building_bid, String owner_addr, String owner_name, String owner_cid, String owner_tel, String owner_sex, Timestamp owner_ctime, String owner_pass, String village_name) {
        this.complaint_id = complaint_id;
        this.owner_id = owner_id;
        this.complaint_name = complaint_name;
        this.complaint_reason = complaint_reason;
        this.complaint_stat = complaint_stat;
        this.complaint_ctime = complaint_ctime;
        this.complaintlist_id = complaintlist_id;
        this.complaintlist_stat = complaintlist_stat;
        this.complaintlist_rs = complaintlist_rs;
        this.admin_id = admin_id;
        this.complaintlist_ctime = complaintlist_ctime;
        this.village_vid = village_vid;
        this.unit_uid = unit_uid;
        this.room_rid = room_rid;
        this.owner_rid = owner_rid;
        this.building_bid = building_bid;
        this.owner_addr = owner_addr;
        this.owner_name = owner_name;
        this.owner_cid = owner_cid;
        this.owner_tel = owner_tel;
        this.owner_sex = owner_sex;
        this.owner_ctime = owner_ctime;
        this.owner_pass = owner_pass;
        this.village_name = village_name;
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

    public int getComplaintlist_id() {
        return complaintlist_id;
    }

    public void setComplaintlist_id(int complaintlist_id) {
        this.complaintlist_id = complaintlist_id;
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

    public int getVillage_vid() {
        return village_vid;
    }

    public void setVillage_vid(int village_vid) {
        this.village_vid = village_vid;
    }

    public int getUnit_uid() {
        return unit_uid;
    }

    public void setUnit_uid(int unit_uid) {
        this.unit_uid = unit_uid;
    }

    public int getRoom_rid() {
        return room_rid;
    }

    public void setRoom_rid(int room_rid) {
        this.room_rid = room_rid;
    }

    public int getOwner_rid() {
        return owner_rid;
    }

    public void setOwner_rid(int owner_rid) {
        this.owner_rid = owner_rid;
    }

    public int getBuilding_bid() {
        return building_bid;
    }

    public void setBuilding_bid(int building_bid) {
        this.building_bid = building_bid;
    }

    public String getOwner_addr() {
        return owner_addr;
    }

    public void setOwner_addr(String owner_addr) {
        this.owner_addr = owner_addr;
    }

    public String getOwner_name() {
        return owner_name;
    }

    public void setOwner_name(String owner_name) {
        this.owner_name = owner_name;
    }

    public String getOwner_cid() {
        return owner_cid;
    }

    public void setOwner_cid(String owner_cid) {
        this.owner_cid = owner_cid;
    }

    public String getOwner_tel() {
        return owner_tel;
    }

    public void setOwner_tel(String owner_tel) {
        this.owner_tel = owner_tel;
    }

    public String getOwner_sex() {
        return owner_sex;
    }

    public void setOwner_sex(String owner_sex) {
        this.owner_sex = owner_sex;
    }

    public Timestamp getOwner_ctime() {
        return owner_ctime;
    }

    public void setOwner_ctime(Timestamp owner_ctime) {
        this.owner_ctime = owner_ctime;
    }

    public String getOwner_pass() {
        return owner_pass;
    }

    public void setOwner_pass(String owner_pass) {
        this.owner_pass = owner_pass;
    }

    public String getVillage_name() {
        return village_name;
    }

    public void setVillage_name(String village_name) {
        this.village_name = village_name;
    }

    @Override
    public String toString() {
        return "ComplaintVO{" +
                "complaint_id=" + complaint_id +
                ", owner_id=" + owner_id +
                ", complaint_name='" + complaint_name + '\'' +
                ", complaint_reason='" + complaint_reason + '\'' +
                ", complaint_stat='" + complaint_stat + '\'' +
                ", complaint_ctime=" + complaint_ctime +
                ", complaintlist_id=" + complaintlist_id +
                ", complaintlist_stat='" + complaintlist_stat + '\'' +
                ", complaintlist_rs='" + complaintlist_rs + '\'' +
                ", admin_id=" + admin_id +
                ", complaintlist_ctime=" + complaintlist_ctime +
                ", village_vid=" + village_vid +
                ", unit_uid=" + unit_uid +
                ", room_rid=" + room_rid +
                ", owner_rid=" + owner_rid +
                ", building_bid=" + building_bid +
                ", owner_addr='" + owner_addr + '\'' +
                ", owner_name='" + owner_name + '\'' +
                ", owner_cid='" + owner_cid + '\'' +
                ", owner_tel='" + owner_tel + '\'' +
                ", owner_sex='" + owner_sex + '\'' +
                ", owner_ctime=" + owner_ctime +
                ", owner_pass='" + owner_pass + '\'' +
                ", village_name='" + village_name + '\'' +
                '}';
    }
}
