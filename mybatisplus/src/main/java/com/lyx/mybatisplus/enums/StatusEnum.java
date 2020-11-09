package com.lyx.mybatisplus.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;

/**
 * @author : lyx
 * @Date : 2020/10/26 11:50
 * @Version : 1.0
 */
public enum StatusEnum {
    WORK(1, "上班"),
    REST(0, "下班");

    @EnumValue
    private Integer code;
    private String msg;

    StatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
