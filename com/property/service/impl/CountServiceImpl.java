package com.property.service.impl;

import com.property.dao.CountDao;
import com.property.service.CountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : Eeerosss
 * @create 2022/9/16 10:08
 * 数据统计业务逻辑接口实现类
 */
@Service
public class CountServiceImpl implements CountService {
    @Autowired
    CountDao countDao;


    @Override
    public int findCarport_count() {
        return countDao.findCarport_count();
    }

    @Override
    public int findRoom_count() {
        return countDao.findRoom_count();
    }

    @Override
    public int findOwner_count() {
        return countDao.findOwner_count();
    }

    @Override
    public int findLessee_count() {
        return countDao.findLessee_count();
    }
}
