package com.atguigu.a_jdbc;

import com.atguigu.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Demo07Batch {
    public static void main(String[] args)throws Exception {
        //1.获取连接
        Connection conn = JDBCUtils.getConn();
        //2.准备sql
        String sql = "insert into user (username,password) values (?,?)";
        //3.获取执行平台
        PreparedStatement pst = conn.prepareStatement(sql);
        //4.执行sql
        for (int i = 0; i < 100; i++) {
            pst.setObject(1,"tom"+i);
            pst.setObject(2,"111"+i);
            pst.addBatch();//将多条语句写到内存中
        }
        //5.将内存中的多条sql打包,一起发送给mysql,批量执行
        pst.executeBatch();

        //6.关流
        JDBCUtils.close(conn,pst,null);
    }
}
