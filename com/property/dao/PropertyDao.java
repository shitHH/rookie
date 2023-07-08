package com.property.dao;

import com.property.po.Property;
import com.property.po.Village;
import com.property.vo.ComplaintCountVo;
import com.property.vo.PropertyCountVo;
import com.property.vo.PropertyVO;

import java.util.List;

/**
 * @author : Eeerosss
 * @create 2022/9/9 16:22
 * 资产表数据访问接口
 */
public interface PropertyDao {

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
    public int addProperty(Property property);

    /**
     * 删除资产
     * @param arrays
     * @return 受影响行数
     */
    public int deleteProperty(int[] arrays);

    /**
     * @return 投诉对象vo集合
     */
    public List<PropertyCountVo> findPropertyCount();
}