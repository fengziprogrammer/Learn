package com.atguigu.a_jdbc;

import com.atguigu.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Demo03JDBC {
    public static void main(String[] args)throws Exception {
        //1.获取连接
        Connection conn = JDBCUtils.getConn();
        //2.准备sql
        String sql = "insert into user (username,password) values ('tom','666')";
        //3.准备查询最新添加数据的id
        String lastInsertId = "select last_insert_id()";
        //4.获取执行平台
        Statement st = conn.createStatement();
        //5.执行sql
        st.executeUpdate(sql);
        //6.执行查询最后添加id的sql
        ResultSet rs = st.executeQuery(lastInsertId);
        //7.处理结果集
        while(rs.next()){
            int lastinsertid = rs.getInt(1);
            System.out.println("lastinsertid = " + lastinsertid);
        }
        //8.关流
        JDBCUtils.close(conn,st,rs);
    }
}
