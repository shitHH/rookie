package com.property.service;

import com.property.po.City;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : chengxia
 * @ClassName ：城市业务逻辑接口
 * @create 2022-09-11 14:28
 */
public interface CityService {
    /**
     * 根据城市编号 查询城市对象
     * @param city_cid 城市编号
     * @return 城市对象
     */
    public City findByCid(String city_cid);

    /**
     * 根据省份编号 查询城市对象集合
     * @param province_pid 省份编号
     * @return 城市对象集合
     */
    public List<City> findByPid(String province_pid);
}
