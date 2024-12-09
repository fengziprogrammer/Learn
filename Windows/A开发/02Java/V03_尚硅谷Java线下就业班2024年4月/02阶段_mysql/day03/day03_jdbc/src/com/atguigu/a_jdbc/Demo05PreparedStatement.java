package com.atguigu.a_jdbc;

import com.atguigu.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Demo05PreparedStatement {
    public static void main(String[] args)throws Exception {
        //1.创建Scanner对象
        Scanner sc = new Scanner(System.in);
        //2.调用nextLine方法输入用户名和密码
        System.out.println("请您输入用户名:");
        String username = sc.nextLine();
        System.out.println("请您输入密码:");
        String password = sc.nextLine();
        //3.获取连接
        Connection conn = JDBCUtils.getConn();
        /*
          4.准备sql
         */
        String sql = "select * from user where username = ? and password = ?";

        //5.获取执行平台
        PreparedStatement pst = conn.prepareStatement(sql);
        //6.为?赋值
        pst.setObject(1,username);
        pst.setObject(2,password);
        //7.执行sql
        ResultSet rs = pst.executeQuery();
        //8.直接判断结果集中有没有数据
        if (rs.next()){
            System.out.println("登录成功");
        }else{
            System.out.println("登录失败");
        }
        //9.关闭资源
        JDBCUtils.close(conn,pst,rs);
    }
}
