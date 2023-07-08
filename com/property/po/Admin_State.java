package com.property.po;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : CD
 * @ClassName ：管理员角色状态表
 * @CreateTime 2022/9/9 16:20
 */
public class Admin_State {
    /**
     * 角色状态编号
     */
    private int admin_sid;
    /**
     * 角色状态名称
     */
    private String admin_sname;

    public Admin_State() {
    }

    public Admin_State(int admin_sid, String admin_sname) {
        this.admin_sid = admin_sid;
        this.admin_sname = admin_sname;
    }

    @Override
    public String toString() {
        return "admin_state{" +
                "admin_sid=" + admin_sid +
                ", admin_sname='" + admin_sname + '\'' +
                '}';
    }

    public int getAdmin_sid() {
        return admin_sid;
    }

    public void setAdmin_sid(int admin_sid) {
        this.admin_sid = admin_sid;
    }

    public String getAdmin_sname() {
        return admin_sname;
    }

    public void setAdmin_sname(String admin_sname) {
        this.admin_sname = admin_sname;
    }
}
