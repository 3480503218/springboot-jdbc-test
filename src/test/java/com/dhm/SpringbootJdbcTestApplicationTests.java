package com.dhm;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootJdbcTestApplicationTests {
    @Autowired
DataSource dataSource;
    @Test
    public void contextLoads() throws SQLException {
        System.out.println("hdhdhddhdhdh"+dataSource.getClass());
        Connection connection = dataSource.getConnection();
        System.out.println("ffdf"+connection);
        connection.close();

    }

}
