package com.property.dao;

import com.property.po.Admin_Role;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : CD
 * @ClassName ：管理员角色数据访问接口
 * @CreateTime：2022/9/12 10:55
 */
public interface Admin_RoleDao {
    /**
     * 查询所有管理员角色
     * @return 管理员角色集合
     */
    public List<Admin_Role> findAll();

    /**
     * 根据管理员角色id查询
     * @param admin_rid 管理员角色id
     * @return 管理员角色对象
     */
    public Admin_Role findByRid(int admin_rid);

    /**
     * 根据管理员角色名称查询
     * @param admin_rname 管理员角色名称
     * @return 管理员角色对象
     */
    public Admin_Role findByRname(String admin_rname);

    /**
     * 增加管理员角色
     * @param admin_role 管理员角色对象
     * @return 受影响行数
     */
    public int addAdmin_Role(Admin_Role admin_role);

    /**
     * 删除管理员角色
     * @param admin_rid 管理员角色id
     * @return 受影响行数
     */
    public int deleteAdmin_Role(int admin_rid);

    /**
     * 更新管理员角色
     * @param admin_role 管理员角色
     * @return 受影响行数
     */
    public int updateAdmin_Role(Admin_Role admin_role);
}
