package com.property.dao;

import com.property.po.Carport_LeasState;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : chengxia
 * @ClassName ：车位租赁状态数据访问接口
 * @CreateTime 2022/9/9 16:36
 */
public interface Carport_LeasStateDao {

    /**
     * 查询所有车位租赁状态对象
     * @return 车位租赁状态对象的集合
     */
    public List<Carport_LeasState> findAll();

    /**
     * 根据车位租赁状态编号，查询车位租赁状态
     * @param carport_lid 车位租赁状态编号
     * @return 车位租赁状态对象
     */
    public Carport_LeasState findBylid(int carport_lid);

}

