package com.panda.springbootstarterjdbcdemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootTest
class SpringbootStarterJdbcDemoApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    JdbcTemplate db2JdbcTemplate;

    @Test
    public void addData() {
        String sql = "insert into user_info(name, age) values ('apo', 18)";
        db2JdbcTemplate.execute(sql);
    }
}
