package com.property.dao;

import com.property.po.Temporary;

import java.util.List;

/**
 * @Author : bugger
 * @create 2022/9/18 12:18
 * 临时停车数据访问层
 */
public interface TemporaryDao {
    /**
     * 添加临时停车
     * @param temporary 临时停车对象
     * @return 受影响的行数
     */
    public int addTemporary(Temporary temporary);

    /**
     * 删除临时停车
     * @param temporary 临时停车对象
     * @return 受影响的行数
     */
    public int deleteTemporary(Temporary temporary);

    /**
     * 根据车牌号查询进出场对象
     * @param temporary_carnum 车牌号
     * @return 进出场对象
     */
    public Temporary findByCar_num(String temporary_carnum);
    /**
     * @param temporary 对象
     * @return 受影响行数
     */
    public int updateTime(Temporary temporary);
    /**
     * @param temporary 对象
     * @return 受影响行数
     */
    public int updateTime2(Temporary temporary);

    /**
     * 查询所有临时停车的记录
     * @return 临时停车对象
     */
    public List<Temporary> findAll();

    /**
     * 更新停车费用
     * @param temporary 临时停车对象
     * @return 受影响行数
     */
    public int updateparkingfee(Temporary temporary);
}
