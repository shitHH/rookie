package com.property.controller;



import com.property.po.Area;
import com.property.po.City;
import com.property.po.Province;
import com.property.service.AreaService;
import com.property.service.CityService;
import com.property.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 梁三岁
 * @name ：
 * @create 2022/9/13 16:32
 */
@Controller
@RequestMapping("/owner")
public class PCAController {

	@Autowired
	ProvinceService provinceService;
	
	@Autowired
	CityService cityService;
	
	@Autowired
	AreaService areaService;
	
	@RequestMapping("/provincelist")
	@ResponseBody
	public List<Province> getProvice() {
		List<Province> list = provinceService.findAll();
		return list;
	}
	
	@RequestMapping("/citylist")
	@ResponseBody
	public List<City> getCity(String pid) {
		List<City> list = cityService.findByPid(pid);
		return list;
	}
	
	@RequestMapping("/arealist")
	@ResponseBody
	public List<Area> getArea(String cid) {
		List<Area> list = areaService.findByCid(cid);
		return list;
	}
}



























