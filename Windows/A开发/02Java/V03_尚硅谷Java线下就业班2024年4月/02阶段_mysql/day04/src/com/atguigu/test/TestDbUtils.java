package com.atguigu.test;

import com.atguigu.pojo.Person;
import com.atguigu.util.JDBCUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ColumnListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.testng.annotations.Test;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class TestDbUtils {

    private QueryRunner queryRunner =new QueryRunner();

    /*测试增删改*/
    @Test
    public void testUpdate() throws SQLException {
        Connection connection = JDBCUtil.getConnection();
        int rows = queryRunner.update(connection, "insert into person values(?,?,?,?)", "1", "工藤新一", 12, "男");
        System.out.println(rows);
        JDBCUtil.release(null,null,connection);
    }





    // 查询多个简单数据  例如 一列
    @Test
    public void testQueryForValues() throws Exception{


        Connection connection = JDBCUtil.getConnection();
        List<String> names = queryRunner.query(connection, "select pname from person", new ColumnListHandler<String>());
        System.out.println(names);


        JDBCUtil.release(null,null,connection);

    }

    /*查询单个值*/
    @Test
    public void testQueryForValue() throws Exception{
        // 查询单个值

        Connection connection = JDBCUtil.getConnection();
        Long count = queryRunner.query(connection, "select count(1) from person", new ScalarHandler<Long>());
        System.out.println(count);

        JDBCUtil.release(null,null,connection);

    }


    /*查询多个对象集合*/
    @Test
    public void testQueryForObjectList() throws SQLException {

        // 获取连接
        Connection connection = JDBCUtil.getConnection();

        // CURD
        QueryRunner queryRunner =new QueryRunner();
        String sql="select pid,pname,page,pgender from person";
        List<Person> personList = queryRunner.query(connection, sql, new BeanListHandler<>(Person.class) );
        personList.forEach(System.out::println);

        // 根据person的pid 查询具体的Person
        JDBCUtil.release(null,null,connection);


    }


    /*查询单个对象*/
    @Test
    public void testQueryForObject() throws SQLException {

        // 获取连接
        Connection connection = JDBCUtil.getConnection();

        // CURD
        QueryRunner queryRunner =new QueryRunner();
        String sql="select pid,pname,page,pgender from person where pid = ?";
        Person person = queryRunner.query(connection, sql, new BeanHandler<>(Person.class), "14");
        System.out.println(person);


        // 根据person的pid 查询具体的Person
        JDBCUtil.release(null,null,connection);


    }
}
