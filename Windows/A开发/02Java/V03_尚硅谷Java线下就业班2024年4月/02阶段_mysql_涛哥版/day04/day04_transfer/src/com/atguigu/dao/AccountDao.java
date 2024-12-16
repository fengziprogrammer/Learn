package com.atguigu.dao;

import com.atguigu.utils.ConnectionManager;
import com.atguigu.utils.DruidUtils;
import org.apache.commons.dbutils.QueryRunner;

import java.sql.Connection;

public class AccountDao {
    /**
     *
     * @param outName  出钱人姓名
     * @param money    转账金额
     */
    public void outMoney(String outName, int money)throws Exception {
        QueryRunner qr = new QueryRunner();
        String sql = "update account set money = money - ? where name = ?";
        qr.update(ConnectionManager.getConnection(),sql,money,outName);

    }

    /**
     *
     * @param inName 收钱人姓名
     * @param money  转账金额
     */
    public void inMoney(String inName, int money)throws Exception {
        QueryRunner qr = new QueryRunner();
        String sql = "update account set money = money + ? where name = ?";
        qr.update(ConnectionManager.getConnection(),sql,money,inName);

    }
}
