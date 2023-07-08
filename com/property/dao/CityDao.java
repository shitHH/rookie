package com.property.dao;

import com.property.po.City;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : chengxia
 * @ClassName ：城市数据访问接口
 * @CreateTime 2022/9/9 17:27
 */
public interface CityDao {

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
