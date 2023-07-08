package com.property.vo;

import java.sql.Timestamp;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : chengxia
 * @ClassName ：管理员VO
 * @CreateTime 2022/9/13 8:32
 */
public class AdminVO {
    /**
     * 管理员编号
     */
    private int admin_id;
    /**
     * 角色状态编号
     */
    private int admin_sid;
    /**
     * 角色状态名称
     */
    private String admin_sname;
    /**
     * 角色编号
     */
    private int admin_rid;
    /**
     * 角色名称
     */
    private String admin_rname;
    /**
     * 小区编号
     */
    private int village_vid;
    /**
     * 小区名称
     */
    private String village_name;
    /**
     * 用户名
     */
    private String admin_name;
    /**
     * 电话号码
     */
    private String admin_tel;
    /**
     * 密码
     */
    private String admin_pass;
    /**
     * 创建时间
     */
    private Timestamp admin_time;

    public AdminVO() {
    }

    public AdminVO(int admin_id, int admin_sid, String admin_sname, int admin_rid, String admin_rname, int village_vid, String village_name, String admin_name, String admin_tel, String admin_pass, Timestamp admin_time) {
        this.admin_id = admin_id;
        this.admin_sid = admin_sid;
        this.admin_sname = admin_sname;
        this.admin_rid = admin_rid;
        this.admin_rname = admin_rname;
        this.village_vid = village_vid;
        this.village_name = village_name;
        this.admin_name = admin_name;
        this.admin_tel = admin_tel;
        this.admin_pass = admin_pass;
        this.admin_time = admin_time;
    }

    @Override
    public String toString() {
        return "AdminVO{" +
                "admin_id=" + admin_id +
                ", admin_sid=" + admin_sid +
                ", admin_sname='" + admin_sname + '\'' +
                ", admin_rid=" + admin_rid +
                ", admin_rname='" + admin_rname + '\'' +
                ", village_vid=" + village_vid +
                ", village_name='" + village_name + '\'' +
                ", admin_name='" + admin_name + '\'' +
                ", admin_tel='" + admin_tel + '\'' +
                ", admin_pass='" + admin_pass + '\'' +
                ", admin_time=" + admin_time +
                '}';
    }

    public int getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(int admin_id) {
        this.admin_id = admin_id;
    }

    public int getAdmin_sid() {
        return admin_sid;
    }

    public void setAdmin_sid(int admin_sid) {
        this.admin_sid = admin_sid;
    }

    public String getAdmin_sname() {
        return admin_sname;
    }

    public void setAdmin_sname(String admin_sname) {
        this.admin_sname = admin_sname;
    }

    public int getAdmin_rid() {
        return admin_rid;
    }

    public void setAdmin_rid(int admin_rid) {
        this.admin_rid = admin_rid;
    }

    public String getAdmin_rname() {
        return admin_rname;
    }

    public void setAdmin_rname(String admin_rname) {
        this.admin_rname = admin_rname;
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

    public String getAdmin_name() {
        return admin_name;
    }

    public void setAdmin_name(String admin_name) {
        this.admin_name = admin_name;
    }

    public String getAdmin_tel() {
        return admin_tel;
    }

    public void setAdmin_tel(String admin_tel) {
        this.admin_tel = admin_tel;
    }

    public String getAdmin_pass() {
        return admin_pass;
    }

    public void setAdmin_pass(String admin_pass) {
        this.admin_pass = admin_pass;
    }

    public Timestamp getAdmin_time() {
        return admin_time;
    }

    public void setAdmin_time(Timestamp admin_time) {
        this.admin_time = admin_time;
    }
}

