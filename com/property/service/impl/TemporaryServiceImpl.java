package com.property.service.impl;

import com.property.dao.TemporaryDao;
import com.property.po.Temporary;
import com.property.service.TemporaryService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

/**
 * @Author : bugger
 * @create 2022/9/18 13:19
 */
@Service
public class TemporaryServiceImpl implements TemporaryService {
    Logger logger = Logger.getLogger(TemporaryServiceImpl.class);
    @Autowired
    TemporaryDao temporaryDao;

    @Override
    public boolean addTemporary(Temporary temporary) {
        return temporaryDao.addTemporary(temporary) > 0 ? true : false;
    }

    @Override
    public boolean deleteTemporary(Temporary temporary) {
        return temporaryDao.deleteTemporary(temporary) > 0 ? true : false;
    }

    @Override
    public Temporary findByCar_num(String temporary_carnum) {
        return temporaryDao.findByCar_num(temporary_carnum);
    }

    @Override
    public boolean updateTime(Temporary temporary) {
        temporary.setPlaying_time(new Timestamp(System.currentTimeMillis()));
        return temporaryDao.updateTime(temporary) > 0 ? true : false;
    }

    @Override
    public boolean updateTime2(Temporary temporary) {
        temporary.setTemporary_carnum(temporary.getTemporary_carnum() + (int) (Math.random() * 10000 + 1));
        return temporaryDao.updateTime2(temporary) > 0 ? true : false;
    }

    @Override
    public List<Temporary> findAll() {
        List<Temporary> list = temporaryDao.findAll();
        for (Temporary temporary : list) {
            double fee = Math.round(temporary.getParking_fee());
            temporary.setParking_fee(fee);
        }
        return list;
    }

    @Override
    public int updateparkingfee(Temporary temporary) {
        return temporaryDao.updateparkingfee(temporary);
    }
}
