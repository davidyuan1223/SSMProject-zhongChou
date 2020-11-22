package cn.f33v.service.api;

import cn.f33v.entity.Admin;

import java.util.List;

/**
 * @Classname AdminService
 * @Description TODO
 * @Date 2020/11/21 17:57
 * @Created by Administrator
 */
public interface AdminService {
    void saveAdmin(Admin admin);
    List<Admin> findAll();
}
