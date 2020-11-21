package cn.f33v.test;

import cn.f33v.entity.Admin;
import cn.f33v.mapper.AdminMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @Classname dataTest
 * @Description TODO
 * @Date 2020/11/21 14:40
 * @Created by Administrator
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-persist-mybatis.xml"})
public class dataTest {
    @Autowired
    private DataSource dataSource;
    @Autowired
    private AdminMapper adminMapper;
    @Test
    public void testInsertAdmin(){
        Admin admin = new Admin(null, "tom", "123456", "tom", "1406957364@qq.com", null);
        int count = adminMapper.insert(admin);
        System.out.println(count);
    }
    @Test
    public void testConnection() throws SQLException {
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
    }
}
