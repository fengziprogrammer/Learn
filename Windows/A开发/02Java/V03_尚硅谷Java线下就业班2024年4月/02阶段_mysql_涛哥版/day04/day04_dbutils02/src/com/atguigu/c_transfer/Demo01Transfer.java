package com.atguigu.c_transfer;

import com.atguigu.utils.DruidUtils;
import org.apache.commons.dbutils.QueryRunner;

import java.sql.Connection;
import java.sql.SQLException;

public class Demo01Transfer {
    public static void main(String[] args) {
        QueryRunner qr = new QueryRunner();
        Connection conn = DruidUtils.getConn();
        try {
            //开启事务
            conn.setAutoCommit(false);

            String outMoney = "update account set money = money - ? where name = ?";
            String inMoney = "update account set money = money + ? where name = ?";
            qr.update(conn, outMoney, 1000, "涛哥");

            System.out.println(1/0);

            qr.update(conn, inMoney, 1000, "曼曼");

            //提交事务
            conn.commit();
            System.out.println("转账成功");

        } catch (Exception e) {
            //回滚事务
            try {
                conn.rollback();
            } catch (SQLException ex) {
                e.printStackTrace();
            }
            System.out.println("转账失败");
            e.printStackTrace();
        } finally {
            DruidUtils.close(conn, null, null);
        }
    }
}
