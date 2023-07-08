package com.property.vo;

import java.sql.Timestamp;

/**
 * @author 梁三岁
 * @version 1.0
 * @description: TODO
 * @name: 业主vo类
 * @date 2022/9/12 16:20
 */
public class OwnerVo1 {

    /**
     * 业主编号
     */
    private int owner_id;

    /**
     * 所属小区编号
     */
    private int village_vid;
    /**
     * 所属小区
     */
    private String village_name;

    /**
     * 单元编号
     */
    private int unit_uid;
    /**
     * 单元
     */
    private String unit_uname;

    /**
     * 房间编号
     */
    private int room_rid;
    /**
     * 房间
     */
    private String room_name;
    /**
     * 楼宇编号
     */
    private int building_bid;
    /**
     * 楼宇
     */
    private String building_bname;

    /**
     * 详细地址
     */
    private String owner_addr;
    /**
     * 业主密码
     */
    private String owner_pass;

    /**
     * 业主角色编号
     */
    private int owner_rid;
    /**
     * 业主角色
     */
    private String owner_rname;

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

    private int pet_id;

    private String pet_name;

    public OwnerVo1() {
    }

    public OwnerVo1(int owner_id, int village_vid, String village_name, int unit_uid, String unit_uname, int room_rid, String room_name, int building_bid, String building_bname, String owner_addr, String owner_pass, int owner_rid, String owner_rname, String owner_name, String owner_cid, String owner_tel, String owner_sex, Timestamp owner_ctime) {
        this.owner_id = owner_id;
        this.village_vid = village_vid;
        this.village_name = village_name;
        this.unit_uid = unit_uid;
        this.unit_uname = unit_uname;
        this.room_rid = room_rid;
        this.room_name = room_name;
        this.building_bid = building_bid;
        this.building_bname = building_bname;
        this.owner_addr = owner_addr;
        this.owner_pass = owner_pass;
        this.owner_rid = owner_rid;
        this.owner_rname = owner_rname;
        this.owner_name = owner_name;
        this.owner_cid = owner_cid;
        this.owner_tel = owner_tel;
        this.owner_sex = owner_sex;
        this.owner_ctime = owner_ctime;
    }

    public OwnerVo1(int owner_id, int village_vid, String village_name, int unit_uid, String unit_uname, int room_rid, String room_name, int building_bid, String building_bname, String owner_addr, String owner_pass, int owner_rid, String owner_rname, String owner_name, String owner_cid, String owner_tel, String owner_sex, Timestamp owner_ctime, int pet_id, String pet_name) {
        this.owner_id = owner_id;
        this.village_vid = village_vid;
        this.village_name = village_name;
        this.unit_uid = unit_uid;
        this.unit_uname = unit_uname;
        this.room_rid = room_rid;
        this.room_name = room_name;
        this.building_bid = building_bid;
        this.building_bname = building_bname;
        this.owner_addr = owner_addr;
        this.owner_pass = owner_pass;
        this.owner_rid = owner_rid;
        this.owner_rname = owner_rname;
        this.owner_name = owner_name;
        this.owner_cid = owner_cid;
        this.owner_tel = owner_tel;
        this.owner_sex = owner_sex;
        this.owner_ctime = owner_ctime;
        this.pet_id = pet_id;
        this.pet_name = pet_name;
    }

    public int getPet_id() {
        return pet_id;
    }

    public void setPet_id(int pet_id) {
        this.pet_id = pet_id;
    }

    public String getPet_name() {
        return pet_name;
    }

    public void setPet_name(String pet_name) {
        this.pet_name = pet_name;
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

    public int getUnit_uid() {
        return unit_uid;
    }

    public void setUnit_uid(int unit_uid) {
        this.unit_uid = unit_uid;
    }

    public String getUnit_uname() {
        return unit_uname;
    }

    public void setUnit_uname(String unit_uname) {
        this.unit_uname = unit_uname;
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

    public int getBuilding_bid() {
        return building_bid;
    }

    public void setBuilding_bid(int building_bid) {
        this.building_bid = building_bid;
    }

    public String getBuilding_bname() {
        return building_bname;
    }

    public void setBuilding_bname(String building_bname) {
        this.building_bname = building_bname;
    }

    public String getOwner_addr() {
        return owner_addr;
    }

    public void setOwner_addr(String owner_addr) {
        this.owner_addr = owner_addr;
    }

    public String getOwner_pass() {
        return owner_pass;
    }

    public void setOwner_pass(String owner_pass) {
        this.owner_pass = owner_pass;
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