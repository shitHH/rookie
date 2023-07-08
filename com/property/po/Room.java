package com.property.po;

/**
 * @author : Eeerosss
 * @create 2022/9/9 15:48
 * 房间表实体类
 */
public class Room {
    /**
     * 房间编号
     */
    private int room_rid;
    /**
     * 房间号
     */
    private String room_name;
    /**
     * 户型
     */
    private String room_type;
    /**
     * 房产编码
     */
    private String room_code;
    /**
     * 单元编号
     */
    private  int unit_uid;

    @Override
    public String toString() {
        return "Room{" +
                "room_rid=" + room_rid +
                ", room_name='" + room_name + '\'' +
                ", room_type='" + room_type + '\'' +
                ", room_code='" + room_code + '\'' +
                ", unit_id=" + unit_uid +
                '}';
    }

    public Room() {
    }

    public Room(int room_rid, String room_name, String room_type, String room_code, int unit_id) {
        this.room_rid = room_rid;
        this.room_name = room_name;
        this.room_type = room_type;
        this.room_code = room_code;
        this.unit_uid = unit_id;
    }

    public int getRoom_rid() {
        return room_rid;
    }

    public void setRoom_rid(int room_rid) {
        this.room_rid = room_rid;
    }

    public String getRoom_name() {
        return room_name;
    }

    public void setRoom_name(String room_name) {
        this.room_name = room_name;
    }

    public String getRoom_type() {
        return room_type;
    }

    public void setRoom_type(String room_type) {
        this.room_type = room_type;
    }

    public String getRoom_code() {
        return room_code;
    }

    public void setRoom_code(String room_code) {
        this.room_code = room_code;
    }

    public int getUnit_id() {
        return unit_uid;
    }

    public void setUnit_id(int unit_id) {
        this.unit_uid = unit_id;
    }
}
