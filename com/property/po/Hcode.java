package com.property.po;

import java.sql.Timestamp;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : chengxia
 * @ClassName ：红黄码上报类
 * @CreateTime 2022/9/9 16:01
 */
public class Hcode {
    /**
     * 红黄码上报编号
     */
    private  int hcode_id;
    /**
     * 业主编号
     */
    private int owner_id;
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

    public Hcode() {
    }

    public Hcode(int hcode_id, int owner_id, String hcode_state, String hcode_jpg, Timestamp hcode_htime) {
        this.hcode_id = hcode_id;
        this.owner_id = owner_id;
        this.hcode_state = hcode_state;
        this.hcode_jpg = hcode_jpg;
        this.hcode_htime = hcode_htime;
    }

    @Override
    public String toString() {
        return "Hcode{" +
                "hcode_id=" + hcode_id +
                ", owner_id=" + owner_id +
                ", hcode_state='" + hcode_state + '\'' +
                ", hcode_jpg='" + hcode_jpg + '\'' +
                ", hcode_htime=" + hcode_htime +
                '}';
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
