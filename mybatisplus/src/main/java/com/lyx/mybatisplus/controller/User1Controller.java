package com.lyx.mybatisplus.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lyx.mybatisplus.dao.User1Dao;
import com.lyx.mybatisplus.entity.User1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author : lyx
 * @Date : 2020/10/24 11:06
 * @Version : 1.0
 */
@Controller
@RequestMapping(value = "user1Mapper")
public class User1Controller {

    @Autowired
    User1Dao user1Dao;

    @GetMapping("find")
    public List<User1> find() {
        System.out.println("hello world");
        System.out.println(user1Dao);
        return user1Dao.selectList(new QueryWrapper<>());
    }
}

