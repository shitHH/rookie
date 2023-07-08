package com.property.service.impl;

import com.property.dao.Carport_LeasStateDao;
import com.property.po.Carport_LeasState;
import com.property.service.Carport_LeasStateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : chengxia
 * @ClassName ：车位租赁状态业务逻辑实现类
 * @create 2022-09-11 14:41
 */
@Service
public class Carport_LeasStateServiceImpl  implements Carport_LeasStateService {
    @Autowired
    Carport_LeasStateDao carport_leasStateDao;


    @Override
    public List<Carport_LeasState> findAll() {
        return carport_leasStateDao.findAll();
    }

    @Override
    public Carport_LeasState findBylid(int carport_lid) {
        return carport_leasStateDao.findBylid(carport_lid);
    }
}
