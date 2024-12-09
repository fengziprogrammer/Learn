package com.atguigu.a_jdbc;

import com.atguigu.utils.JDBCUtils;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Demo02JDBC {
    @Test
    public void insert() throws Exception {
        Connection connection = JDBCUtils.getConn();
        /*
          3.准备sql
         */
        String sql = "insert into user (username,password) values ('jason','777')";

        /*
          4.获取执行平台:Statement接口 -> 执行sql语句
            a.获取:用到的是Connection中的方法
                  Statement createStatement()
         */
        Statement st = connection.createStatement();

        /*
          5.执行sql:Statement接口中的方法
                   int executeUpdate(String sql) -> 针对于增删改操作的
         */
        int i = st.executeUpdate(sql);

        //6.处理结果集,但是增删改不需要处理结果集

        //7.关闭资源
        JDBCUtils.close(connection, st, null);
    }

    /**
     * 这里用的单元测试,不用main执行了
     */
    @Test
    public void update() throws Exception {
        Connection connection = JDBCUtils.getConn();
        //3.准备sql
        String sql = "update user set password = 222 where uid = 2";
        //4.获取执行平台
        Statement st = connection.createStatement();
        //5.执行sql
        st.executeUpdate(sql);
        //6.关闭资源
        JDBCUtils.close(connection, st, null);
    }

    @Test
    public void delete() throws Exception {
        Connection connection = JDBCUtils.getConn();
        //3.准备sql
        String sql = "delete from user where uid = 2";
        //4.获取执行平台
        Statement st = connection.createStatement();
        //5.执行sql
        st.executeUpdate(sql);
        //6.关闭资源
        JDBCUtils.close(connection,st,null);
    }

    @Test
    public void query() throws Exception {
        Connection connection = JDBCUtils.getConn();
        //3.准备sql
        String sql = "select * from user";
        //4.获取执行平台
        Statement st = connection.createStatement();
        //5.执行sql
        ResultSet rs = st.executeQuery(sql);
        //6.处理结果集
        while (rs.next()) {
            //int uid = rs.getInt(1);
            //System.out.println(uid);
            //int uid = rs.getInt("uid");
            //String uid = rs.getString("uid");//也行,但是获取出来id之后是String的,最好对应类型
            //String username = rs.getString("username");
            //String pwd = rs.getString("password");
            //System.out.println(uid+"..."+username+"..."+pwd);

            Object uid = rs.getObject("uid");
            Object username = rs.getObject("username");
            Object pwd = rs.getObject("password");

            System.out.println(uid + "..." + username + "..." + pwd);
        }
        //7.关闭资源
        JDBCUtils.close(connection,st,rs);
    }
}
