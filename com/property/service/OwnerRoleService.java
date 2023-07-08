package com.property.service;

import com.property.po.OwnerRole;

import java.util.List;

/**
 * @author bugger
 * @date 2022-09-10 17:01
 * 业主角色业务逻辑接口
 */
public interface OwnerRoleService {
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
     * @return 是否成功
     */
    public boolean addOwnerRole(OwnerRole ownerRole);

    /**
     * 更新业主角色
     * @param ownerRole 业主角色对象
     * @return 是否成功
     */
    public boolean updateOwnerRole(OwnerRole ownerRole);

    /**
     * 删除业主角色
     * @param owner_rid 业主角色编号
     * @return 是否成功
     */
    public boolean deleteOwnerRole(int owner_rid);
}
