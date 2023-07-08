package com.property.vo;

import java.sql.Timestamp;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 梁三岁
 * @name ：红黄码上报Vo
 * @create 2022/9/14 9:44
 */
public class HcodeVo {

    /**
     * 红黄码上报编号
     */
    private  int hcode_id;
    /**
     * 业主编号
     */
    private int owner_id;

    /**
     * 业主姓名
     */
    private String owner_name;

    /**
     * 业主家庭住址
     */
    private String owner_addr;
    /**
     * 健康码状态
     */
    private String hcode_state;
    /**
     * 健康码截图
     */
    private String hcode_jpg;
    /**
     * 创建时间
     */
    private Timestamp hcode_htime;

    public HcodeVo() {
    }

    public HcodeVo(int hcode_id, int owner_id, String owner_name, String owner_addr, String hcode_state, String hcode_jpg, Timestamp hcode_htime) {
        this.hcode_id = hcode_id;
        this.owner_id = owner_id;
        this.owner_name = owner_name;
        this.owner_addr = owner_addr;
        this.hcode_state = hcode_state;
        this.hcode_jpg = hcode_jpg;
        this.hcode_htime = hcode_htime;
    }

    public int getHcode_id() {
        return hcode_id;
    }

    public void setHcode_id(int hcode_id) {
        this.hcode_id = hcode_id;
    }

    public int getOwner_id() {
        return owner_id;
    }

    public void setOwner_id(int owner_id) {
        this.owner_id = owner_id;
    }

    public String getOwner_name() {
        return owner_name;
    }

    public void setOwner_name(String owner_name) {
        this.owner_name = owner_name;
    }

    public String getOwner_addr() {
        return owner_addr;
    }

    public void setOwner_addr(String owner_addr) {
        this.owner_addr = owner_addr;
    }

    public String getHcode_state() {
        return hcode_state;
    }

    public void setHcode_state(String hcode_state) {
        this.hcode_state = hcode_state;
    }

    public String getHcode_jpg() {
        return hcode_jpg;
    }

    public void setHcode_jpg(String hcode_jpg) {
        this.hcode_jpg = hcode_jpg;
    }

    public Timestamp getHcode_htime() {
        return hcode_htime;
    }

    public void setHcode_htime(Timestamp hcode_htime) {
        this.hcode_htime = hcode_htime;
    }
}
