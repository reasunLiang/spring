package com.lyx.mybatisplus.enums;

import com.baomidou.mybatisplus.core.enums.IEnum;

/**
 * @author : lyx
 * @Date : 2020/10/26 12:34
 * @Version : 1.0
 */
public enum AgeEnums implements IEnum<Integer> {
    ONE(1, "一岁"),
    TWO(2, "两岁"),
    THREE(3, "三岁");

    private Integer code;
    private String name;

    AgeEnums(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    @Override
    public Integer getValue() {
        return code;
    }
}
