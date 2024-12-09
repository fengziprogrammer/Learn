package com.atguigu.a_jdbc;

import com.atguigu.utils.JDBCUtils;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Demo06PreparedStatement {
   //添加用户
    @Test
    public void insert()throws Exception{
        //1.获取连接
        Connection conn = JDBCUtils.getConn();
        //2.准备sql
        String sql = "insert into user (username,password) values (?,?)";
        //3.获取执行平台
        PreparedStatement pst = conn.prepareStatement(sql);
        //4.为?赋值
        pst.setObject(1,"rose");
        pst.setObject(2,"111");
        //5.执行sql
        int i = pst.executeUpdate();
        //6.关闭资源
        JDBCUtils.close(conn,pst,null);
    }

    //删除用户
    @Test
    public void delete()throws Exception{
        //1.获取连接
        Connection conn = JDBCUtils.getConn();
        //2.准备sql
        String sql = "delete from user where uid = ?";
        //3.获取执行平台
        PreparedStatement pst = conn.prepareStatement(sql);
        //4.为?赋值
        pst.setObject(1,1);
        //5.执行sql
        int i = pst.executeUpdate();
        //6.关闭资源
        JDBCUtils.close(conn,pst,null);
    }

    //修改用户
    @Test
    public void update()throws Exception{
        //1.获取连接
        Connection conn = JDBCUtils.getConn();
        //2.准备sql
        String sql = "update user set password = ? where uid = ?";
        //3.获取执行平台
        PreparedStatement pst = conn.prepareStatement(sql);
        //4.为?赋值
        pst.setObject(1,666);
        pst.setObject(2,4);
        //5.执行sql
        int i = pst.executeUpdate();
        //6.关闭资源
        JDBCUtils.close(conn,pst,null);
    }

    //查询
    @Test
    public void query()throws Exception{
        //1.获取连接
        Connection conn = JDBCUtils.getConn();
        //2.准备sql
        String sql = "select * from user";
        //3.获取执行平台
        PreparedStatement pst = conn.prepareStatement(sql);
        //4.执行sql
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
            Object uid = rs.getObject("uid");
            Object username = rs.getObject("username");
            Object password = rs.getObject("password");
            System.out.println(uid+"..."+username+"..."+password);
        }
        //6.关闭资源
        JDBCUtils.close(conn,pst,rs);
    }
}
