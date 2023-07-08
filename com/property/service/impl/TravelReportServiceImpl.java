package com.property.service.impl;

import com.property.dao.TravelReportDao;
import com.property.po.TravelReport;
import com.property.service.TravelReportService;
import com.property.vo.TravelreportVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

/**
 * author: Eeerosss
 * date: 2022/9/12 0:08
 * 行程报表实体类业务逻辑接口实现类
 */
@Service
public class TravelReportServiceImpl implements TravelReportService {
    @Autowired
    TravelReportDao travelReportDao;
    @Override
    public List<TravelReport> findAll() {
        return travelReportDao.findAll();
    }

    @Override
    public List<TravelreportVo> findVOAll() {
        return travelReportDao.findVOAll();
    }

    @Override
    public TravelReport findByTravelReport_id(int travelreport_id) {
        return travelReportDao.findByTravelReport_id(travelreport_id);
    }

    @Override
    public List<TravelReport> findByOwner_id(int owner_id) {
        return travelReportDao.findByOwner_id(owner_id);
    }

    @Override
    public List<TravelReport> findByProvince_pid(String province_pid) {
        return travelReportDao.findByProvince_pid(province_pid);
    }

    @Override
    public List<TravelReport> findByCity_cid(String city_cid) {
        return travelReportDao.findByCity_cid(city_cid);
    }

    @Override
    public List<TravelReport> findByArea_aid(String area_aid) {
        return travelReportDao.findByArea_aid(area_aid);
    }

    @Override
    public List<TravelReport> findByGo_time(Date go_time) {
        return travelReportDao.findByGo_time(go_time);
    }

    @Override
    public List<TravelReport> findByBack_time(Date back_time) {
        return travelReportDao.findByBack_time(back_time);
    }

    @Override
    public List<TravelReport> findByTravelReport_type(String travelreport_type) {
        return travelReportDao.findByTravelReport_type(travelreport_type);
    }

    @Override
    public boolean addTravelReport(TravelReport travelReport) {
        return travelReportDao.addTravelReport(travelReport)>0?true:false;
    }

    @Override
    public boolean updateTravelReport(TravelReport travelReport) {
        return travelReportDao.updateTravelReport(travelReport)>0?true:false;
    }

    @Override
    public List<TravelreportVo> findByowner_id(int owner_id) {
        return travelReportDao.findByowner_id(owner_id);
    }

    @Override
    public List<TravelreportVo> findVOAllByVid(int vid) {
        return travelReportDao.findVOAllByVid(vid);
    }
}
