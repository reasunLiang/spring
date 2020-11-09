package com.lyx.mvc.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @author : lyx
 * @Date : 2020/11/2 17:24
 * @Version : 1.0
 */
@Data
public class Account implements Serializable {
    private String username;
    private String password;
    private String account;
    //    private User user;

    private List<User> list;
    private Map<String, User> map;

}
