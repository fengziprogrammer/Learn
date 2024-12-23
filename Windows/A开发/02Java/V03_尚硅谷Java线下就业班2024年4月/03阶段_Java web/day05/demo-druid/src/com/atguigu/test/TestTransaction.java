package com.atguigu.test;

import com.atguigu.util.JDBCUtil;
import org.testng.annotations.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestTransaction {
    @Test
    public void testJDBCTransaction()throws Exception{
        /*connection 默认自动提交事务*/
        Connection connection = JDBCUtil.getConnection();
        // 设置connection不要自动提交事务
        connection.setAutoCommit(false);


        PreparedStatement preparedStatement = connection.prepareStatement("update account set balance = balance + ? where aid = ?");

        try {
            //设置参数
            preparedStatement.setObject(1,1000);
            preparedStatement.setObject(2,1);
            // 执行
            preparedStatement.executeUpdate();


            //System.out.println(1/0);

            //设置参数
            preparedStatement.setObject(1,-1000);
            preparedStatement.setObject(2,2);
            // 执行
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            // 如果多个DML操作 的过程中出现异常,则回滚事务
            connection.rollback();
        }finally {
            // 无论是否出现异常都会提交事务
            connection.commit();
        }


        // 手动提交
       // connection.commit();
        // 释放资源
        JDBCUtil.release(null,preparedStatement,connection);


    }
}
