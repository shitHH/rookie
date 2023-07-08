package com.property.service.impl;

import com.property.dao.OwnerRoleDao;
import com.property.po.OwnerRole;
import com.property.service.OwnerRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author bugger
 * @date 2022-09-12 0:48
 */
@Service
public class OwnerRoleServiceImpl implements OwnerRoleService {
    @Autowired
    OwnerRoleDao ownerRoleDao;

    @Override
    public List<OwnerRole> findAll() {
        return ownerRoleDao.findAll();
    }

    @Override
    public OwnerRole findById(int owner_rid) {
        return ownerRoleDao.findById(owner_rid);
    }

    @Override
    public boolean addOwnerRole(OwnerRole ownerRole) {
        return ownerRoleDao.addOwnerRole(ownerRole)>0?true:false;
    }

    @Override
    public boolean updateOwnerRole(OwnerRole ownerRole) {
        return ownerRoleDao.updateOwnerRole(ownerRole)>0?true:false;
    }

    @Override
    public boolean deleteOwnerRole(int owner_rid) {
        return ownerRoleDao.deleteOwnerRole(owner_rid)>0?true:false;
    }
}
