package com.property.vo;

import java.sql.Timestamp;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : chengxia
 * @ClassName ：
 * @CreateTime 2022/9/13 17:48
 */
public class PetVO {
    /**
     * 宠物信息编号
     */
    private int pet_id;
    /**
     * 宠物名称
     */
    private String pet_name;

    /**
     * 宠物图片
     */
    private String pet_jpg;

    /**
     * 业主编号
     */
    private int owner_id;
    /**
     * 业主姓名
     */
    private String owner_name;
    /**
     * 小区编号
     */
    private int village_vid;
    /**
     * 小区名称
     */
    private String village_name;

    /**
     * 创建时间
     */
    private Timestamp pet_ctime;

    public PetVO() {
    }

    public PetVO(int pet_id, String pet_name, String pet_jpg, int owner_id, String owner_name, int village_vid, String village_name, Timestamp pet_ctime) {
        this.pet_id = pet_id;
        this.pet_name = pet_name;
        this.pet_jpg = pet_jpg;
        this.owner_id = owner_id;
        this.owner_name = owner_name;
        this.village_vid = village_vid;
        this.village_name = village_name;
        this.pet_ctime = pet_ctime;
    }

    @Override
    public String toString() {
        return "PetVO{" +
                "pet_id=" + pet_id +
                ", pet_name='" + pet_name + '\'' +
                ", pet_jpg='" + pet_jpg + '\'' +
                ", owner_id=" + owner_id +
                ", owner_name='" + owner_name + '\'' +
                ", village_vid=" + village_vid +
                ", village_name='" + village_name + '\'' +
                ", pet_ctime=" + pet_ctime +
                '}';
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

    public String getPet_jpg() {
        return pet_jpg;
    }

    public void setPet_jpg(String pet_jpg) {
        this.pet_jpg = pet_jpg;
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

    public Timestamp getPet_ctime() {
        return pet_ctime;
    }

    public void setPet_ctime(Timestamp pet_ctime) {
        this.pet_ctime = pet_ctime;
    }
}
