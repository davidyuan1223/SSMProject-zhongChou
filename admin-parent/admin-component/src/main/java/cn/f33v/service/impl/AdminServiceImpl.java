package cn.f33v.service.impl;

import cn.f33v.entity.Admin;
import cn.f33v.entity.AdminExample;
import cn.f33v.mapper.AdminMapper;
import cn.f33v.service.api.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname AdminServiceImpl
 * @Description TODO
 * @Date 2020/11/21 17:57
 * @Created by Administrator
 */
@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;
    @Override
    public void saveAdmin(Admin admin) {
        adminMapper.insert(admin);
        //throw new RuntimeException();
    }

    @Override
    public List<Admin> findAll() {
        return adminMapper.selectByExample(new AdminExample());
    }
}
