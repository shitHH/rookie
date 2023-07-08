package com.property.po;

/**
 * @Author : bugger
 * @create 2022/9/9 16:06
 * 业主角色实体类
 */
public class OwnerRole {
    /**
     * 业主角色编号
     */
    private int owner_rid;

    /**
     * 角色名称
     */
    private String owner_rname;

    public OwnerRole() {
    }

    public OwnerRole(int owner_rid, String owner_rname) {
        this.owner_rid = owner_rid;
        this.owner_rname = owner_rname;
    }

    public int getowner_rid() {
        return owner_rid;
    }

    public void setowner_rid(int owner_rid) {
        this.owner_rid = owner_rid;
    }

    public String getowner_rname() {
        return owner_rname;
    }

    public void setowner_rname(String owner_rname) {
        this.owner_rname = owner_rname;
    }

    @Override
    public String toString() {
        return "OwnerRole{" +
                "owner_rid=" + owner_rid +
                ", owner_rname='" + owner_rname + '\'' +
                '}';
    }
}
