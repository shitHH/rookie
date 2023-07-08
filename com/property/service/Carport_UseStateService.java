package com.property.service;

import com.property.po.Carport_UseState;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : chengxia
 * @ClassName ：车位使用状态业务逻辑接口
 * @create 2022-09-11 14:27
 */
public interface Carport_UseStateService {
    /**
     * 查询所有车位使用状态对象
     * @return 车位使用状态对象的集合
     */
    public List<Carport_UseState> findAll();
    /**
     * @param carport_uid 车位使用状态编号
     * @return 车位使用状态对象
     */
    public Carport_UseState findById(int carport_uid);
}
