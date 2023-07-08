package com.property.service.impl;

import com.property.dao.ComplaintListDao;
import com.property.po.ComplaintList;
import com.property.service.ComplaintListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author bugger
 * @date 2022-09-12 1:03
 */
@Service
public class ComplaintListServiceImpl implements ComplaintListService {
    @Autowired
    ComplaintListDao complaintListDao;

    @Override
    public List<ComplaintList> findAll() {
        return complaintListDao.findAll();
    }

    @Override
    public ComplaintList findById(int complaintlist_id) {
        return complaintListDao.findById(complaintlist_id);
    }

    @Override
    public boolean addComplaintList(ComplaintList complaintList) {
        return complaintListDao.addComplaintList(complaintList)>0?true:false;
    }

    @Override
    public boolean updateComplaintList(ComplaintList complaintList) {
        return complaintListDao.updateComplaintList(complaintList)>0?true:false;
    }

    @Override
    public boolean deleteComplaintList(int complaintlist_id) {
        return complaintListDao.deleteComplaintList(complaintlist_id)>0?true:false;
    }

    @Override
    public int findComplaintListNum() {
        return complaintListDao.findComplaintListNum();
    }


}
