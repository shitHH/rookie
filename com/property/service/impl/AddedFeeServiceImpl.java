package com.property.service.impl;

import com.property.dao.AddedFeeDao;
import com.property.po.Addedfee;
import com.property.service.AddedFeeService;
import com.property.vo.AddedfeeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : CD
 * @ClassName ：增收费用业务逻辑实现
 * @CreateTime：2022/9/12 001214:45
 */
@Service
public class AddedFeeServiceImpl implements AddedFeeService {
    @Autowired
    AddedFeeDao addedFeeDao;
    @Override
    public List<Addedfee> findAll() {
        return addedFeeDao.findAll();
    }

    @Override
    public List<AddedfeeVO> findVOAll() {
        return addedFeeDao.findVOAll();
    }

    @Override
    public Addedfee findById(int addedfee_id) {
        return addedFeeDao.findById(addedfee_id);
    }

    @Override
    public AddedfeeVO findVOById(int addedfee_id) {
        return addedFeeDao.findVOById(addedfee_id);
    }

    @Override
    public List<Addedfee> findByVid(int village_vid) {
        return addedFeeDao.findByVid(village_vid);
    }

    @Override
    public List<Addedfee> findByAddedType(String addedfee_type) {
        return addedFeeDao.findByAddedType(addedfee_type);
    }

    @Override
    public boolean addAddedfee(Addedfee addedfee) {
        addedfee.setAddedfee_ctime(new Timestamp(System.currentTimeMillis()));
        return addedFeeDao.addAddedfee(addedfee)>0?true:false;
    }

    @Override
    public boolean deleteAddedfee(int[] array) {
        return addedFeeDao.deleteAddedfee(array)>0?true:false;
    }

    @Override
    public boolean updateAddedfee(Addedfee addedfee) {
        return addedFeeDao.updateAddedfee(addedfee)>0?true:false;
    }

    @Override
    public List<AddedfeeVO> findVOAllByVid(int vid) {
        return addedFeeDao.findVOAllByVid(vid);
    }
}
