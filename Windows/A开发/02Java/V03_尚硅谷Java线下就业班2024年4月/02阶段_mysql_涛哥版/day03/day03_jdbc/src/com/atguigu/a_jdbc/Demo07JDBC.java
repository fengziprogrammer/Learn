package com.atguigu.a_jdbc;

import com.atguigu.utils.JDBCUtils;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Demo07JDBC {
    @Test
    public void insert()throws Exception{
        Connection conn = JDBCUtils.getConn();
        String sql = "insert into user (username,password) values (?,?)";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setObject(1,"lucy");
        pst.setObject(2,"999");
        pst.executeUpdate();
        JDBCUtils.close(conn,pst,null);
    }


    @Test
    public void delete()throws Exception{
        Connection conn = JDBCUtils.getConn();
        String sql = "delete from user where uid = ?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setObject(1,2);
        pst.executeUpdate();
        JDBCUtils.close(conn,pst,null);
    }

    @Test
    public void update()throws Exception{
        Connection conn = JDBCUtils.getConn();
        String sql = "update user set password = ? where uid = ?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setObject(1,"111");
        pst.setObject(2,3);
        pst.executeUpdate();
        JDBCUtils.close(conn,pst,null);
    }

    @Test
    public void query()throws Exception{
        Connection conn = JDBCUtils.getConn();
        String sql = "select * from user where uid = ?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setObject(1,4);
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
            Object uid = rs.getObject("uid");
            Object username = rs.getObject("username");
            Object password = rs.getObject("password");
            System.out.println(uid+"..."+username+"..."+password);
        }
        JDBCUtils.close(conn,pst,rs);
    }
}
