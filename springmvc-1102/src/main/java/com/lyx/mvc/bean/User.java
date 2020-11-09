package com.lyx.mvc.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author : lyx
 * @Date : 2020/11/5 9:38
 * @Version : 1.0
 */

@Data
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    private String uname;
    private Integer age;
    private Date date;
    
}
