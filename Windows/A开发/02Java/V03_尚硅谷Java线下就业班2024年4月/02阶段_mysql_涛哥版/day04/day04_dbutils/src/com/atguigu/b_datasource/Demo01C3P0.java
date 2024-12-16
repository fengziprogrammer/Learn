package com.atguigu.b_datasource;

import com.atguigu.utils.JDBCUtils_C3P0;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Demo01C3P0 {
    @Test
    public void insert()throws Exception{
        //1.获取连接
        Connection conn = JDBCUtils_C3P0.getConn();
        //2.准备sql
        String sql = "insert into category (cname) values (?)";
        //3.获取执行平台
        PreparedStatement pst = conn.prepareStatement(sql);
        //4.为?赋值
        pst.setObject(1,"蔬菜");
        //5.执行sql
        int i = pst.executeUpdate();
        //6.关闭资源
        JDBCUtils_C3P0.close(conn,pst,null);

    }

    @Test
    public void update()throws Exception{
        //1.获取连接
        Connection conn = JDBCUtils_C3P0.getConn();
        //2.准备sql
        String sql = "update category set cname = ? where cid = ?";
        //3.获取执行平台
        PreparedStatement pst = conn.prepareStatement(sql);
        //4.为?赋值
        pst.setObject(1,"水果");
        pst.setObject(2,1);
        //5.执行sql
        int i = pst.executeUpdate();
        //6.关闭资源
        JDBCUtils_C3P0.close(conn,pst,null);

    }

    @Test
    public void delete()throws Exception{
        //1.获取连接
        Connection conn = JDBCUtils_C3P0.getConn();
        //2.准备sql
        String sql = "delete from category where cid = ?";
        //3.获取执行平台
        PreparedStatement pst = conn.prepareStatement(sql);
        //4.为?赋值
        pst.setObject(1,1);
        //5.执行sql
        int i = pst.executeUpdate();
        //6.关闭资源
        JDBCUtils_C3P0.close(conn,pst,null);

    }

    @Test
    public void query()throws Exception{
        //1.获取连接
        Connection conn = JDBCUtils_C3P0.getConn();
        //2.准备sql
        String sql = "select * from category";
        //3.获取执行平台
        PreparedStatement pst = conn.prepareStatement(sql);
        //4.执行sql
        ResultSet rs = pst.executeQuery();
        //5.处理结果集
        while(rs.next()){
            Object cid = rs.getObject("cid");
            Object cname = rs.getObject("cname");
            System.out.println(cid+"..."+cname);
        }
        //6.关闭资源
        JDBCUtils_C3P0.close(conn,pst,rs);

    }
}
