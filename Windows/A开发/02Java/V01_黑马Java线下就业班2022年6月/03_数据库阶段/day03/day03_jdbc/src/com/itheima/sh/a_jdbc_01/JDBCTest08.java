package com.itheima.sh.a_jdbc_01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBCTest08 {
    public static void main(String[] args) throws Exception {
     /*
            需求：使用预编译接口向数据表插入数据
      */
        //1.注册驱动
        //2.获取数据库连接
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/day03_heima141",
                "root", "1234");
        //3.获取预编译接口对象
        PreparedStatement pst = conn.prepareStatement("insert into user2 values(null,?,?)");
        //4.给占位符赋值
        pst.setString(1,"锁哥");
        pst.setString(2,"123");
        //5.执行sql
        pst.executeUpdate();
        //6.释放资源
        pst.close();
        conn.close();


    }
}
