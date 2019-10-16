package com.dhm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class JdbcTestController {
    @Autowired
    public JdbcTemplate jdbcTemplate;
    @ResponseBody
    @RequestMapping("/testJdbc")
    public Map jdbcTest(){
        List<Map<String, Object>> list = jdbcTemplate.queryForList("select * from hh");
        System.out.println(list);
        return list.get(0);
    }

}
