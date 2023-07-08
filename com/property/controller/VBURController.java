package com.property.controller;

import com.property.po.Building;
import com.property.po.Room;
import com.property.po.Unit;
import com.property.po.Village;
import com.property.service.BuildingService;
import com.property.service.RoomService;
import com.property.service.UnitService;
import com.property.service.VillageService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author 梁三岁
 * @version 1.0
 * @description: TODO
 * @name: 小区、楼宇、单元、房间控制器
 * @date 2022/9/12 17:27
 */
@Controller
@RequestMapping("/owner")
public class VBURController {
    Logger logger = Logger.getLogger(VBURController.class);
    @Autowired
    VillageService villageService;
    @Autowired
    BuildingService buildingService;
    @Autowired
    UnitService unitService;
    @Autowired
    RoomService roomService;

    @RequestMapping("/villagelist")
    @ResponseBody
    public List<Village> getVillagelist() {
        logger.info("=============================================");
        List<Village> list = villageService.findAll();
        logger.info(list);
        return list;
    }
    @RequestMapping("/buildinglist")
    @ResponseBody
    public List<Building> getBuilding(int village_vid){
        List<Building> list = buildingService.findByVid(village_vid);
        return list;
    }
    @RequestMapping("/unitlist")
    @ResponseBody
    public List<Unit> getUnit(int building_bid){
        logger.info(building_bid);
        List<Unit> list = unitService.findByBuilding_bid(building_bid);
        return list;
    }
    @RequestMapping("/roomlist")
    @ResponseBody
    public List<Room> getRoom(int unit_uid){
        List<Room> list = roomService.findByUnit_uid(unit_uid);
        return list;
    }
}