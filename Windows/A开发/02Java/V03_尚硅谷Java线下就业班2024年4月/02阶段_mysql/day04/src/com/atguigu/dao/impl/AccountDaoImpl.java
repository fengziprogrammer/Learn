package com.atguigu.dao.impl;

import com.atguigu.dao.AccountDao;
import com.atguigu.pojo.Account;
import com.atguigu.util.JDBCUtil;
import org.apache.commons.dbutils.QueryRunner;

import java.sql.Connection;
import java.sql.SQLException;

public class AccountDaoImpl implements AccountDao {
    /*专门封装操作Account表格数据的方法*/


    /**
     * 将account对象存入account表格的方法
     * @param account 要存入数据库的对象
     * @return 影响数据库记录数
     */
    public int addAccount(Account account){
        int rows =0;
        Connection connection = JDBCUtil.getConnection();

        QueryRunner queryRunner =new QueryRunner();
        String sql ="insert into account values(DEFAULT,?,?,?)";

        try {
            rows =queryRunner.update(
                    connection,
                    sql,
                    account.getUsername(),
                    account.getPassword(),
                    account.getBalance()
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }

        JDBCUtil.release(null,null,connection);


        return rows;
    }

    @Override
    public int udpateBalanceByAid(Integer aid, Integer balance) {
        int rows =0;
        Connection connection = JDBCUtil.getConnection();

        QueryRunner queryRunner =new QueryRunner();
        String sql ="update account set balance = ? where aid = ?";

        try {
            rows =queryRunner.update(
                    connection,
                    sql,
                    balance ,
                    aid
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }

        JDBCUtil.release(null,null,connection);


        return rows;
    }
}
