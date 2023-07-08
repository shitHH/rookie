package com.property.service;

import com.property.po.Carport_LeasState;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : chengxia
 * @ClassName ：车位租赁状态业务逻辑接口
 * @create 2022-09-11 14:26
 */
public interface Carport_LeasStateService {
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
