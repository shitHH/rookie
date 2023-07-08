package com.property.service.impl;

import com.property.dao.CarPortDao;
import com.property.dao.TemporaryDao;
import com.property.po.CarPort;
import com.property.po.Temporary;
import com.property.service.CarPortService;
import com.property.vo.CarportSumVo;
import com.property.vo.CarportVO;
import com.property.vo.CountVoVid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author bugger
 * @date 2022-09-12 1:05
 */
@Service
public class CarPortServiceImpl implements CarPortService {
    @Autowired
    CarPortDao carPortDao;

    @Autowired
    TemporaryDao temporaryDao;
    @Override
    public List<CarPort> findAll() {
        return carPortDao.findAll();
    }

    @Override
    public List<CarportVO> findAllVO() {
        return carPortDao.findAllVO();
    }

    @Override
    public CarPort findById(int carport_id) {
        return carPortDao.findById(carport_id);
    }

    @Override
    public boolean addCarPort(CarPort carPort) {
        return carPortDao.addCarPort(carPort)>0?true:false;
    }

    @Override
    public boolean updateCarPort(CarPort carPort) {
        return carPortDao.updateCarPort(carPort)>0?true:false;
    }

    @Override
    public boolean deleteCarPort(int carport_id) {
        return carPortDao.deleteCarPort(carport_id)>0?true:false;
    }

    @Override
    public List<CarportVO> findAllVOByVid(int village_vid) {
        return carPortDao.findAllVOByVid(village_vid);
    }

    @Override
    public List<CarportVO> findByVillage_vidAndCarport_lid(int village_vid, int carport_lid) {
        return carPortDao.findByVillage_vidAndCarport_lid(village_vid,carport_lid);
    }

    @Override
    public List<CarportVO> findByOwner_id(int owner_id) {
        return carPortDao.findByOwner_id(owner_id);
    }

    @Override
    public boolean updateCarPort2(CarPort carPort) {
        return carPortDao.updateCarPort2(carPort)>0?true:false;
    }

    @Override
    public boolean updateCarPort3(CarPort carPort) {
        return carPortDao.updateCarPort3(carPort)>0?true:false;
    }

    @Override
    public CountVoVid findCount(int village_vid) {
        return carPortDao.findCount(village_vid);
    }

    @Override
    public List<CarportSumVo> findCarportSum(int village_vid) {
        return carPortDao.findCarportSum(village_vid);
    }

    @Override
    public Map<String, List> findStatBar(int village_vid) {
        Map<String, List> map = new HashMap<>();
        List<CarportSumVo> list = carPortDao.findCarportSum(village_vid);
        List<String> names =new ArrayList<>() ;
        List<Integer> values =new ArrayList<>() ;
        for(CarportSumVo chartInfo :list){
            names.add(chartInfo.getName());
            values.add(chartInfo.getValue());
        }
        map.put("names",names);
        map.put("values",values);
        return map;
    }

    @Override
    public CarPort findByCar_num(String car_num) {
            Temporary temporary =new Temporary();
            temporary.setTemporary_carnum(car_num);
            temporary.setApproach_time(new Timestamp(System.currentTimeMillis()));
            temporaryDao.addTemporary(temporary);
            return carPortDao.findByCar_num(car_num);
    }

    @Override
    public CarPort findByCar_num2(String car_num) {
        return carPortDao.findByCar_num(car_num);
    }

    @Override
    public CarPort findByOwner_id2(int owner_id) {
        return carPortDao.findByOwner_id2(owner_id);
    }


    @Override
    public List<CarportVO> findAllUsageVO(int village_vid) {
        return carPortDao.findAllUsageVO(village_vid);
    }

    @Override
    public CarportVO findByCarportIdVO(int carport_id) {
        return carPortDao.findByCarportIdVO(carport_id);
    }

    @Override
    public CarportVO findAllVOByCid(int carport_id) {
        return carPortDao.findAllVOByCid(carport_id);
    }

    @Override
    public CarPort findByCar_numcd(String car_num) {
        return carPortDao.findByCar_num(car_num);
    }

    @Override
    public List<CarportVO> findAllVOByVidAndUid(int village_vid) {
        return carPortDao.findAllVOByVidAndUid(village_vid);
    }
}
