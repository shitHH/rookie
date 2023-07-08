package com.property.po;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : CD
 * @ClassName ：区县表
 * @CreateTime 2022/9/9 16:25
 */
public class Area {
    /**
     * 编号
     */
    private int area_id;
    /**
     * 区县编号
     */
    private String area_aid;
    /**
     * 区县名称
     */
    private String area_name;
    /**
     * 城市编号
     */
    private String city_cid;

    public Area() {
    }

    public Area(int area_id, String area_aid, String area_name, String city_cid) {
        this.area_id = area_id;
        this.area_aid = area_aid;
        this.area_name = area_name;
        this.city_cid = city_cid;
    }

    @Override
    public String toString() {
        return "area{" +
                "area_id=" + area_id +
                ", area_aid='" + area_aid + '\'' +
                ", area_name='" + area_name + '\'' +
                ", city_cid='" + city_cid + '\'' +
                '}';
    }

    public int getArea_id() {
        return area_id;
    }

    public void setArea_id(int area_id) {
        this.area_id = area_id;
    }

    public String getArea_aid() {
        return area_aid;
    }

    public void setArea_aid(String area_aid) {
        this.area_aid = area_aid;
    }

    public String getArea_name() {
        return area_name;
    }

    public void setArea_name(String area_name) {
        this.area_name = area_name;
    }

    public String getCity_cid() {
        return city_cid;
    }

    public void setCity_cid(String city_cid) {
        this.city_cid = city_cid;
    }
}
