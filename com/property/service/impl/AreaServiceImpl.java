package com.property.service.impl;

import com.property.dao.AreaDao;
import com.property.po.Area;
import com.property.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : CD
 * @ClassName ：区县业务逻辑实现
 * @CreateTime：2022/9/12 001214:46
 */
@Service
public class AreaServiceImpl implements AreaService {
    @Autowired
    AreaDao areaDao;
    @Override
    public List<Area> findAll() {
        return areaDao.findAll();
    }

    @Override
    public Area findById(int area_id) {
        return areaDao.findById(area_id);
    }

    @Override
    public Area findByAid(String area_aid) {
        return areaDao.findByAid(area_aid);
    }

    @Override
    public Area findByAname(String area_name) {
        return areaDao.findByAname(area_name);
    }

    @Override
    public List<Area> findByCid(String city_cid) {
        return areaDao.findByCid(city_cid);
    }
}
