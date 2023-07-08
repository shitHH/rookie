package com.property.service.impl;

import com.property.dao.CityDao;
import com.property.po.City;
import com.property.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : chengxia
 * @ClassName ：城市业务逻辑实现类
 * @create 2022-09-11 14:47
 */

@Service
public class CityServiceImpl  implements CityService {
     @Autowired
    CityDao cityDao;


    @Override
    public City findByCid(String city_cid) {
        return cityDao.findByCid(city_cid);
    }

    @Override
    public List<City> findByPid(String province_pid) {
        return cityDao.findByPid(province_pid);
    }
}
