package com.property.service.impl;

import com.property.dao.ProvinceDao;
import com.property.po.Province;
import com.property.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * author: Eeerosss
 * date: 2022/9/11 23:47
 * 省份表实体类业务逻辑接口实现类
 */
@Service
public class ProvinceServiceImpl implements ProvinceService {
    @Autowired
    ProvinceDao provinceDao;
    @Override
    public List<Province> findAll() {
        return provinceDao.findAll();
    }

    @Override
    public Province findObject(String province_id) {
        return provinceDao.findObject(province_id);
    }
}
