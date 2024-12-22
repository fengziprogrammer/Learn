package com.itheima.sh.a_jdbc_01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
    jdbc控制事务
            操作事务，使用Connection接口的方法：
                开启手动控制事务：void setAutoCommit(false)
                一切正常，提交事务：void commit()
                出现异常，回滚事务：void rollback()
 */
public class JDBCTest05 {
    public static void main(String[] args)  {
        Connection conn = null;
        Statement st = null;
        try {
            //需求：a给b转账100  a:money-100  b:money+100
            //1.注册驱动
            //2.获取和数据库连接
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/day03_heima141", "root", "1234");
            //3.开启手动控制事务：void setAutoCommit(false)
            conn.setAutoCommit(false);
            //4.获取发送sql语句对象
             st = conn.createStatement();
            //5.书写sql语句：a:money-100
            String sql1 = "update account set money=money-100 where name='a'";
            //b:money+100
            String sql2 = "update account set money=money+100 where name='b'";
            //6.发送sql语句
            //DML(insert update delete): 使用Statement接口中的方法：int executeUpdate(String sql)
            int i1 = st.executeUpdate(sql1);//i1这里的值是1，因为sql语句update account set money=money-100 where name='a'影响的行记录数是1

            //模拟异常
//            int x = 1 / 0;


            int i2 = st.executeUpdate(sql2);//i2这里的值是1
            System.out.println("i1 = " + i1);
            System.out.println("i2 = " + i2);
            //7.一切正常，提交事务：void commit()
            conn.commit();
        } catch (Exception e) {
            e.printStackTrace();
            try {
               //防止空指针异常
                if(conn!=null){
                    //8.出现异常，回滚事务：void rollback()
                    conn.rollback();
                }
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        } finally {
            try {
                //防止空指针异常
                if(st!=null){
                    st.close();
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

            try {
                //防止空指针异常
                if(conn != null){
                    conn.close();
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

        }



    }
}
