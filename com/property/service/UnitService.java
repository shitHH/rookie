package com.property.service;

import com.property.po.Unit;

import java.util.List;

/**
 * author: Eeerosss
 * date: 2022/9/12 0:13
 * 单元表实体类业务逻辑接口
 */
public interface UnitService {

    /**
     * 查询所有单元
     * @return 单元对象集合
     */
    public List<Unit> findAll();

    /**
     * 根据单元编号查询单元对象集合
     * @param unit_uid 单元编号
     * @return 单元对象集合
     */
    public Unit findByUnit_uid(int unit_uid);

    /**
     * 根据单元名称查询单元对象集合
     * @param unit_name 单元名称
     * @return 单元对象集合
     */
    public List<Unit> findByUnit_name(String unit_name);

    /**
     * 根据楼宇编号查询单元对象集合
     * @param building_bid 楼宇编号
     * @return 单元对象集合
     */
    public List<Unit> findByBuilding_bid(int building_bid);
}
