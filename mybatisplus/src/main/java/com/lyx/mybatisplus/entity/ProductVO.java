package com.lyx.mybatisplus.entity;

import lombok.Data;

/**
 * @author : lyx
 * @Date : 2020/10/26 20:52
 * @Version : 1.0
 */
@Data
public class ProductVO {
    private Integer category;
    private Integer count;
    private String description;
    private Integer userId;
    private String userName;
}
