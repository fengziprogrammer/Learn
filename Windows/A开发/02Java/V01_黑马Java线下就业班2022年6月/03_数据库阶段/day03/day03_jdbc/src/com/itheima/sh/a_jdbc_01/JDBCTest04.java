package com.itheima.sh.a_jdbc_01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCTest04 {
    public static void main(String[] args) throws Exception {
       /*
            需求：查询数据表user2所有数据输出到控制台
			扩展：关于查询语句如果给字段起别名获取数据的注意事项。
         */
        //2.获取连接
        String url = "jdbc:mysql://localhost:3306/day03_heima141";//连接mysql服务器地址
        String username = "root";//连接mysql服务器用户名
        String password = "1234";//连接mysql服务器密码，这里输入你的密码
        Connection conn = DriverManager.getConnection(url, username, password);

        //3.定义sql
        /*
            注意：如果在执行的sql语句中给字段名起别名了，由于是将sql语句执行的结果封装到ResultSet对象中，那么ResultSet只会识别别名
            例如下面的pwd,不知道password列名，所以我们在获取数据的时候不应该使用列名，应该使用别名获取数据
            String pwd = rs.getString("pwd");
         */
        String sql = "select id,username,password pwd from user2";//pwd 表示password的别名

        //4.获取发送sql语句对象
        Statement st = conn.createStatement();

        //5.发送sql语句
        /*
            1.ResultSet 表示结果集，用来存放查询的结果，因为查询有可能是多行数据，所以使用集合存储
         */
        ResultSet rs = st.executeQuery(sql);

        //6.处理结果
        while(rs.next()){
            int id = rs.getInt("id");
            String username1 = rs.getString("username");
            String pwd = rs.getString("pwd");
            System.out.println(id+"--"+username1+"--"+pwd);
        }

        //7.释放资源
        rs.close();
        st.close();
        conn.close();



    }
}
