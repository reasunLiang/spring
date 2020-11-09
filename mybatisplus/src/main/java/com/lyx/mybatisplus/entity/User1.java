package com.lyx.mybatisplus.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.util.Date;

/**
 * @author : lyx
 * @Date : 2020/10/24 10:39
 * @Version : 1.0
 */
@Data
@TableName(value = "classes")
public class User1 {
    @TableId(type = IdType.ASSIGN_UUID)
    private String classid;
    private String classname;

    @TableField(fill = FieldFill.INSERT)
    private Date createTime;
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;
}
