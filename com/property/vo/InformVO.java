package com.property.vo;

import java.sql.Timestamp;

/**
 * @author bugger
 * @date 2022-09-14 23:03
 */
public class InformVO {
    /**
     * 通知公告编号
     */
    private int inform_id;
    /**
     * 小区编号
     */
    private int village_vid;
    /**
     * 公告标题
     */
    private String inform_title;
    /**
     * 内容
     */
    private String inform_content;
    /**
     * 创建时间
     */
    private Timestamp inform_ctime;

    /**
     * 小区名称
     */
    private String village_name;

    public InformVO() {
    }

    public InformVO(int inform_id, int village_vid, String inform_title, String inform_content, Timestamp inform_ctime, String village_name) {
        this.inform_id = inform_id;
        this.village_vid = village_vid;
        this.inform_title = inform_title;
        this.inform_content = inform_content;
        this.inform_ctime = inform_ctime;
        this.village_name = village_name;
    }

    public int getInform_id() {
        return inform_id;
    }

    public void setInform_id(int inform_id) {
        this.inform_id = inform_id;
    }

    public int getVillage_vid() {
        return village_vid;
    }

    public void setVillage_vid(int village_vid) {
        this.village_vid = village_vid;
    }

    public String getInform_title() {
        return inform_title;
    }

    public void setInform_title(String inform_title) {
        this.inform_title = inform_title;
    }

    public String getInform_content() {
        return inform_content;
    }

    public void setInform_content(String inform_content) {
        this.inform_content = inform_content;
    }

    public Timestamp getInform_ctime() {
        return inform_ctime;
    }

    public void setInform_ctime(Timestamp inform_ctime) {
        this.inform_ctime = inform_ctime;
    }

    public String getVillage_name() {
        return village_name;
    }

    public void setVillage_name(String village_name) {
        this.village_name = village_name;
    }

    @Override
    public String toString() {
        return "InformVO{" +
                "inform_id=" + inform_id +
                ", village_vid=" + village_vid +
                ", inform_title='" + inform_title + '\'' +
                ", inform_content='" + inform_content + '\'' +
                ", inform_ctime=" + inform_ctime +
                ", village_name='" + village_name + '\'' +
                '}';
    }
}
