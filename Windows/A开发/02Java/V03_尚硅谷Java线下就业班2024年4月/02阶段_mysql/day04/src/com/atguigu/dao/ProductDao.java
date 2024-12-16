package com.atguigu.dao;

public interface ProductDao {

    /**
     * 根据图书ID获取图书单价
     * @param pid
     * @return
     */
    double getPriceByPid(Integer pid);



    /**
     * 根据产品pid 减少库存的方法
     * @param pid
     * @param stock
     * @return
     */
    int decreaseStockByPid(Integer pid,Integer stock);

}
