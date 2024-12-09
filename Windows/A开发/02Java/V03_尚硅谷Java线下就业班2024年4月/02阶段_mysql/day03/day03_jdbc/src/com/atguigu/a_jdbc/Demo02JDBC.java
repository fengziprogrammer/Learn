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
        Connection conn = JDBCUtils.getConn();
        /*
          3.准备sql
         */
        String sql = "insert into user (username,password) values ('tom','1234')";
        /*
          4.获取执行平台:Connection中的方法:
            Statement createStatement()
         */
        Statement st = conn.createStatement();
        /*
          5.执行sql:Statement中的方法
            int executeUpdate(String sql) -> 针对于增删改操作的
         */
        int i = st.executeUpdate(sql);
        System.out.println(i);

        /*
          6.由于增删改不需要处理结果集,所有直接关闭资源
         */
        JDBCUtils.close(conn,st,null);
    }

    /**
     * 删除
     */
    @Test
    public void delete()throws Exception{
        Connection connection = JDBCUtils.getConn();
        /*
          3.准备sql
         */
        String sql = "delete from user where uid = 2";
        /*
          4.获取执行平台:Connection中的方法:
            Statement createStatement()
         */
        Statement st = connection.createStatement();
        /*
          5.执行sql:Statement中的方法
            int executeUpdate(String sql) -> 针对于增删改操作的
         */
        int i = st.executeUpdate(sql);
        System.out.println(i);

        /*
          6.由于增删改不需要处理结果集,所有直接关闭资源
         */
        JDBCUtils.close(connection,st,null);
    }

    /**
     * 修改
     * @throws Exception
     */
    @Test
    public void update()throws Exception{
        Connection connection = JDBCUtils.getConn();
        /*
          3.准备sql
         */
        String sql = "update user set password = 666 where uid = 3";
        /*
          4.获取执行平台:Connection中的方法:
            Statement createStatement()
         */
        Statement st = connection.createStatement();
        /*
          5.执行sql:Statement中的方法
            int executeUpdate(String sql) -> 针对于增删改操作的
         */
        int i = st.executeUpdate(sql);
        System.out.println(i);

        /*
          6.由于增删改不需要处理结果集,所有直接关闭资源
         */
        JDBCUtils.close(connection,st,null);
    }

    /**
     * 查询数据
     */
    @Test
    public void query()throws Exception{
        Connection connection = JDBCUtils.getConn();
        //3.准备sql语句
        String sql = "select * from user";
        //4.获取执行平台
        Statement st = connection.createStatement();
        //5.执行sql
        ResultSet rs = st.executeQuery(sql);
        //6.处理结果集
        while(rs.next()){
            //int uid = rs.getInt(1);
            //int uid = rs.getInt("uid");
            //int username = rs.getInt("username");

            //String uid = rs.getString("uid");
            //String username = rs.getString("username");
            //String password = rs.getString("password");

            Object uid = rs.getObject("uid");
            Object username = rs.getObject("username");
            Object password = rs.getObject("password");
            System.out.println(uid+"..."+username+"..."+password);
        }
        //7.关闭资源
        JDBCUtils.close(connection,st,rs);
    }
}
