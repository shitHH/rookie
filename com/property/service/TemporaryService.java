package com.property.service;

import com.property.po.Temporary;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author : bugger
 * @create 2022/9/18 12:28
 * 临时停车业务逻辑接口
 */

public interface TemporaryService {
    /**
     * 添加临时停车
     * @param temporary 临时停车对象
     * @return 受影响的行数
     */
    public boolean addTemporary(Temporary temporary);
    /**
     * 删除临时停车
     * @param temporary 临时停车对象
     * @return 受影响的行数
     */
    public boolean deleteTemporary(Temporary temporary);
    /**
     * 根据车牌号查询进出场对象
     * @param temporary_carnum 车牌号
     * @return 进出场对象
     */
    public Temporary findByCar_num(String temporary_carnum);

    /**
     * @param temporary 对象
     * @return 时候修改成功
     */
    public boolean updateTime(Temporary temporary);
    /**
     * @param temporary 对象
     * @return 受影响行数
     */
    public boolean updateTime2(Temporary temporary);

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
