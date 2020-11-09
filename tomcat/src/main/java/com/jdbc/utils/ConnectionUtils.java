package com.jdbc.utils;

import java.io.InputStream;
import java.lang.reflect.Field;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * @author : lyx
 * @Date : 2020/10/23 15:36
 * @Version : 1.0
 * 使用单例模式编写的数据库链接工具类
 */
public class ConnectionUtils<T> {

    public String URL;
    public String USERNAME;
    public String PASSWORD;
    private Connection connection = null;
    private static ConnectionUtils connectionUtils = new ConnectionUtils();

    private ConnectionUtils() {
        connection = connection();
    }

    public static ConnectionUtils getInstance() {
        return connectionUtils;
    }

    public Connection connection() {
        InputStream ips = getClass().getResourceAsStream("/jdbc.properties");
        Properties properties = new Properties();
        try {
            properties.load(ips);
            URL = properties.getProperty("url");
            USERNAME = properties.getProperty("username");
            PASSWORD = properties.getProperty("password");
            System.out.println(URL + USERNAME + PASSWORD);

            //链接数据库
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            return connection;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {

                if (connection != null) {
                    connection.close();
                }
            } catch (Exception throwables) {
                throwables.printStackTrace();
            }
        }
        return null;
    }


    /**
     * @param sql         查询语句
     * @param tclass        泛型对象的.class
     * @return      返回查询的对象集合
     */
    public List<T> findBySql(String sql, Class<T> tclass) {
        List<T> list = new ArrayList<T>();
        //调用查询，返回结果集
        ResultSet resultSet = this.query(sql);
        try {
            //获取定义的属性
            Field[] fields = tclass.getDeclaredFields();
            while (resultSet.next()) {
                T t = tclass.newInstance();

                for (Field field : fields) {
                    //获取其中的属性名
                    String name = field.getName();
                    //获取列值
                    Object object = resultSet.getObject(name);
                    //设置可访问
                    field.setAccessible(true);
                    field.set(t, object);
                }
                list.add(t);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
            } catch (Exception throwables) {
                throwables.printStackTrace();
            }
        }
        return list;
    }

    public ResultSet query(String sql) {
        Statement statement;
        ResultSet resultSet = null;
        try {
            if (connection == null) {
                connection = this.connection();
            }
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
        } catch (Exception throwables) {
            throwables.printStackTrace();
        }

        return resultSet;
    }
}
