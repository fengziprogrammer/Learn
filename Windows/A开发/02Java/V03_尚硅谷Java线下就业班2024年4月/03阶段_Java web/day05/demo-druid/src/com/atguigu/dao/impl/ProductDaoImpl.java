package com.atguigu.dao.impl;

import com.atguigu.dao.ProductDao;
import com.atguigu.util.JDBCUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.Connection;
import java.sql.SQLException;

public class ProductDaoImpl  implements ProductDao {
    private QueryRunner queryRunner =new QueryRunner();
    @Override
    public double getPriceByPid(Integer pid) {
        Connection connection = JDBCUtil.getConnection();
        Double price =0.0;
        try {
            price = queryRunner.query(
                    connection,
                    "select price from product where pid = ?"
                    ,
                    new ScalarHandler<Double>(),
                    pid
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return price;
    }

    @Override
    public int decreaseStockByPid(Integer pid, Integer stock) {

        String sql ="update product set stock = stock - ? where pid = ?";
        Connection connection = JDBCUtil.getConnection();
        int rows= 0;
        try {
             rows = queryRunner.update(connection, sql, stock, pid);
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return rows;
    }
}
