package com.atguigu.service;

import com.atguigu.dao.AccountDao;
import com.atguigu.utils.ConnectionManager;
import com.atguigu.utils.DruidUtils;

import java.sql.Connection;
import java.sql.SQLException;

public class AccountService {
    /**
     *
     * @param outName  出钱人姓名
     * @param inName   收钱人姓名
     * @param money    转账金额
     */
    public void transfer(String outName, String inName, int money) {

        try {
            //开启事务
            ConnectionManager.begin();

            AccountDao accountDao = new AccountDao();
            accountDao.outMoney(outName,money);

            System.out.println(1/0);

            accountDao.inMoney(inName,money);

            //提交事务
            ConnectionManager.commit();
            System.out.println("转账成功");
        } catch (Exception e) {
            //回滚事务
            ConnectionManager.back();
            System.out.println("转账失败");
            e.printStackTrace();
        }finally {
            ConnectionManager.closeShutDown();
        }
    }
}
