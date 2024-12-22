package com.itheima.sh.a_jdbc_01;

import java.sql.*;
import java.util.Scanner;

/*
    演示解决sql注入问题
	解决sql：使用连接对象调用Connection连接接口中的方法获取可以解决sql注入问题的预编译接口PreparedStatement对象：
                Connection接口方法：
                    PreparedStatement prepareStatement(String sql) 创建一个 PreparedStatement 对象来将参数化的 SQL 语句发送到数据库
                        参数：
                            sql:操作数据库的sql语句，如果sql语句中有参数，那么先不给设置真实的值，而是使用占位符?替换，然后先发送
                            给mysql数据库进行...预编译...
                        返回值：PreparedStatement属于预编译的接口
 */
public class JDBCTest07 {
    public static void main(String[] args) throws Exception {
        /*
            需求：模拟登录
        */
        //0.键盘录入数据
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名:");
        String inputUserName = sc.nextLine();//锁哥

        System.out.println("请输入密码:");
        String inputPassword = sc.nextLine();
        //1.注册驱动
        //2.获取和数据库的连接
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/day03_heima141","root","1234");
        //3.获取发送sql语句的预编译对象对象Connection接口方法：PreparedStatement prepareStatement(String sql)
        String sql="select * from user2 where username=? and password=?";//?表示占位符
        PreparedStatement pst = conn.prepareStatement(sql);
        //4.给占位符赋值
        /*
            使用PreparedStatement接口中的方法：setXxx(int index,Xxx value) index 表示从左向右第几个占位符，value表示给占位符赋的实际值
            inputUserName="zhangsan' -- " 在setString方法体内部使用转义符号 \ 对特殊符号转义 \\' \\-\\- 最后传递给mysql服务器，让mysql服务器认为
            输入的用户名的值是:zhangsan' --
         */
        pst.setString(1,inputUserName);//1表示第一个占位符，inputUserName表示给占位符赋的实际值
        pst.setString(2,inputPassword);//1表示第一个占位符，inputUserName表示给占位符赋的实际值
        //5.执行语句
        ResultSet rs = pst.executeQuery();

        //5.处理结果集
        if(rs.next()){
            //说明数据表有数据，取出数据
            String username = rs.getString("username");//参数username是数据表字段名
            String password = rs.getString("password");//参数password是数据表字段名
            //输出
            System.out.println("欢迎您登录成功，用户名是:"+username+",密码是:"+password);
        }else{
            //说明没有查询到，登录失败
            System.out.println("用户名或者密码错误");
        }
        //6.释放资源
        rs.close();
        pst.close();
        conn.close();



    }
}
