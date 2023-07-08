package com.property.service.impl;

import com.property.dao.HcodeDao;
import com.property.po.Hcode;
import com.property.service.HcodeService;
import com.property.vo.HcodeVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : chengxia
 * @ClassName ：红黄码上报业务逻辑实现类
 * @create 2022-09-11 14:54
 */
@Service
public class HcodeServiceImpl implements HcodeService {

    @Autowired
    HcodeDao hcodeDao;

    @Override
    public List<Hcode> findAll() {
        return hcodeDao.findAll();
    }

    @Override
    public Hcode findById(int hcode_id) {
        return hcodeDao.findById(hcode_id);
    }

    @Override
    public List<Hcode> findByOwnerId(int owner_id) {
        return hcodeDao.findByOwnerId(owner_id);
    }

    @Override
    public List<Hcode> findByHcodeState(String hcode_state) {
        return hcodeDao.findByHcodeState(hcode_state);
    }

    @Override
    public boolean add(Hcode hcode) {
        hcode.setHcode_htime(new Timestamp(System.currentTimeMillis()));
        return hcodeDao.add(hcode)>0?true:false;
    }

    @Override
    public List<HcodeVo> findByOwner_id(int owner_id) {
        return hcodeDao.findByOwner_id(owner_id);
    }

    @Override
    public List<HcodeVo> findVOAll() {
        return hcodeDao.findVOAll();
    }

    @Override
    public List<HcodeVo> findVOAllByVid(int vid) {
        return hcodeDao.findVOAllByVid(vid);
    }
}
