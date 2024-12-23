package com.atguigu.dao.impl;

import com.atguigu.dao.OrderDao;
import com.atguigu.pojo.Order;
import com.atguigu.util.JDBCUtil;
import org.apache.commons.dbutils.QueryRunner;

import java.sql.Connection;
import java.sql.SQLException;

public class OrderDaoImpl  implements OrderDao {
    private QueryRunner queryRunner =new QueryRunner();
    @Override
    public int addOrder(Order order) {
        Connection connection = JDBCUtil.getConnection();

        String sql ="insert into t_order values(DEFAULT,?,?,?)";
        int rows =0;
        try {
            rows =queryRunner.update(connection,
                    sql,
                    order.getAid(),
                    order.getPid(),
                    order.getCount()
                    );
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return rows;
    }
}
