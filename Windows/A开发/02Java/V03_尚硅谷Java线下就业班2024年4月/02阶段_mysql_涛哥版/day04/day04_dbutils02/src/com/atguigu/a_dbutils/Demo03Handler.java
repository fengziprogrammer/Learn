package com.atguigu.a_dbutils;

import com.atguigu.b_pojo.Category;
import com.atguigu.utils.DruidUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ColumnListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.junit.Test;

import java.util.List;

public class Demo03Handler {
    @Test
    public void beanHandler()throws Exception{
        QueryRunner qr = new QueryRunner(DruidUtils.getDataSource());
        String sql = "select * from category";
        Category category = qr.query(sql, new BeanHandler<>(Category.class));
        System.out.println(category);
    }

    @Test
    public void beanListHandler()throws Exception{
        QueryRunner qr = new QueryRunner(DruidUtils.getDataSource());
        String sql = "select * from category";
        List<Category> list = qr.query(sql, new BeanListHandler<>(Category.class));
        for (Category category : list) {
            System.out.println(category);
        }
    }


    @Test
    public void scalarHandler()throws Exception{
        QueryRunner qr = new QueryRunner(DruidUtils.getDataSource());
        //String sql = "select * from category";
        //Object data = qr.query(sql, new ScalarHandler<>(1));
        //Object data = qr.query(sql, new ScalarHandler<>("cname"));
        //Object data = qr.query(sql, new ScalarHandler<>());
        String sql = "select count(*) from category";
        Object data = qr.query(sql, new ScalarHandler<>());
        System.out.println("data = " + data);
    }

    @Test
    public void columnListHandler()throws Exception{
        QueryRunner qr = new QueryRunner(DruidUtils.getDataSource());
        String sql = "select * from category";
        //List<Object> list = qr.query(sql, new ColumnListHandler<>(1));
        List<Object> list = qr.query(sql, new ColumnListHandler<>("cname"));
        for (Object o : list) {
            System.out.println(o);
        }
    }

}
