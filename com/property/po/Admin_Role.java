package com.property.po;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : CD
 * @ClassName ：管理员角色表
 * @CreateTime 2022/9/9 16:18
 */
public class Admin_Role {
    /**
     * 角色编号
     */
    private int admin_rid;
    /**
     * 角色名称
     */
    private String admin_rname;

    public Admin_Role() {
    }

    public Admin_Role(int admin_rid, String admin_rname) {
        this.admin_rid = admin_rid;
        this.admin_rname = admin_rname;
    }

    @Override
    public String toString() {
        return "admin_role{" +
                "admin_rid=" + admin_rid +
                ", admin_rname='" + admin_rname + '\'' +
                '}';
    }

    public int getAdmin_rid() {
        return admin_rid;
    }

    public void setAdmin_rid(int admin_rid) {
        this.admin_rid = admin_rid;
    }

    public String getAdmin_rname() {
        return admin_rname;
    }

    public void setAdmin_rname(String admin_rname) {
        this.admin_rname = admin_rname;
    }
}
