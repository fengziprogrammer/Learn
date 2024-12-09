package com.atguigu.a_jdbc;

import com.mysql.cj.jdbc.Driver;
import org.junit.Test;

import java.sql.*;

public class Demo01JDBC {
    @Test
    public void insert() throws Exception {
        //1.注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        //2.获取连接,连接数据库
        String url = "jdbc:mysql://localhost:3306/day03_database1";
        String name = "root";
        String password = "root";
        Connection connection = DriverManager.getConnection(url,name,password);
        /*
          3.准备sql
         */
        String sql = "insert into user (username,password) values ('tom','1234')";
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
        st.close();
        connection.close();
    }

    /**
     * 删除
     */
    @Test
    public void delete()throws Exception{
        //1.注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        //2.获取连接,连接数据库
        String url = "jdbc:mysql://localhost:3306/day03_database1";
        String name = "root";
        String password = "root";
        Connection connection = DriverManager.getConnection(url,name,password);
        /*
          3.准备sql
         */
        String sql = "delete from user where uid = 1";
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
        st.close();
        connection.close();
    }

    /**
     * 修改
     * @throws Exception
     */
    @Test
    public void update()throws Exception{
        //1.注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        //2.获取连接,连接数据库
        String url = "jdbc:mysql://localhost:3306/day03_database1";
        String name = "root";
        String password = "root";
        Connection connection = DriverManager.getConnection(url,name,password);
        /*
          3.准备sql
         */
        String sql = "update user set password = 666 where uid = 2";
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
        st.close();
        connection.close();
    }

    /**
     * 查询数据
     */
    @Test
    public void query()throws Exception{
        //1.注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        //2.获取连接
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/day03_database1", "root", "root");
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
        rs.close();
        st.close();
        connection.close();
    }
}
