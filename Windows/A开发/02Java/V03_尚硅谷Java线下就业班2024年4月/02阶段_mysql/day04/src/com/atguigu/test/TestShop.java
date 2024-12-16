package com.atguigu.test;

import com.atguigu.dao.AccountDao;
import com.atguigu.dao.OrderDao;
import com.atguigu.dao.ProductDao;
import com.atguigu.dao.impl.AccountDaoImpl;
import com.atguigu.dao.impl.OrderDaoImpl;
import com.atguigu.dao.impl.ProductDaoImpl;
import com.atguigu.pojo.Order;

public class TestShop {
    public void testCheckout(){

        // 张三买了10本1号图书
        Integer aid = 2;
        Integer pid = 1;
        Integer stock = 10;



        // 用户减少金额



    }


    public void checkout(Integer aid,Integer pid,Integer stock){
        AccountDao accountDao =new AccountDaoImpl();
        ProductDao productDao =new ProductDaoImpl();
        OrderDao orderDao = new OrderDaoImpl();


        // 根据产品id获取产品单价
        double price = productDao.getPriceByPid(pid);

        // 修改用户的余额
        accountDao.decreaseBalanceByAid(aid,(int) (stock*price));

        // 修改产品的库存
        productDao.decreaseStockByPid(pid,stock);

        // 增加订单记录
        orderDao.addOrder(new Order(null,aid,pid,stock));



    }
}
