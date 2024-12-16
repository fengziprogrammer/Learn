package com.atguigu.a_dbutils;

import com.atguigu.utils.DruidUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.junit.Test;

import java.sql.Connection;

public class Demo01Dbutils {
    @Test
    public void insert()throws Exception{
        //1.创建QueryRunner对象
        QueryRunner qr = new QueryRunner();
        //2.获取连接
        Connection connection = DruidUtils.getConn();
        //3.准备sql
        String sql = "insert into category (cname) values (?)";
        //4.执行sql
        qr.update(connection,sql,"手机");
        //5.关闭资源
        DruidUtils.close(connection,null,null);
    }

    @Test
    public void delete()throws Exception{
        //1.创建QueryRunner对象
        QueryRunner qr = new QueryRunner();
        //2.获取连接
        Connection connection = DruidUtils.getConn();
        //3.准备sql
        String sql = "delete from category where cid = ?";
        //4.执行sql
        qr.update(connection,sql,8);
        //5.关闭资源
        DruidUtils.close(connection,null,null);
    }

    @Test
    public void update()throws Exception{
        //1.创建QueryRunner对象
        QueryRunner qr = new QueryRunner();
        //2.获取连接
        Connection connection = DruidUtils.getConn();
        //4.执行sql
        qr.update(connection,"update category set cname = ? where cid = ?","手办",7);
        //5.关闭资源
        DruidUtils.close(connection,null,null);
    }
}
