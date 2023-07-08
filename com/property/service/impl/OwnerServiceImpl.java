package com.property.service.impl;

import com.property.dao.OwnerDao;
import com.property.po.Owner;
import com.property.service.OwnerService;
import com.property.util.MD5Util;
import com.property.vo.CountVoVid;
import com.property.vo.OwnerSumVo;
import com.property.vo.OwnerVO;
import com.property.vo.OwnerVo1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author bugger chengxia
 * @date 2022-09-12 0:46
 */
@Service
public class OwnerServiceImpl implements OwnerService {
    @Autowired
    OwnerDao ownerDao;

    @Override
    public List<Owner> findAll() {
        return ownerDao.findAll();
    }

    @Override
    public Owner findById(int owner_id) {
        return ownerDao.findById(owner_id);
    }

    @Override
    public boolean addOwner(Owner owner) {
        owner.setOwner_pass(MD5Util.md5(owner.getOwner_pass()));
        return ownerDao.addOwner(owner)>0?true:false;
    }

    @Override
    public boolean updateOwner(Owner owner) {
        owner.setOwner_pass(MD5Util.md5(owner.getOwner_pass()));
        return ownerDao.updateOwner(owner)>0?true:false;
    }

    @Override
    public boolean deleteOwner(int owner_id) {
        return ownerDao.deleteOwner(owner_id)>0?true:false;
    }

    @Override
    public List<OwnerVO> findVOAllByVid(int village_vid) {
        return ownerDao.findVOAllByVid(village_vid);
    }


    @Override
    public OwnerVO findVOById(int owner_id) {
        return ownerDao.findVOById(owner_id);
    }

    @Override
    public OwnerVo1 findTelAndPass(Owner owner) {
        owner.setOwner_pass(MD5Util.md5(owner.getOwner_pass()));
        return ownerDao.findTelAndPass(owner);
    }

    @Override
    public Owner findTel(String tel) {
        return ownerDao.findTel(tel);
    }

    @Override
    public Owner findTelAndVid(String owner_tel, int village_vid) {
        return ownerDao.findTelAndVid(owner_tel,village_vid);
    }

    @Override
    public Owner findTelAndCid(Owner owner) {
        return ownerDao.findTelAndCid(owner);
    }

    @Override
    public boolean reset(Owner owner) {
        return ownerDao.reset(owner)>0?true:false;
    }

    @Override
    public List<OwnerVO> findByVidVO(int village_vid) {
        return ownerDao.findByVidVO(village_vid);
    }

    @Override
    public CountVoVid findSum(int village_vid) {
        return ownerDao.findSum(village_vid);
    }

    @Override
    public CountVoVid findLSum(int village_vid) {
        return ownerDao.findLSum(village_vid);
    }

    @Override
    public List<OwnerSumVo> findSumVo(int village_vid) {
        return ownerDao.findSumVo(village_vid);
    }



    @Override
    public List<OwnerVO> findVOAll() {
        return ownerDao.findVOAll();
    }
}
