package com.itheima.sh.a_jdbc_01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCTest01 {
    public static void main(String[] args) throws Exception{
        //1.注册驱动
//        Class clazz = Class.forName("com.mysql.jdbc.Driver");
        //2.获取和数据库连接池
        //连接数据库地址
        String url = "jdbc:mysql://localhost:3306/day03_heima141";
        //用户名
        String user = "root";
        //密码
        String password = "1234";//你的数据库密码，1234是锁哥的
        Connection conn = DriverManager.getConnection(url, user, password);
        //3.定义sql
        String sql = "select * from user";
        //4.获取执行sql语句的对象
        Statement st = conn.createStatement();
        //5.将sql语句发送给数据库服务器
        ResultSet rs = st.executeQuery(sql);
        //6.处理返回的结果
        while(rs.next()){
            //获取id
            int id = rs.getInt("id");
            //获取姓名
            String name = rs.getString("name");
            //获取年龄
            int age = rs.getInt("age");
            //获取年龄
            int sex = rs.getInt("sex");
            //输出数据到idea控制台
            System.out.println(id+"---"+name+"---"+age+"---"+sex);
        }
        //7，释放资源
        rs.close();
        st.close();
        conn.close();
    }

}
