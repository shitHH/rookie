package com.property.service.impl;

import com.property.dao.ParkingDao;
import com.property.po.Parking;
import com.property.service.ParkingService;
import com.property.vo.ParkingVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : CD
 * @ClassName ：
 * @CreateTime：2022/9/16 00160:30
 */
@Service
public class ParkingServiceImpl implements ParkingService {
    @Autowired
    ParkingDao parkingDao;

    @Override
    public List<Parking> findAll() {
        return parkingDao.findAll();
    }

    @Override
    public Parking findById(int parking_id) {
        return parkingDao.findById(parking_id);
    }


    @Override
    public Parking findByOwner_id(int owner_id) {
        return parkingDao.findByOwner_id(owner_id);
    }


    @Override
    public List<Parking> findByCarport_uid(int carport_uid) {
        return parkingDao.findByCarport_uid(carport_uid);
    }

    @Override
    public Parking findByCar_num(String car_num) {
        return parkingDao.findByCar_num(car_num);
    }

    @Override
    public boolean addParking(Parking parking) {

        parking.setParking_ctime(new Timestamp(System.currentTimeMillis()));
        return parkingDao.addParking(parking) > 0 ? true : false;
    }

    @Override
    public boolean updateParking(Parking parking) {
        return parkingDao.updateParking(parking) > 0 ? true : false;
    }

    @Override
    public List<ParkingVO> findAllVO() {
        return parkingDao.findAllVO();
    }

    @Override
    public List<ParkingVO> findAllVOByVid(int village_vid) {
        return parkingDao.findAllVOByVid(village_vid);
    }

    @Override
    public ParkingVO findAllVOByPid(int parking_id) {
        return parkingDao.findAllVOByPid(parking_id);
    }
}
