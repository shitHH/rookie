package com.property.service.impl;

import com.property.dao.AdminDao;
import com.property.po.Admin;
import com.property.service.AdminService;
import com.property.util.MD5Util;
import com.property.vo.AdminVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : CD
 * @ClassName ：管理员业务逻辑实现
 * @CreateTime：2022/9/12 001214:46
 */
@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    AdminDao adminDao;
    @Override
    public List<Admin> findAll() {
        return adminDao.findAll();
    }

    @Override
    public Admin findById(int admin_id) {
        return adminDao.findById(admin_id);
    }

    @Override
    public List<Admin> findBySid(int admin_sid) {
        return adminDao.findBySid(admin_sid);
    }

    @Override
    public List<Admin> findByRid(int admin_rid) {
        return adminDao.findByRid(admin_rid);
    }

    @Override
    public List<Admin> findByVid(int village_vid) {
        return adminDao.findByVid(village_vid);
    }

    @Override
    public List<Admin> findByName(String admin_name) {
        return adminDao.findByName(admin_name);
    }

    @Override
    public Admin findByTel(String admin_tel) {
        return adminDao.findByTel(admin_tel);
    }

    @Override
    public AdminVO addAdmin(Admin admin) {
        admin.setAdmin_pass(MD5Util.md5(admin.getAdmin_pass()));
        int i = adminDao.addAdmin(admin);
        AdminVO adminVO = adminDao.findVOById(i);
        return adminVO;
    }

    @Override
    public boolean deleteAdmin(int[] array) {
        return adminDao.deleteAdmin(array)>1?true:false;
    }

    @Override
    public boolean updateAdmin(Admin admin) {
        admin.setAdmin_pass(MD5Util.md5(admin.getAdmin_pass()));
        return adminDao.updateAdmin(admin)>0?true:false;
    }

    @Override
    public boolean updateAdminNOPass(Admin admin) {
        return adminDao.updateAdmin(admin)>0?true:false;
    }

    @Override
    public List<AdminVO> findVOAll() {
        return adminDao.findVOAll();
    }

    @Override
    public AdminVO findVOById(int admin_id) {
        return adminDao.findVOById(admin_id);
    }

    @Override
    public AdminVO findByTelAndPass(Admin admin) {
        //给用户对象的密码 加密
        admin.setAdmin_pass(MD5Util.md5(admin.getAdmin_pass()));
        return adminDao.findByTelAndPass(admin);
    }

    @Override
    public List<AdminVO> findVOByVid(int village_vid) {
        return adminDao.findVOByVid(village_vid);
    }

    @Override
    public boolean updateAdmin_vid(Admin admin) {
        return adminDao.updateAdmin_vid(admin)>0?true:false;
    }

    @Override
    public AdminVO findByTelv(String admin_tel) {
        return adminDao.findByTelv(admin_tel);
    }

    @Override
    public List<AdminVO> findVOByVids(List<Integer> list) {
        return adminDao.findVOByVids(list);
    }


}
