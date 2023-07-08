package com.property.service;

import com.property.po.Property;
import com.property.vo.PropertyCountVo;
import com.property.vo.PropertyVO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * author: Eeerosss
 * date: 2022/9/11 23:38
 * 资产表业务逻辑接口
 */

public interface PropertyService {
    /**
     * 根据小区编号查询小区资产
     * @param village_vid 小区编号
     * @return 资产列表
     */
    public List<Property> findByVillage_vid(int village_vid);

    /**
     * 查询所有资产
     * @return  资产列表
     */
    public List<Property> findAll();
    /**
     * 查询所有资产
     * @return  资产列表
     */
    public List<PropertyVO> findAllVO(int village_vid);
    /**
     * 查询所有资产
     * @return 资产列表
     */
    public List<PropertyVO> findAllVOM();
    /**
     * 增加资产列表
     * @param property
     * @return 受影响行数
     */
    public boolean addProperty(Property property);
    /**
     * 删除资产
     * @param arrays
     * @return 受影响行数
     */
    public boolean deleteProperty(int[] arrays);

    /**
     * @return 投诉对象vo集合
     */
    public List<PropertyCountVo> findPropertyCount();

    /**
     * @return
     */
    public Map<String,List> findPropertyCount2();
}
