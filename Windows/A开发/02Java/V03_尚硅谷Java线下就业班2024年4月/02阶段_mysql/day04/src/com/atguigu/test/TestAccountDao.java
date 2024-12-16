package com.atguigu.test;

import com.atguigu.dao.AccountDao;
import com.atguigu.dao.impl.AccountDaoImpl;
import com.atguigu.pojo.Account;
import org.testng.annotations.Test;

public class TestAccountDao {
    @Test
    public void testAddAccount (){
        Account account =new Account(null,"lihei","123456",1000);

        AccountDao accountDao =new AccountDaoImpl();
        accountDao.addAccount(account);



    }

    @Test
    public void testUpdateBalanceByAid(){

        AccountDao accountDao =new AccountDaoImpl();
        accountDao.udpateBalanceByAid(1,900);
        System.out.println(1/0);
        accountDao.udpateBalanceByAid(2,1100);

    }
}
