package com.atguigu.a_jdbc;

import com.atguigu.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Demo05JDBC_Login {
    public static void main(String[] args)throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名:");
        String username = sc.nextLine();
        System.out.println("请输入密码:");
        String password = sc.nextLine();

        //1.获取连接
        Connection conn = JDBCUtils.getConn();
        //2.准备sql
        String sql = "select * from user where username = ? and password = ?";

        //3.获取执行平台
        PreparedStatement pst = conn.prepareStatement(sql);

        //为?赋值
        pst.setObject(1,username);
        pst.setObject(2,password);

        //4.执行sql
        ResultSet rs = pst.executeQuery();
        //5.处理结果集
        if (rs.next()){
            System.out.println("登录成功");
        }else{
            System.out.println("登录失败");
        }
        //6.关闭资源
        JDBCUtils.close(conn,pst,rs);
    }
}
