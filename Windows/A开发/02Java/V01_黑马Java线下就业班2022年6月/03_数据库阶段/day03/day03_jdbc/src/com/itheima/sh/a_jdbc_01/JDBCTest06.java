package com.itheima.sh.a_jdbc_01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

/*
    演示sql注入问题
 */
public class JDBCTest06 {
    public static void main(String[] args) throws Exception {
        /*
            需求：模拟登录
        */
        //0.键盘录入数据
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名:");
        String inputUserName = sc.nextLine();//锁哥

        System.out.println("请输入密码:");
        String inputPassword = sc.nextLine();
        //1.注册驱动
        //2.获取和数据库的连接
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/day03_heima141","root","1234");
        //3.获取发送sql语句对象
        Statement st = conn.createStatement();
        //4.发送sql语句
        // select * from user2 where username='zhangsan' and password='123'
        // 注意：因为用户名和密码是varchar类型，sql语句需要加单引号
        /*
            sql注入问题：
                select * from user2 where username='zhangsan' -- ' and password='484949'
                说明：在该代码中，我们在控制台中输入了特殊的字符' -- 导致将sql语句后面的密码部分被注释了，最后在mysql服务器中查询的sql语句：
                     select * from user2 where username='zhangsan'
                     只是根据用户名查询没有根据用户名和密码查询
         */
        String sql="select * from user2 where username='"+inputUserName+"' and password='"+inputPassword+"'";
        ResultSet rs = st.executeQuery(sql);
        //5.处理结果集
        if(rs.next()){
            //说明数据表有数据，取出数据
            String username = rs.getString("username");//参数username是数据表字段名
            String password = rs.getString("password");//参数password是数据表字段名
            //输出
            System.out.println("欢迎您登录成功，用户名是:"+username+",密码是:"+password);
        }else{
            //说明没有查询到，登录失败
            System.out.println("用户名或者密码错误");
        }
        //6.释放资源
        rs.close();
        st.close();
        conn.close();


    }
}
