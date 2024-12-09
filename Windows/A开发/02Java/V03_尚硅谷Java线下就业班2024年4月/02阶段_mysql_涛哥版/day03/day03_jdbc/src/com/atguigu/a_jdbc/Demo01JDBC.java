package com.atguigu.a_jdbc;

import com.mysql.cj.jdbc.Driver;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Demo01JDBC {
    @Test
    public void insert() throws Exception {
        /*
          1.注册驱动:DriverManager类
            static void registerDriver(Driver driver)
            a.参数:Driver接口
                  需要传递Driver接口的实现类对象,但是在API文档上没有体现Driver的实现类
                  所以需要传递mysql核心jar包中的Driver类,此类在com.mysql.cj.jdbc包下
                  此类实现了java.sql.Driver接口

          2.注意:
            当我们new  com.mysql.cj.jdbc.Driver时底层有一个静态代码块
            在静态代码块中写了 DriverManager.registerDriver(new Driver());

            也就意味着,如果我们使用DriverManager.registerDriver(new Driver());注册驱动
            到最后我们就直接注册了两次,没必要

          3.解决:统一用反射技术,获取Driver的class对象

         */
        Class.forName("com.mysql.cj.jdbc.Driver");

        /*
           2.获取连接:DriverManager类中的方法
             static Connection getConnection(String url, String user, String password):获取连接
                 url:指明我们操作的是哪个库,写的是库的url(地址)
                     jdbc:mysql://localhost:3306/数据库名字?参数1&参数2
                 user:指明数据库的用户名
                 password:指明数据库的密码
         */

        String url = "jdbc:mysql://localhost:3306/230417_java3";
        String user = "root";
        String password = "root";
        Connection connection = DriverManager.getConnection(url, user, password);

        /*
          3.准备sql
         */
        String sql = "insert into user (username,password) values ('tom','111')";

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
        st.close();
        connection.close();
    }

    /**
     * 这里用的单元测试,不用main执行了
     */
    @Test
    public void update() throws Exception {
        //1.注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        //2.获取连接
        String url = "jdbc:mysql://localhost:3306/230417_java3";
        String user = "root";
        String password = "root";
        Connection connection = DriverManager.getConnection(url, user, password);
        //3.准备sql
        String sql = "update user set password = 222 where uid = 1";
        //4.获取执行平台
        Statement st = connection.createStatement();
        //5.执行sql
        st.executeUpdate(sql);
        //6.关闭资源
        st.close();
        connection.close();
    }

    @Test
    public void delete()throws Exception{
        //1.注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        //2.获取连接
        String url = "jdbc:mysql://localhost:3306/230417_java3";
        String user = "root";
        String password = "root";
        Connection connection = DriverManager.getConnection(url, user, password);
        //3.准备sql
        String sql = "delete from user where uid = 1";
        //4.获取执行平台
        Statement st = connection.createStatement();
        //5.执行sql
        st.executeUpdate(sql);
        //6.关闭资源
        st.close();
        connection.close();
    }

    @Test
    public void query()throws Exception{
        //1.注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        //2.获取连接
        String url = "jdbc:mysql://localhost:3306/230417_java3";
        String user = "root";
        String password = "root";
        Connection connection = DriverManager.getConnection(url, user, password);
        //3.准备sql
        String sql = "select * from user";
        //4.获取执行平台
        Statement st = connection.createStatement();
        //5.执行sql
        ResultSet rs = st.executeQuery(sql);
        //6.处理结果集
        while(rs.next()){
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

            System.out.println(uid+"..."+username+"..."+pwd);
        }
        //7.关闭资源
        rs.close();
        st.close();
        connection.close();
    }
}
