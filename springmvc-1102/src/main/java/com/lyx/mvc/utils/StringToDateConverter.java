package com.lyx.mvc.utils;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author : lyx
 * @Date : 2020/11/5 14:26
 * @Version : 1.0
 */
public class StringToDateConverter implements Converter<String, Date> {
    @Override
    public Date convert(String s) {

        if (s == null) {
            throw new RuntimeException("请您传入数据");
        }
        DateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd");
        try {
            return dateFormat.parse(s);
        } catch (ParseException e) {
            throw new RuntimeException("数据类型转换出现错误!");
        }

    }
}
