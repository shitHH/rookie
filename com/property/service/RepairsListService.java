package com.property.service;

import com.property.po.RepairsList;
import com.property.vo.RepairsListVid;
import com.property.vo.RepairsListVo;

import java.util.List;

/**
 * author: Eeerosss
 * date: 2022/9/11 23:55
 * 报修记录业务逻辑接口
 */
public interface RepairsListService {
    /**
     * 查询所有报修记录
     * @return 报修记录对象集合
     */
    public List<RepairsListVo> findAll();

    /**
     * 根据报修记录编号查询报修记录
     * @param repairslist_id 报修记录编号
     * @return 报修记录对象
     */
    public RepairsListVo findByRepairsList_id(int repairslist_id);


    /**
     * 根据报修对象查询报修记录集合
     * @param repairs_id 报修编号
     * @return 报修记录对象集合
     */
    public RepairsListVo findByRepairs_id(int repairs_id);

    /**
     * 根据管理员编号查询报修对象集合
     * @param admin_id 管理员编号
     * @return 报修记录对象集合
     */
    public  List<RepairsListVo> findByAdmin_id(int admin_id);

    /**
     * 根据报修状态查询报修对象集合
     * @param repairlist_stat 报修状态
     * @return 报修记录对象集合
     */
    public List<RepairsListVo> findByRepairList_stat(String repairlist_stat);

    /**
     * 增加报修记录
     * @param repairsList 报修记录对象
     * @return 添加是否成功
     */
    public boolean addRepairsList(RepairsList repairsList);

    /**
     * 修改报修记录
     * @param repairsList  报修记录对象
     * @return 修改是否成功
     */
    public boolean updateRepairsList(RepairsList repairsList);

    /**
     * 查询报修记录的数目
     * @return 报修记录的数目
     */
    public int findRepairListNum();
    /**
     * @param village_vid 小区编号
     * @return 小区报修记录集合
     */
    public List<RepairsListVid> findRepairslist(int village_vid);
}
