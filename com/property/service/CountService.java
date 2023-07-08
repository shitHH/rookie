package com.property.service;

/**
 * @author : Eeerosss
 * @create 2022/9/16 10:07
 * 数据统计业务逻辑接口
 */
public interface CountService {
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
