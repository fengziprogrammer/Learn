package com.atguigu.test;

import com.atguigu.util.JDBCUtil;
import org.testng.annotations.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class TestJDBCUtil  {
    @Test
    public void testGetConnection() throws Exception{
        Connection connection = JDBCUtil.getConnection();
        // CURD
        PreparedStatement preparedStatement = connection.prepareStatement("insert into person values ('16','高桥启介',20,'男')");
        int rows = preparedStatement.executeUpdate();
        System.out.println(rows);

        // 释放资源
        JDBCUtil.release(null,preparedStatement,connection);
    }
}
