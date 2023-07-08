package com.property.po;

import java.sql.Timestamp;

/**
 * @Author : bugger
 * @create 2022/9/9 16:10
 * 业主信息实体类
 */
public class Owner {

    /**
     * 业主编号
     */
    private int owner_id;

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

    public Owner() {
    }

    public Owner(int owner_id, int village_vid, int unit_uid, int room_rid, int owner_rid, int building_bid, String owner_addr, String owner_name, String owner_cid, String owner_tel, String owner_sex, Timestamp owner_ctime, String owner_pass) {
        this.owner_id = owner_id;
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
    }

    public String getOwner_pass() {
        return owner_pass;
    }

    public void setOwner_pass(String owner_pass) {
        this.owner_pass = owner_pass;
    }

    public Owner(int village_vid, int unit_uid, int room_rid, int owner_rid, int building_bid, String owner_addr, String owner_name, String owner_cid, String owner_tel, String owner_sex, Timestamp owner_ctime) {
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
    }

    public Owner(int owner_id, int village_vid, int unit_uid, int room_rid, int owner_rid, int building_bid, String owner_addr, String owner_name, String owner_cid, String owner_tel, String owner_sex, Timestamp owner_ctime) {
        this.owner_id = owner_id;
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
    }

    public int getOwner_id() {
        return owner_id;
    }

    public void setOwner_id(int owner_id) {
        this.owner_id = owner_id;
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

    public String getowner_cid() {
        return owner_cid;
    }

    public void setowner_cid(String owner_cid) {
        this.owner_cid = owner_cid;
    }

    public String getowner_tel() {
        return owner_tel;
    }

    public void setowner_tel(String owner_tel) {
        this.owner_tel = owner_tel;
    }

    public String getowner_sex() {
        return owner_sex;
    }

    public void setowner_sex(String owner_sex) {
        this.owner_sex = owner_sex;
    }

    public Timestamp getOwner_ctime() {
        return owner_ctime;
    }

    public void setOwner_ctime(Timestamp owner_ctime) {
        this.owner_ctime = owner_ctime;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "owner_id=" + owner_id +
                ", village_vid='" + village_vid + '\'' +
                ", unit_uid=" + unit_uid +
                ", room_rid='" + room_rid + '\'' +
                ", owner_rid=" + owner_rid +
                ", building_bid=" + building_bid +
                ", owner_addr='" + owner_addr + '\'' +
                ", owner_name='" + owner_name + '\'' +
                ", owner_cid='" + owner_cid + '\'' +
                ", owner_tel='" + owner_tel + '\'' +
                ", owner_sex='" + owner_sex + '\'' +
                ", owner_ctime=" + owner_ctime +
                '}';
    }
}
