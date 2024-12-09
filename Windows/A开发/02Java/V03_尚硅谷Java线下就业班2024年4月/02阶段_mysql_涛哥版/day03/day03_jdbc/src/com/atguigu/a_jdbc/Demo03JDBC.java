package com.atguigu.a_jdbc;

import com.atguigu.utils.JDBCUtils;
import org.junit.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Demo03JDBC {
    @Test
    public void insert()throws Exception{
        //1.获取连接
        Connection conn = JDBCUtils.getConn();
        //2.准备sql
        String sql = "insert into category(cid,cname) values (4,'数码')";
        //3.获取执行平台
        Statement st = conn.createStatement();
        //4.执行sql
        st.executeUpdate(sql);

        String selectLastInsertId = "SELECT LAST_INSERT_ID()";
        ResultSet rs = st.executeQuery(selectLastInsertId);
        while(rs.next()){
            System.out.println(rs.getObject(1));
        }

        //5.关闭资源
        JDBCUtils.close(conn,st,rs);
    }
}
