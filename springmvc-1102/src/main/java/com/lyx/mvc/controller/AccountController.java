package com.lyx.mvc.controller;

import com.lyx.mvc.bean.Account;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : lyx
 * @Date : 2020/11/2 17:30
 * @Version : 1.0
 */
@RestController
@RequestMapping("/account")
public class AccountController {

    @PostMapping("/testParam")
    public String testParam(Account account) {
        System.out.println("执行了。。。。");
        System.out.println(account.toString());
        return "success";
    }
}
