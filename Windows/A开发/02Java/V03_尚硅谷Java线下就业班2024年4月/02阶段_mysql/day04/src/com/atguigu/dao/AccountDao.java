package com.atguigu.dao;

import com.atguigu.pojo.Account;

public interface AccountDao {
    /**
     * 将account对象存入account表格的方法
     * @param account 要存入数据库的对象
     * @return 影响数据库记录数
     */
    int addAccount(Account account);

    /**
     * 根据aid修改balance的方法
     * @param aid
     * @param balance
     * @return
     */
    int udpateBalanceByAid(Integer aid,Integer balance);


    /**
     * 根据aid减少用户金额的方法
     * @param aid
     * @param balance
     * @return
     */
    int decreaseBalanceByAid(Integer aid,Integer balance);


}
