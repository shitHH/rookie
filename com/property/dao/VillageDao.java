package com.property.dao;

import com.property.po.Village;

import com.property.vo.CarportCountVo;
import com.property.vo.CountVoVid;
import com.property.vo.VillageCountVo;
import com.property.vo.VillageVO;

import java.util.List;

/**
 * author: Eeerosss
 * date: 2022/9/11 2:15
 * 小区表实体类数据访问接口
 */
public interface VillageDao {
    /**
     * 查询所有小区
     * @return 小区对象集合
     */
    public List<Village> findAll();

    /**
     * 根据小区编号查询小区
     * @param village_vid 小区编号
     * @return 小区对象
     */
    public Village findByVillage_vid(int village_vid);

    /**
     * 根据小区名称查询小区
     * @param village_name 小区名称
     * @return 小区对象
     */
    public Village findByVillage_name(String village_name);

    /**
     * 查询所有
     * @return
     */
    public List<VillageVO> findAllVO();
    /**
     * @return 小区的集合
     */
    public List<VillageCountVo> findRoomCount();

    /**
     * @return
     */
    public List<CarportCountVo> findCarport();

    /**
     * 查询小区总户数的方法
     * @param village_vid 小区编号
     * @return 小区户数的对象
     */
    public CountVoVid findRCount(int village_vid);

    /**
     * 根据小区模糊查询
     * @param Village 小区对象
     * @return 小区对象的集合
     */
    public List<Village> findByVillageName (Village Village);

}
