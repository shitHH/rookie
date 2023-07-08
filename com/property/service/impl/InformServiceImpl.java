package com.property.service.impl;

import com.property.dao.InformDao;
import com.property.po.Inform;
import com.property.service.InformService;
import com.property.vo.InformVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : chengxia
 * @ClassName ：通知公告业务逻辑实现类
 * @create 2022-09-11 14:56
 */
@Service
public class InformServiceImpl implements InformService {


    @Autowired
    InformDao informDao;


    @Override
    public List<Inform> findAll() {
        return informDao.findAll();
    }

    @Override
    public List<InformVO> findVOAll() {
        return informDao.findVOAll();
    }

    @Override
    public Inform findById(int inform_id) {
        return informDao.findById(inform_id);
    }

    @Override
    public InformVO findVOById(int inform_id) {
        return informDao.findVOById(inform_id);
    }

    @Override
    public List<Inform> findByVid(int village_vid) {
        return informDao.findByVid(village_vid);
    }

    @Override
    public List<Inform> findByInformTitle(String inform_title) {
        return informDao.findByInformTitle(inform_title);
    }

    @Override
    public boolean add(Inform inform) {
        inform.setInform_ctime(new Timestamp(System.currentTimeMillis()));
        return informDao.add(inform)>0?true:false;
    }

    @Override
    public boolean update(Inform inform) {
        return informDao.update(inform)>1?true:false;
    }

    @Override
    public boolean delete(int[] array) {
        return informDao.delete(array)>1?true:false;
    }

    @Override
    public List<InformVO> findVOAllByVid(int vid) {
        return informDao.findVOAllByVid(vid);
    }

    @Override
    public List<InformVO> findInformlist(int village_vid) {
        return informDao.findInformlist(village_vid);
    }
}
