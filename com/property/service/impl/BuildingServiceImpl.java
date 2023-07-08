package com.property.service.impl;

import com.property.dao.BuildingDao;
import com.property.po.Building;
import com.property.service.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : CD
 * @ClassName ：楼宇业务逻辑实现
 * @CreateTime：2022/9/12 001214:47
 */
@Service
public class BuildingServiceImpl implements BuildingService {
    @Autowired
    BuildingDao buildingDao;
    @Override
    public List<Building> findAll() {
        return buildingDao.findAll();
    }

    @Override
    public Building findByBid(int building_bid) {
        return buildingDao.findByBid(building_bid);
    }

    @Override
    public List<Building> findByVid(int village_vid) {
        return buildingDao.findByVid(village_vid);
    }

    @Override
    public List<Building> findByBname(String building_name) {
        return buildingDao.findByBname(building_name);
    }
}
