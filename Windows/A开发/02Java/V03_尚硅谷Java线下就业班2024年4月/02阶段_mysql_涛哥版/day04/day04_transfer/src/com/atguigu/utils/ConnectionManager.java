package com.atguigu.utils;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionManager {
    private static ThreadLocal<Connection> tl = new ThreadLocal<>();

    public static Connection getConnection(){
        Connection connection = tl.get();
        //如果从ThreadLocal中获取出来的connection是null,证明之前没存过
        if (connection==null){
            //从连接池中获取连接对象,放到ThreadLocal中
            connection = DruidUtils.getConn();
            tl.set(connection);
        }

        return connection;
    }

    //开启事务
    public static void begin(){
        try {
            getConnection().setAutoCommit(false);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //提交事务
    public static void commit(){
        try {
            getConnection().commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //回滚事务
    public static void back(){
        try {
            getConnection().rollback();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //关闭资源
    public static void closeShutDown(){
        DruidUtils.close(getConnection(),null,null);
        //把连接对象从ThreadLocal删除,保证每次新操作TheadLocal中都是空的
        tl.remove();
    }
}
