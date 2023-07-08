package com.property.service.impl;

import com.property.dao.UnitDao;
import com.property.po.Unit;
import com.property.service.UnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * author: Eeerosss
 * date: 2022/9/12 0:14
 * 单元表实体类业务逻辑接口实现类
 */
@Service
public class UnitServiceImpl  implements UnitService {
    @Autowired
    UnitDao unitDao;
    @Override
    public List<Unit> findAll() {
        return unitDao.findAll();
    }

    @Override
    public Unit findByUnit_uid(int unit_uid) {
        return unitDao.findByUnit_uid(unit_uid);
    }

    @Override
    public List<Unit> findByUnit_name(String unit_name) {
        return unitDao.findByUnit_name(unit_name);
    }

    @Override
    public List<Unit> findByBuilding_bid(int building_bid) {
        return unitDao.findByBuilding_bid(building_bid);
    }
}
