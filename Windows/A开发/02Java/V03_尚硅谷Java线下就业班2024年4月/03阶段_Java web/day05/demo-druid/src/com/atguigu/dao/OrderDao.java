package com.atguigu.dao;

import com.atguigu.pojo.Order;

public interface OrderDao {
    /**
     * 增加一条订单的方法
     * @param order
     * @return
     */
    int addOrder(Order order);
}
