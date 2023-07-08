package com.property.dao;

import com.property.po.Admin_Role;
import com.property.po.Admin_State;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : CD
 * @ClassName ：管理员状态数据访问接口
 * @CreateTime：2022/9/12 11:12
 */
public interface Admin_StateDao {

    /**
     * 查询管理员状态
     * @return 管理员状态集合
     */
    public List<Admin_State> findAll();


    /**
     * 根据管理员状态编号查询
     * @param admin_sid 管理员状态编号
     * @return 管理员状态对象
     */
    public Admin_State findBySid(int admin_sid);


    /**
     * 根据管理员状态名称查询
     * @param admin_sname 管理员状态名称
     * @return 管理员状态对象
     */
    public Admin_State findBySname(String admin_sname);
}
