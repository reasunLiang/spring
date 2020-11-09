package com.lyx.mvc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : lyx
 * @Date : 2020/11/2 14:11
 * @Version : 1.0
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("sayHello")
    public String sayHello() {
        System.out.println("Hello");
        return "success";
    }

    @RequestMapping(value = "param", params = {"username", "password"})
    public String param(String username, String password) {
        System.out.println(username);
        System.out.println(password);
        return "success";
    }
}
