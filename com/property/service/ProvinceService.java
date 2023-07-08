package com.property.service;

import com.property.po.Province;

import java.util.List;

/**
 * author: Eeerosss
 * date: 2022/9/11 23:46
 * 省份表实体类业务逻辑接口
 */
public interface ProvinceService {
    /**
     * 查询所有省份
     * @return  省份集合
     */
    public List<Province> findAll();

    /**
     * 根据省份id查询成分对象
     * @param province_id  省份列表
     * @return  省份对象
     */
    public Province findObject(String province_id);
}
