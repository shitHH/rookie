package com.property.vo;

import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : CD
 * @ClassName ：资产VO表
 * @CreateTime 2022/9/13 14:36
 */
public class PropertyVO {
    /**
     * 编号
     */
    private int property_id;
    /**
     * 小区编号
     */
    private int village_vid;
    /**
     * 小区名称
     */
    private String village_name;
    /**
     * 资产编号
     */
    private String property_pid;
    /**
     * 资产名称
     */
    private String property_name;
    /**
     * 品牌
     */
    private String property_brand;
    /**
     * 购买单价
     */
    private  int property_price;
    /**
     * 购买数量
     */
    private int property_num;
    /**
     * 购买日期
     */
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date property_btime;
    /**
     * 预计使用年限
     */
    private  int property_age;
    /**
     * 创建时间
     */
    private Timestamp property_ctime;

    public PropertyVO() {
    }

    public PropertyVO(int property_id, int village_vid, String village_name, String property_pid, String property_name, String property_brand, int property_price, int property_num, Date property_btime, int property_age, Timestamp property_ctime) {
        this.property_id = property_id;
        this.village_vid = village_vid;
        this.village_name = village_name;
        this.property_pid = property_pid;
        this.property_name = property_name;
        this.property_brand = property_brand;
        this.property_price = property_price;
        this.property_num = property_num;
        this.property_btime = property_btime;
        this.property_age = property_age;
        this.property_ctime = property_ctime;
    }

    public int getProperty_id() {
        return property_id;
    }

    public void setProperty_id(int property_id) {
        this.property_id = property_id;
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

    public String getProperty_pid() {
        return property_pid;
    }

    public void setProperty_pid(String property_pid) {
        this.property_pid = property_pid;
    }

    public String getProperty_name() {
        return property_name;
    }

    public void setProperty_name(String property_name) {
        this.property_name = property_name;
    }

    public String getProperty_brand() {
        return property_brand;
    }

    public void setProperty_brand(String property_brand) {
        this.property_brand = property_brand;
    }

    public int getProperty_price() {
        return property_price;
    }

    public void setProperty_price(int property_price) {
        this.property_price = property_price;
    }

    public int getProperty_num() {
        return property_num;
    }

    public void setProperty_num(int property_num) {
        this.property_num = property_num;
    }

    public Date getProperty_btime() {
        return property_btime;
    }

    public void setProperty_btime(Date property_btime) {
        this.property_btime = property_btime;
    }

    public int getProperty_age() {
        return property_age;
    }

    public void setProperty_age(int property_age) {
        this.property_age = property_age;
    }

    public Timestamp getProperty_ctime() {
        return property_ctime;
    }

    public void setProperty_ctime(Timestamp property_ctime) {
        this.property_ctime = property_ctime;
    }
}
