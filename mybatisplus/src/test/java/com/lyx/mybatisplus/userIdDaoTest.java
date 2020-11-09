package com.lyx.mybatisplus;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lyx.mybatisplus.dao.User1Dao;
import com.lyx.mybatisplus.dao.UserDao;
import com.lyx.mybatisplus.entity.User;
import com.lyx.mybatisplus.entity.User1;
import com.lyx.mybatisplus.enums.AgeEnums;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Map;

/**
 * @author : lyx
 * @Date : 2020/10/24 11:37
 * @Version : 1.0
 */
@SpringBootTest
class userIdDaoTest {

    @Autowired
    private User1Dao user1Dao;

    @Autowired
    private UserDao userDao;

    @Test
    void test() {
        user1Dao.selectList(null).forEach(System.out::println);
    }

    @Test
    void save() {
        User1 user1 = new User1();
        user1.setClassname("就这？");
        System.out.println(user1.getClassid());
        user1Dao.insert(user1);
        System.out.println(user1);
    }

    @Test
    void update() {
        User1 user1 = user1Dao.selectById(7);
        user1.setClassname("lyx");
        System.out.println(user1Dao.updateById(user1));
        ;


    }

    @Test
    void insert() {
        User user = new User();
        user.setUserName("就这？");
        System.out.println(user.getUserId());
        userDao.insert(user);
        System.out.println(user);
    }
//
//    @Test
//    void updateName() {
//        User user = userDao.selectById(7);
//        user.setUserName("lyx");
//        User user2 = userDao.selectById(7);
//        user2.setUserName("就这2");
//        //线程 1:update ... set version = 2  where version = 1
//        userDao.updateById(user2);
//        //线程2 ：update ... set version = 2 where version = 1
//        userDao.updateById(user);
//    }

    @Test
    void select() {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("user_name", "就这2");
        userDao.selectList(queryWrapper).forEach(System.out::println);
    }

    @Test
    void selectAll() {
        QueryWrapper queryWrapper = new QueryWrapper();
//        Map<String,Object> map = new HashMap<>();
//        map.put("user_name","就这");
//        map.put("age",3);
//        queryWrapper.allEq(map);
//        queryWrapper.inSql("user_id","select user_id from user where user_id <= 9");
//        queryWrapper.inSql("age","select age from user where age > 2");
//        queryWrapper.orderByAsc("age");
//        queryWrapper.having("age>=2");

//        userDao.selectList(queryWrapper).forEach(System.out::println);
//        List<Map<String, Object>> maps = userDao.selectMaps(null);
//        Page<User> page = new Page<>(2,2);
//        Page<User> result = userDao.selectPage(page,null);
//        System.out.println(result.getSize());
//        System.out.println(result.getTotal());
//        result.getRecords().forEach(System.out::println);
        Page<Map<String, Object>> map = new Page<>(1, 2);
        userDao.selectMapsPage(map, null).getRecords().forEach(System.out::println);
    }


    @Test
    void setAge() {
        User user = new User();
        user.setAge(AgeEnums.THREE);
        user.setUserName("还行吧");

        userDao.insert(user);
    }

    @Test
    void delete() {
        userDao.deleteById(7);
    }

    @Test
    void selectVO(){
        userDao.productList(7).forEach(System.out::println);
    }
}