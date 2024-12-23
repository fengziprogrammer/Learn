package com.atguigu.util;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.atguigu.test.TestProperties;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class JDBCUtil {

    private static DataSource dataSource;

    private static ThreadLocal<Connection> threadLocal =new ThreadLocal<>();


    static{



        Properties properties = new Properties();
        // 通过类加载器读取字节码根路径下的文件
        InputStream in = TestProperties.class.getClassLoader().getResourceAsStream("jdbc.properties");
        // 读取配置文件中的信息
        try {
            properties.load(in);
        } catch (IOException e) {
           e.printStackTrace();
        }

        try {
            dataSource = DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            e.printStackTrace();
        }



       /* String driverClassName = properties.getProperty("driverClassName");
        String url = properties.getProperty("url");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");
        String initSize = properties.getProperty("initSize");
        String maxWait = properties.getProperty("maxWait");

        dataSource.setDriverClassName(driverClassName);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        dataSource.setInitialSize(Integer.parseInt(initSize));// 初始化连接数
        dataSource.setMaxWait(Long.parseLong(maxWait));*/

       /* dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/mydb");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        dataSource.setInitialSize(5);// 初始化连接数
        dataSource.setMaxWait(1000);// getConnection的最大等待时间  超时抛出异常*/

    }

    // 向外部提供连接的方法
    public static Connection getConnection (){
        // 先从本地线程中取出Connection
        Connection connection = threadLocal.get();
        // 如果本地线程中没有connection
        if(null == connection){
            //从连接池中取出一个连接放入本地线程
            try {
                connection =dataSource.getConnection();
                threadLocal.set(connection);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return connection;
    }
    // 向外部提供连接池的方法
    public static DataSource getDataSource(){
        return dataSource;
    }

    // 释放资源的方法
    public static void release(ResultSet resultSet, Statement statement,Connection connection){
        if (null != resultSet){
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (null != statement){
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (null != connection){
            try {
                // 设置connection自动提交事务
                connection.setAutoCommit(true);
                // 从本地线程中移除connection
                threadLocal.remove();
                // 归还连接池
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


    }










}
