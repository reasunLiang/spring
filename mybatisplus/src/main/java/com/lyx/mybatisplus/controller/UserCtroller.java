package com.lyx.mybatisplus.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lyx.mybatisplus.dao.UserDao;
import com.lyx.mybatisplus.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author : lyx
 * @Date : 2020/10/25 11:41
 * @Version : 1.0
 */
@RestController
@RequestMapping("userMapper")
public class UserCtroller {

    @Autowired
    UserDao userDao;

    @GetMapping("find")
    public List<User> find() {
        return userDao.selectList(new QueryWrapper<>());
    }


    @GetMapping("findByIdd")
    public User selectById(Integer userId) {
        return  userDao.selectByIdd(userId);
    }
}
