package com.property.service;

import com.property.po.Room;

import java.util.List;

/**
 * author: Eeerosss
 * date: 2022/9/12 0:04
 * 房间表实体类业务逻辑接口
 */
public interface RoomService {
    /**
     * 查询所有房间
     * @return 房间表集合
     */
    public List<Room> findAll();

    /**
     * 根据房间编号查询房间对象
     * @param room_rid 房间编号
     * @return 房间对象
     */
    public Room findByRoom_rid(int room_rid);


    /**
     * 根据房间号查询房间对象集合
     * @param room_name 房间号
     * @return 房间对象集合
     */
    public List<Room> findByRoom_name(String room_name);

    /**
     * 根据户型查询房间对象集合
     * @param room_type 户型
     * @return 房间对象集合
     */
    public List<Room> findByRoom_type(String room_type);

    /**
     * 根据房产编码查询房间对象
     * @param room_code 房产编码
     * @return 房间对象
     */
    public Room findByRoom_code(String room_code);

    /**
     * 根据单元编号查询房间对象集合
     * @param unit_uid 单元编号
     * @return  房间对象集合
     */
    public List<Room> findByUnit_uid(int unit_uid);
}
