package com.property.service;

import com.property.po.Repairs;
import com.property.vo.RepairsVO;

import java.util.List;

/**
 * author: Eeerosss
 * date: 2022/9/11 23:49
 * 报修表实体类业务逻辑接口
 */
public interface RepairsService {
    /**
     * 查询所有报修信息
     * @return 报修对象集合
     */
    public List<Repairs> findAll();

    /**
     * 查询所有报修视图信息
     * @return 报修对象集合
     */
    public List<RepairsVO> findVOAll();

    /**
     * 根据报修编号查询报修对象
     * @param repairs_id 保修编号
     * @return 保修对象
     */
    public Repairs findByRepairs_id(int repairs_id);

    /**
     * 根据报修编号查询报修视图对象
     * @param repairs_id 保修编号
     * @return 保修对象
     */
    public RepairsVO findVOByRepairs_id(int repairs_id);

    /**
     * 根据业主编号查询保修对象集合
     * @param owner_id 业主编号
     * @return 报修对象集合
     */
    public List<RepairsVO> findByOwner_id(int owner_id);

    /**
     * 根据报修设备名称查询报修对象集合
     * @param repairs_name 报修设备名称
     * @return 报修对象集合
     */
    public List<Repairs> findByRepairs_name( String repairs_name);

    /**
     * 新增报修信息
     * @param repairs 保修对象
     * @return 增加是否成功
     */
    public boolean addRepairs(Repairs repairs);


    /**
     * 修改报修信息
     * @param repairs 报修对象
     * @return 修改是否成功
     */
    public boolean updateRepairs(Repairs repairs);

    /**
     * 查找报修的数目
     * @return 报修的数目
     */
    public int findRepairNum();

    /**
     * 查询所有报修信息视图
     * @return 报修对象视图集合
     */
    public List<RepairsVO> findAllByVid(int vid);

    /**
     * 查询所有报修信息视图
     * @return 报修对象视图集合
     */
    public List<RepairsVO> findVOAllByVid(int vid);


}
