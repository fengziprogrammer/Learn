package com.atguigu.test;

import com.atguigu.dao.AccountDao;
import com.atguigu.dao.OrderDao;
import com.atguigu.dao.ProductDao;
import com.atguigu.dao.impl.AccountDaoImpl;
import com.atguigu.dao.impl.OrderDaoImpl;
import com.atguigu.dao.impl.ProductDaoImpl;
import com.atguigu.pojo.Order;
import com.atguigu.util.JDBCUtil;
import org.testng.annotations.Test;

import java.sql.Connection;

public class TestShop {
    @Test
    public void testCheckout() throws Exception{
        // 让李四购买10本算法
        checkout(1,1,10);
    }


    /**
     * 用户购买产品的业务方法 (未来会在service层中)
     * @param aid
     * @param pid
     * @param stock
     */

    public void checkout(Integer aid,Integer pid,Integer stock) throws Exception{
        AccountDao accountDao =new AccountDaoImpl();
        ProductDao productDao =new ProductDaoImpl();
        OrderDao orderDao = new OrderDaoImpl();


        // 开启事务
        Connection connection = JDBCUtil.getConnection();
        connection.setAutoCommit(false);

        try{
            // 根据产品id获取产品单价
            double price = productDao.getPriceByPid(pid);

            // 修改用户的余额
            accountDao.decreaseBalanceByAid(aid,(int) (stock*price));

            // 修改产品的库存
            productDao.decreaseStockByPid(pid,stock);

            //int i = 1/0;

            // 增加订单记录
            orderDao.addOrder(new Order(null,aid,pid,stock));

        }catch (Exception e){
            // 回滚事务
            connection.rollback();
            e.printStackTrace();
        }finally {
            // 提价事务
            connection.commit();
        }

        // 释放资源
        JDBCUtil.release(null,null,connection);




    }
}
