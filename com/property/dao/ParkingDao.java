package com.property.dao;

import com.property.po.Parking;
import com.property.vo.ParkingVO;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : CD
 * @ClassName ：
 * @CreateTime：2022/9/16 00160:24
 */
public interface ParkingDao {
    public List<Parking> findAll();
    public Parking findById(int parking_id);
    public Parking findByOwner_id(int owner_id);
    public List<Parking> findByCarport_uid(int carport_uid);
    public Parking findByCar_num(String car_num);
    public int addParking(Parking parking);
    public int updateParking(Parking parking);
    public List<ParkingVO> findAllVO();
    public List<ParkingVO> findAllVOByVid(int village_vid);
    public ParkingVO findAllVOByPid(int parking_id);
}
