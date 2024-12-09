package com.atguigu.utils;

import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class JDBCUtils {
    private static String url = null;
    private static String user = null;
    private static String password = null;
    static{
        //1.注册驱动
        try {
            Properties properties = new Properties();
            InputStream in = JDBCUtils.class.getClassLoader().getResourceAsStream("jdbc.properties");
            properties.load(in);

            Class.forName(properties.getProperty("driverclass"));
            url = properties.getProperty("url");
            user = properties.getProperty("username");
            password = properties.getProperty("password");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    //获取连接
    public static Connection getConn(){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    //关闭资源
    public static void close(Connection connection, Statement statement, ResultSet resultSet){
        if (resultSet!=null){
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (statement!=null){
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (connection!=null){
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
