package com.property.po;

/**
 * @author : Eeerosss
 * @create 2022/9/9 15:29
 * 省份表实体类
 */
public class Province {
    /**
     * 编号
     */
    private int province_id;
    /**
     * 省份编号
     */
    private String province_pid;
    /**
     * 省份名称
     */
    private  String province_name;

    @Override
    public String toString() {
        return "Province{" +
                "province_id=" + province_id +
                ", province_pid='" + province_pid + '\'' +
                ", province_name='" + province_name + '\'' +
                '}';
    }

    public Province() {
    }

    public Province(int province_id, String province_pid, String province_name) {
        this.province_id = province_id;
        this.province_pid = province_pid;
        this.province_name = province_name;
    }

    public int getProvince_id() {
        return province_id;
    }

    public void setProvince_id(int province_id) {
        this.province_id = province_id;
    }

    public String getProvince_pid() {
        return province_pid;
    }

    public void setProvince_pid(String province_pid) {
        this.province_pid = province_pid;
    }

    public String getProvince_name() {
        return province_name;
    }

    public void setProvince_name(String province_name) {
        this.province_name = province_name;
    }
}
