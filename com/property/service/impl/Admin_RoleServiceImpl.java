package com.property.service.impl;

import com.property.dao.Admin_RoleDao;
import com.property.po.Admin_Role;
import com.property.service.Admin_RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : CD
 * @ClassName ：管理员角色业务逻辑实现
 * @CreateTime：2022/9/12 001214:46
 */
@Service
public class Admin_RoleServiceImpl implements Admin_RoleService {
    @Autowired
    Admin_RoleDao admin_roleDao;
    @Override
    public List<Admin_Role> findAll() {
        return admin_roleDao.findAll();
    }

    @Override
    public Admin_Role findByRid(int admin_rid) {
        return admin_roleDao.findByRid(admin_rid);
    }

    @Override
    public Admin_Role findByRname(String admin_rname) {
        return admin_roleDao.findByRname(admin_rname);
    }

    @Override
    public boolean addAdmin_Role(Admin_Role admin_role) {
        return admin_roleDao.addAdmin_Role(admin_role)>0?true:false;
    }

    @Override
    public boolean deleteAdmin_Role(int admin_rid) {
        return admin_roleDao.deleteAdmin_Role(admin_rid)>0?true:false;
    }

    @Override
    public boolean updateAdmin_Role(Admin_Role admin_role) {
        return admin_roleDao.updateAdmin_Role(admin_role)>0?true:false;
    }
}
