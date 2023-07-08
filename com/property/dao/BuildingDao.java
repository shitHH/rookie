package com.property.dao;

import com.property.po.Building;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : CD
 * @ClassName ：楼宇表数据访问接口
 * @CreateTime：2022/9/12 11:25
 */
public interface BuildingDao {
    /**
     * 查询所有楼宇
     * @return 楼宇集合
     */
    public List<Building> findAll();

    /**
     * 根据楼宇id查询
     * @param building_bid 楼宇id
     * @return 楼宇对象
     */
    public Building findByBid(int building_bid);

    /**
     * 根据小区id查询
     * @param village_vid 小区id
     * @return 楼宇集合
     */
    public List<Building> findByVid(int village_vid);

    /**
     * 根据楼宇名称查询
     * @param building_name 楼宇名称
     * @return 楼宇集合
     */
    public List<Building> findByBname(String building_name);
}
