package com.atguigu.a_jdbc;

import com.atguigu.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Demo04JDBC_Login {
    public static void main(String[] args)throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名:");
        String username = sc.nextLine();
        System.out.println("请输入密码:");
        String password = sc.nextLine();

        //1.获取连接
        Connection conn = JDBCUtils.getConn();
        //2.准备sql
        String sql = "select * from user where username = '"+username+"' and password = '"+password+"'";
        System.out.println(sql);
        //3.获取执行平台
        Statement st = conn.createStatement();
        //4.执行sql
        ResultSet rs = st.executeQuery(sql);
        //5.处理结果集
        if (rs.next()){
            System.out.println("登录成功");
        }else{
            System.out.println("登录失败");
        }
        //6.关闭资源
        JDBCUtils.close(conn,st,rs);
    }
}
