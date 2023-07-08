package com.property.dao;

/**
 * @author : Eeerosss
 * @create 2022/9/16 9:55
 * 数据统计类数据访问接口
 */
public interface CountDao {
    /**
     * @return 车位数量
     */
    public int findCarport_count();

    /**
     * @return 总户数
     */
    public int findRoom_count();

    /**
     * @return 总人数
     */
    public int findOwner_count();

    /**
     * @return 租户数量
     */
    public int findLessee_count();
}
