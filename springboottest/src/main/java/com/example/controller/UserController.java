package com.example.controller;

import cn.hutool.core.convert.Convert;
import org.springframework.web.bind.annotation.*;

/**
 * @author lyx
 */
@RestController
@RequestMapping("/demo")
public class UserController {

    @RequestMapping("/hello")

    public String hello(String name) {
        return "Hello" + name;
    }

    @RequestMapping("/close")
    public String close() {
        return "This door is closed!";
    }
}
