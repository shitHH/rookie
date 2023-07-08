package com.property.dao;

import com.property.po.Area;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : CD
 * @ClassName ：区县数据访问接口
 * @CreateTime：2022/9/12 11:17
 */
public interface AreaDao {
    /**
     * 查询所有区县
     * @return 区县集合
     */
    public List<Area> findAll();

    /**
     * 根据编号查询
     * @param area_id 编号
     * @return 区县对象
     */
    public Area findById(int area_id);

    /**
     * 根据区县编号查询
     * @param area_aid 区县编号
     * @return 区县对象
     */
    public Area findByAid(String area_aid);

    /**
     * 根据区县名称查询
     * @param area_name 区县名称
     * @return 区县对象
     */
    public Area findByAname(String area_name);

    /**
     * 根据城市编号查询
     * @param city_cid 城市编号
     * @return 区县集合
     */
    public List<Area> findByCid(String city_cid);
}
