package com.property.service.impl;

import com.property.dao.RepairsListDao;
import com.property.po.RepairsList;
import com.property.service.RepairsListService;
import com.property.vo.RepairsListVid;
import com.property.vo.RepairsListVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

/**
 * author: Eeerosss
 * date: 2022/9/11 23:57
 * 报修记录业务逻辑接口实现类
 */
@Service
public class RepairsListServiceImpl implements RepairsListService {
    @Autowired
    RepairsListDao repairsListDao;
    @Override
    public List<RepairsListVo> findAll() {
        return repairsListDao.findAll();
    }

    @Override
    public RepairsListVo findByRepairsList_id(int repairslist_id) {
        return repairsListDao.findByRepairsList_id(repairslist_id);
    }

    @Override
    public RepairsListVo findByRepairs_id(int repairs_id) {
        return repairsListDao.findByRepairs_id(repairs_id);
    }

    @Override
    public List<RepairsListVo> findByAdmin_id(int admin_id) {
        return repairsListDao.findByAdmin_id(admin_id);
    }

    @Override
    public List<RepairsListVo> findByRepairList_stat(String repairlist_stat) {
        return repairsListDao.findByRepairList_stat(repairlist_stat);
    }

    @Override
    public boolean addRepairsList(RepairsList repairsList) {
        return repairsListDao.addRepairsList(repairsList)>0?true:false;
    }


    @Override
    public boolean updateRepairsList(RepairsList repairsList) {
        return repairsListDao.updateRepairsList(repairsList)>0?true:false;
    }

    @Override
    public int findRepairListNum() {
        return repairsListDao.findRepairListNum();
    }

    @Override
    public List<RepairsListVid> findRepairslist(int village_vid) {
        return repairsListDao.findRepairslist(village_vid);
    }
}
