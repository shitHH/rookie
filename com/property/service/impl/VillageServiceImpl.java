package com.property.service.impl;

import com.property.dao.VillageDao;
import com.property.po.Village;
import com.property.service.VillageService;

import com.property.vo.CarportCountVo;
import com.property.vo.CountVoVid;
import com.property.vo.VillageCountVo;
import com.property.vo.VillageVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * author: Eeerosss
 * date: 2022/9/12 0:17
 * 小区表实体类业务逻辑接口实现类
 */
@Service
public class VillageServiceImpl implements VillageService {
    @Autowired
    VillageDao villageDao;
    @Override
    public List<Village> findAll() {
        return villageDao.findAll();
    }

    @Override
    public Village findByVillage_vid(int village_vid) {
        return villageDao.findByVillage_vid(village_vid);
    }

    @Override
    public Village findByVillage_name(String village_name) {
        return villageDao.findByVillage_name(village_name);
    }

    @Override
    public List<VillageVO> findAllVO() {
        return villageDao.findAllVO();
    }

    @Override
    public List<VillageCountVo> findRoomCount() {
        return villageDao.findRoomCount();
    }

    @Override
    public List<CarportCountVo> findCarport() {
        return villageDao.findCarport();
    }

    @Override
    public Map<String, List> findStatBar() {
        Map<String, List> map = new HashMap<>();
        List<CarportCountVo> list = villageDao.findCarport();
        List<String> names = new ArrayList<>();
        List<Integer> values = new ArrayList<>();
        for (CarportCountVo info : list) {
            names.add(info.getName());
            values.add(info.getValue());
        }
        map.put("names", names);
        map.put("values", values);
        return map;
    }

    @Override
    public CountVoVid findRCount(int village_vid) {
        return villageDao.findRCount(village_vid);
    }

    @Override
    public List<Village> findByVillageName(Village Village) {
        return villageDao.findByVillageName(Village);
    }

}
