package com.property.po;

import java.sql.Timestamp;

/**
 * @Author : bugger
 * @create 2022/9/9 15:42
 * 宠物类
 */
public class Pet {

    /**
     * 宠物信息编号
     */
    private int pet_id;

    /**
     * 业主编号
     */
    private int owner_id;

    /**
     * 宠物名称
     */
    private String pet_name;

    /**
     * 宠物图片
     */
    private String pet_jpg;

    /**
     * 创建时间
     */
    private Timestamp pet_ctime;


    public Pet() {
    }

    public Pet(int owner_id, String pet_name, String pet_jpg, Timestamp pet_ctime) {
        this.owner_id = owner_id;
        this.pet_name = pet_name;
        this.pet_jpg = pet_jpg;
        this.pet_ctime = pet_ctime;
    }

    public Pet(int pet_id, int owner_id, String pet_name, String pet_jpg, Timestamp pet_ctime) {
        this.pet_id = pet_id;
        this.owner_id = owner_id;
        this.pet_name = pet_name;
        this.pet_jpg = pet_jpg;
        this.pet_ctime = pet_ctime;
    }

    public int getpet_id() {
        return pet_id;
    }

    public void setpet_id(int pet_id) {
        this.pet_id = pet_id;
    }

    public int getowner_id() {
        return owner_id;
    }

    public void setowner_id(int owner_id) {
        this.owner_id = owner_id;
    }

    public String getpet_name() {
        return pet_name;
    }

    public void setpet_name(String pet_name) {
        this.pet_name = pet_name;
    }

    public String getpet_jpg() {
        return pet_jpg;
    }

    public void setpet_jpg(String pet_jpg) {
        this.pet_jpg = pet_jpg;
    }

    public Timestamp getpet_ctime() {
        return pet_ctime;
    }

    public void setpet_ctime(Timestamp pet_ctime) {
        this.pet_ctime = pet_ctime;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "pet_id=" + pet_id +
                ", owner_id=" + owner_id +
                ", pet_name='" + pet_name + '\'' +
                ", pet_jpg='" + pet_jpg + '\'' +
                ", pet_ctime=" + pet_ctime +
                '}';
    }
}
