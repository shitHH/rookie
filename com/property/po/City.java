package com.property.po;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : chengxia
 * @ClassName ：城市实体类
 * @CreateTime 2022/9/9 15:50
 */
public class City {
    /**
     * 编号
     */
    private int city_id;
    /**
     * 城市编号
     */
    private  String city_cid;
    /**
     * 城市名称
     */
    private String city_name;
    /**
     * 省份编号
     */
    private String province_pid;

    public City() {
    }

    public City(int city_id, String city_cid, String city_name, String province_pid) {
        this.city_id = city_id;
        this.city_cid = city_cid;
        this.city_name = city_name;
        this.province_pid = province_pid;
    }

    @Override
    public String toString() {
        return "City{" +
                "city_id=" + city_id +
                ", city_cid='" + city_cid + '\'' +
                ", city_name='" + city_name + '\'' +
                ", province_pid='" + province_pid + '\'' +
                '}';
    }

    public int getCity_id() {
        return city_id;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }

    public String getCity_cid() {
        return city_cid;
    }

    public void setCity_cid(String city_cid) {
        this.city_cid = city_cid;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    public String getProvince_pid() {
        return province_pid;
    }

    public void setProvince_pid(String province_pid) {
        this.province_pid = province_pid;
    }
}
