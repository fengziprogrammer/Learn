package com.atguigu.a_dbutils;

import com.atguigu.utils.DruidUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.junit.Test;

public class Demo02Dbutils {
    @Test
    public void insert()throws Exception{
        //1.创建QueryRunner
        QueryRunner qr = new QueryRunner(DruidUtils.getDataSource());
        //2.准备sql
        //String sql = "insert into category (cname) values (?)";
        //3.执行sql
        qr.update("insert into category (cname) values (?)","鼠标");
    }

    @Test
    public void delete()throws Exception{
        //1.创建QueryRunner
        QueryRunner qr = new QueryRunner(DruidUtils.getDataSource());
        //2.准备sql
        //String sql = "insert into category (cname) values (?)";
        //3.执行sql
        qr.update("delete from category where cid = ?",9);
    }

    @Test
    public void update()throws Exception{
        //1.创建QueryRunner
        QueryRunner qr = new QueryRunner(DruidUtils.getDataSource());
        //2.准备sql
        //String sql = "insert into category (cname) values (?)";
        //3.执行sql
        qr.update("update category set cname = ? where cid = ?","玩具",3);
    }
}
