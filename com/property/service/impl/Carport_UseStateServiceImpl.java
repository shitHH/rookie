package com.property.service.impl;

import com.property.dao.Carport_UseStateDao;
import com.property.po.Carport_UseState;
import com.property.service.Carport_UseStateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : chengxia
 * @ClassName ：车位使用状态业务逻辑实现类
 * @create 2022-09-11 14:45
 */
@Service
public class Carport_UseStateServiceImpl implements Carport_UseStateService {
    @Autowired
    Carport_UseStateDao carport_useStateDao;

    @Override
    public List<Carport_UseState> findAll() {
        return carport_useStateDao.findAll();
    }

    @Override
    public Carport_UseState findById(int carport_uid) {
        return carport_useStateDao.findById(carport_uid);
    }
}

