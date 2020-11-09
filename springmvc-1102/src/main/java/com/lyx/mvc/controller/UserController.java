package com.lyx.mvc.controller;

import com.lyx.mvc.bean.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : lyx
 * @Date : 2020/11/5 14:14
 * @Version : 1.0
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping("saveUser")
    public String saveUser(User user) {
        System.out.println(user.toString());
        return "success";
    }
}
