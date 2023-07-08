package com.property.service.impl;

import com.property.dao.RoomDao;
import com.property.po.Room;
import com.property.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * author: Eeerosss
 * date: 2022/9/12 0:04
 * 房间表实体类业务逻辑接口实现类
 */
@Service
public class RoomServiceImpl implements RoomService {
    @Autowired
    RoomDao roomDao;
    @Override
    public List<Room> findAll() {
        return roomDao.findAll();
    }

    @Override
    public Room findByRoom_rid(int room_rid) {
        return roomDao.findByRoom_rid(room_rid);
    }

    @Override
    public List<Room> findByRoom_name(String room_name) {
        return roomDao.findByRoom_name(room_name);
    }

    @Override
    public List<Room> findByRoom_type(String room_type) {
        return roomDao.findByRoom_type(room_type);
    }

    @Override
    public Room findByRoom_code(String room_code) {
        return roomDao.findByRoom_code(room_code);
    }

    @Override
    public List<Room> findByUnit_uid(int unit_uid) {
        return roomDao.findByUnit_uid(unit_uid);
    }
}
