package com.property.service.impl;

import com.property.dao.Admin_StateDao;
import com.property.po.Admin_State;
import com.property.service.Admin_StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : CD
 * @ClassName ：管理员状态业务逻辑实现
 * @CreateTime：2022/9/12 001214:46
 */
@Service
public class Admin_StateServiceImpl implements Admin_StateService {
    @Autowired
    Admin_StateDao admin_stateDao;
    @Override
    public List<Admin_State> findAll() {
        return admin_stateDao.findAll();
    }

    @Override
    public Admin_State findBySid(int admin_sid) {
        return admin_stateDao.findBySid(admin_sid);
    }

    @Override
    public Admin_State findBySname(String admin_sname) {
        return admin_stateDao.findBySname(admin_sname);
    }
}
