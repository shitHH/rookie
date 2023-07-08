package com.property.service.impl;

import com.property.dao.ComplaintDao;
import com.property.po.Complaint;
import com.property.service.ComplaintService;
import com.property.vo.ComplaintCountVo;
import com.property.vo.ComplaintVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : chengxia
 * @ClassName ：投诉业务逻辑实现类
 * @create 2022-09-11 14:50
 */
@Service
public class ComplaintServiceImpl  implements ComplaintService {

    @Autowired
    ComplaintDao complaintDao;

    @Override
    public List<Complaint> findAll() {
        return complaintDao.findAll();
    }

    @Override
    public List<ComplaintVO> findVOAll() {
        return complaintDao.findVOAll();
    }

    @Override
    public Complaint findById(int complaint_id) {
        return complaintDao.findById(complaint_id);
    }

    @Override
    public ComplaintVO findVOById(int complaint_id) {
        return complaintDao.findVOById(complaint_id);
    }

    @Override
    public List<ComplaintVO> findByOwnerId(int owner_id) {
        return complaintDao.findByOwnerId(owner_id);
    }

    @Override
    public boolean add(Complaint complaint) {
        complaint.setComplaint_ctime(new Timestamp(System.currentTimeMillis()));
        return complaintDao.add(complaint)>0?true:false;
    }

    @Override
    public boolean update(Complaint complaint) {
        return complaintDao.update(complaint)>1?true:false;
    }

    @Override
    public boolean delete(int[] array) {
        return complaintDao.delete(array)>1?true:false;
    }

    @Override
    public int findComplaintNum() {
        return complaintDao.findComplaintNum();
    }

    @Override
    public List<ComplaintCountVo> findComplaintCount() {
        return complaintDao.findComplaintCount();
    }

    @Override
    public List<ComplaintVO> findAllByVid(int vid) {
        return complaintDao.findAllByVid(vid);
    }

    @Override
    public List<ComplaintVO> findVOAllByVid(int vid) {
        return complaintDao.findVOAllByVid(vid);
    }
}
