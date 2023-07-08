package com.property.service.impl;

import com.property.dao.CarDao;
import com.property.po.Car;
import com.property.service.CarService;
import com.property.vo.CarVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : chengxia
 * @ClassName ：车辆业务逻辑实现类
 * @create 2022-09-11 14:36
 */
@Service
public class CarServiceImpl  implements CarService {

    @Autowired
    CarDao carDao;

    @Override
    public List<Car> findAll() {
        return carDao.findAll();
    }

    @Override
    public Car findById(int car_id) {
        return carDao.findById(car_id);
    }

    @Override
    public Car findByNum(String car_num) {
        return carDao.findByNum(car_num);
    }

    @Override
    public List<Car> findByOwnerId(int owner_id) {
        return carDao.findByOwnerId(owner_id);
    }

    @Override
    public boolean add(Car car) {
        car.setCar_ctime(new Timestamp(System.currentTimeMillis()));
        return carDao.add(car)>0?true:false;
    }

    @Override
    public boolean deleteById(int[] array) {
        return carDao.deleteById(array)>1?true:false;
    }

    @Override
    public boolean update(Car car) {
        return carDao.update(car)>1?true:false;
    }

    @Override
    public List<CarVO> findVOAllByVid(int village_vid) {
        return carDao.findVOAllByVid(village_vid);
    }

    @Override
    public List<CarVO> findVOAll() {
        return carDao.findVOAll();
    }

    @Override
    public Car findByOwnerId7(int owner_id) {
        return carDao.findByOwnerId7(owner_id);
    }
}
