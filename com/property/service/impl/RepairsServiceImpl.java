package com.property.service.impl;

import com.property.dao.RepairsDao;
import com.property.dao.RepairsListDao;
import com.property.po.Repairs;
import com.property.po.RepairsList;
import com.property.service.RepairsService;
import com.property.vo.RepairsVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

/**
 * author: Eeerosss
 * date: 2022/9/11 23:51
 * 报修表实体类业务逻辑接口实现类
 */
@Service
public class RepairsServiceImpl  implements RepairsService {
    @Autowired
    RepairsDao repairsDao;
    @Autowired
    RepairsListDao repairsListDao;

    @Override
    public List<Repairs> findAll() {
        return repairsDao.findAll();
    }

    @Override
    public List<RepairsVO> findVOAll() {
        return repairsDao.findVOAll();
    }

    @Override
    public Repairs findByRepairs_id(int repairs_id) {
        return repairsDao.findByRepairs_id(repairs_id);
    }

    @Override
    public RepairsVO findVOByRepairs_id(int repairs_id) {
        return repairsDao.findVOByRepairs_id(repairs_id);
    }

    @Override
    public List<RepairsVO> findByOwner_id(int owner_id) {
        return repairsDao.findByOwner_id(owner_id);
    }

    @Override
    public List<Repairs> findByRepairs_name(String repairs_name) {
        return repairsDao.findByRepairs_name(repairs_name);
    }

    @Override
    public boolean addRepairs(Repairs repairs) {
        return repairsDao.addRepairs(repairs)>0?true:false;
    }

    @Override
    public boolean updateRepairs(Repairs repairs) {
        return repairsDao.updateRepairs(repairs)>0?true:false;
    }

    @Override
    public int findRepairNum() {
        return repairsDao.findRepairNum();
    }

    @Override
    public List<RepairsVO> findAllByVid(int vid) {
        return repairsDao.findAllByVid(vid);
    }

    @Override
    public List<RepairsVO> findVOAllByVid(int vid) {
        return repairsDao.findVOAllByVid(vid);
    }


}
