package com.lyx.mybatisplus.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.lyx.mybatisplus.enums.AgeEnums;
import com.lyx.mybatisplus.enums.StatusEnum;
import lombok.Data;

import java.util.Date;

/**
 * @author : lyx
 * @Date : 2020/10/25 11:38
 * @Version : 1.0
 */
@Data
@TableName(value = "user")
public class User {

    @TableId(type = IdType.NONE, value = "user_id")
    private Long userId;

    private String userName;
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;
    @Version
    private Integer version;

    private StatusEnum status;

    private AgeEnums age;
    private Integer deleted;
}
