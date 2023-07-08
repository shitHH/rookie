package com.property.service.impl;

import com.property.dao.PropertyDao;
import com.property.po.Property;
import com.property.service.PropertyService;
import com.property.vo.CarportCountVo;
import com.property.vo.PropertyCountVo;
import com.property.vo.PropertyVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

/**
 * author: Eeerosss
 * date: 2022/9/11 23:42
 * 资产表业务逻辑接口实现类
 */
@Service
public class PropertyServiceImpl implements PropertyService {
    @Autowired
    PropertyDao propertyDao;

    @Override
    public List<Property> findByVillage_vid(int village_vid) {
        return propertyDao.findByVillage_vid(village_vid);
    }

    @Override
    public List<Property> findAll() {
        return propertyDao.findAll();
    }

    @Override
    public List<PropertyVO> findAllVO(int village_vid) {
        return propertyDao.findAllVO(village_vid);
    }

    @Override
    public List<PropertyVO> findAllVOM() {
        return propertyDao.findAllVOM();
    }

    @Override
    public boolean addProperty(Property property) {
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        property.setProperty_btime(date.format(formatter));
        property.setProperty_ctime(new Timestamp(System.currentTimeMillis()));
        return propertyDao.addProperty(property)>0?true:false;
    }

    @Override
    public boolean deleteProperty(int[] arrays) {
        return propertyDao.deleteProperty(arrays)>0?true:false;
    }

    @Override
    public List<PropertyCountVo> findPropertyCount() {
        return propertyDao.findPropertyCount();
    }

    @Override
    public Map<String, List> findPropertyCount2() {
        Map<String, List> map = new HashMap<>();
        List<PropertyCountVo> list = propertyDao.findPropertyCount();
        List<String> names = new ArrayList<>();
        List<Integer> values = new ArrayList<>();
        for (PropertyCountVo info : list) {
            names.add(info.getName());
            values.add(info.getValue());
        }
        map.put("names", names);
        map.put("values", values);
        return map;
    }
}
