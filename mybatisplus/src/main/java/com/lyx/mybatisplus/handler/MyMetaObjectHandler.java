package com.lyx.mybatisplus.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author : lyx
 * @Date : 2020/10/25 11:02
 * @Version : 1.0
 */
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {
    //在插入的时候执行该操作

    @Override
    public void insertFill(MetaObject metaObject) {
        //createTime是被赋值的字段，new Date()是赋值的对象，metaObject就是传入的实体类，是被赋值的对象
        this.setFieldValByName("createTime", new Date(), metaObject);
        this.setFieldValByName("updateTime", new Date(), metaObject);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        this.setFieldValByName("updateTime", new Date(), metaObject);
    }
}
