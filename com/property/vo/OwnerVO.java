package com.property.vo;

import java.sql.Timestamp;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : chengxia
 * @ClassName ：业主VO
 * @create 2022-09-12 14:31
 */
public class OwnerVO {
    /**
     * 业主编号
     */
    private int owner_id;

    /**
     * 所属小区编号
     */
    private int village_vid;
    /**
     * 小区名称
     */
    private String village_name;
    /**
     * 楼宇编号
     */
    private int building_bid;
    /**
     * 楼宇名称
     */
    private String building_name;

    /**
     * 单元编号
     */
    private int unit_uid;
    /**
     * 单元名称
     */
    private String unit_name;

    /**
     * 房间编号
     */
    private int room_rid;
    /**
     * 房间号
     */
    private String room_name;

    /**
     * 户型
     */
    private String room_type;
    /**
     * 房产编码
     */
    private String room_code;

    /**
     * 业主角色编号
     */
    private int owner_rid;
    /**
     * 角色名称
     */
    private String owner_rname;


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

    public OwnerVO() {
    }

    public OwnerVO(int owner_id, int village_vid, String village_name, int building_bid, String building_name, int unit_uid, String unit_name, int room_rid, String room_name, String room_type, String room_code, int owner_rid, String owner_rname, String owner_addr, String owner_name, String owner_cid, String owner_tel, String owner_sex, Timestamp owner_ctime) {
        this.owner_id = owner_id;
        this.village_vid = village_vid;
        this.village_name = village_name;
        this.building_bid = building_bid;
        this.building_name = building_name;
        this.unit_uid = unit_uid;
        this.unit_name = unit_name;
        this.room_rid = room_rid;
        this.room_name = room_name;
        this.room_type = room_type;
        this.room_code = room_code;
        this.owner_rid = owner_rid;
        this.owner_rname = owner_rname;
        this.owner_addr = owner_addr;
        this.owner_name = owner_name;
        this.owner_cid = owner_cid;
        this.owner_tel = owner_tel;
        this.owner_sex = owner_sex;
        this.owner_ctime = owner_ctime;
    }

    @Override
    public String toString() {
        return "OwnerVO{" +
                "owner_id=" + owner_id +
                ", village_vid=" + village_vid +
                ", village_name='" + village_name + '\'' +
                ", building_bid=" + building_bid +
                ", building_name='" + building_name + '\'' +
                ", unit_uid=" + unit_uid +
                ", unit_name='" + unit_name + '\'' +
                ", room_rid=" + room_rid +
                ", room_name='" + room_name + '\'' +
                ", room_type='" + room_type + '\'' +
                ", room_code='" + room_code + '\'' +
                ", owner_rid=" + owner_rid +
                ", owner_rname='" + owner_rname + '\'' +
                ", owner_addr='" + owner_addr + '\'' +
                ", owner_name='" + owner_name + '\'' +
                ", owner_cid='" + owner_cid + '\'' +
                ", owner_tel='" + owner_tel + '\'' +
                ", owner_sex='" + owner_sex + '\'' +
                ", owner_ctime=" + owner_ctime +
                '}';
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

    public String getVillage_name() {
        return village_name;
    }

    public void setVillage_name(String village_name) {
        this.village_name = village_name;
    }

    public int getBuilding_bid() {
        return building_bid;
    }

    public void setBuilding_bid(int building_bid) {
        this.building_bid = building_bid;
    }

    public String getBuilding_name() {
        return building_name;
    }

    public void setBuilding_name(String building_name) {
        this.building_name = building_name;
    }

    public int getUnit_uid() {
        return unit_uid;
    }

    public void setUnit_uid(int unit_uid) {
        this.unit_uid = unit_uid;
    }

    public String getUnit_name() {
        return unit_name;
    }

    public void setUnit_name(String unit_name) {
        this.unit_name = unit_name;
    }

    public int getRoom_rid() {
        return room_rid;
    }

    public void setRoom_rid(int room_rid) {
        this.room_rid = room_rid;
    }

    public String getRoom_name() {
        return room_name;
    }

    public void setRoom_name(String room_name) {
        this.room_name = room_name;
    }

    public String getRoom_type() {
        return room_type;
    }

    public void setRoom_type(String room_type) {
        this.room_type = room_type;
    }

    public String getRoom_code() {
        return room_code;
    }

    public void setRoom_code(String room_code) {
        this.room_code = room_code;
    }

    public int getOwner_rid() {
        return owner_rid;
    }

    public void setOwner_rid(int owner_rid) {
        this.owner_rid = owner_rid;
    }

    public String getOwner_rname() {
        return owner_rname;
    }

    public void setOwner_rname(String owner_rname) {
        this.owner_rname = owner_rname;
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
}