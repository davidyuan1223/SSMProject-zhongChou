package cn.f33v.mvc.handler;

import cn.f33v.entity.Admin;
import cn.f33v.service.api.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Classname testHandler
 * @Description TODO
 * @Date 2020/11/21 18:44
 * @Created by Administrator
 */
@Controller
@RequestMapping("/test")
public class testHandler {
    @Autowired
    private AdminService adminService;
    @RequestMapping("/ssm.html")
    public String testSsm(ModelMap modelMap){
        List<Admin> admins=adminService.findAll();
        modelMap.addAttribute("admins",admins);
        return "target";
    }
}
