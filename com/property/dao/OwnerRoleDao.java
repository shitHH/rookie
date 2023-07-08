package com.property.dao;

import com.property.po.OwnerRole;

import java.util.List;

/**
 * @author bugger
 * @date 2022-09-10 16:50
 * 业主角色数据访问接口
 */
public interface OwnerRoleDao {

    /**
     * 查询所有业主角色
     * @return 业主角色对象的集合
     */
    public List<OwnerRole> findAll();

    /**
     * 根据业主角色编号查询业主角色
     * @param owner_rid 业主角色编号
     * @return 业主角色对象
     */
    public OwnerRole findById(int owner_rid);

    /**
     * 添加业主角色
     * @param ownerRole 业主角色对象
     * @return 受影响的行数
     */
    public int addOwnerRole(OwnerRole ownerRole);

    /**
     * 更新业主角色
     * @param ownerRole 业主角色对象
     * @return 受影响的行数
     */
    public int updateOwnerRole(OwnerRole ownerRole);

    /**
     * 删除业主角色
     * @param owner_rid 业主角色编号
     * @return 受影响的行数
     */
    public int deleteOwnerRole(int owner_rid);
}
