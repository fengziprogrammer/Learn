package com.itheima.sh.test;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.itheima.sh.pojo.Brand;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Properties;

public class BrandTest {
    public static void main(String[] args) throws Exception {
        //调用查询所有品牌方法
        queryAllBrands();
        //添加
        //addBrand();
    }

    //查询所有品牌方法
    private static void queryAllBrands() throws Exception {
       /*
            分析：
                我们需要将数据表的每行数据查询封装到Brand实体类对象中，一行数据对应一个Brand对象，多行数据对应多个实体类对象，
                多个实体类对象使用List集合存储
        */
        //1.创建List集合对象存储Brand对象
        ArrayList<Brand> list = new ArrayList<>();
        //2.创建数据库连接池对象
        Properties p = new Properties();
        //关联配置文件
        p.load(new FileInputStream("src\\druid.properties"));
        DataSource ds = DruidDataSourceFactory.createDataSource(p);
        //3.获取连接
        Connection conn = ds.getConnection();
        //4.获取预编译对象
        PreparedStatement pst = conn.prepareStatement("select * from tb_brand");
        //5.执行sql
        ResultSet rs = pst.executeQuery();
        //6.处理结果集
        while (rs.next()) {
            //7.获取数据
            int id = rs.getInt("id");
            String brandName = rs.getString("brand_name");
            String companyName = rs.getString("company_name");
            int ordered = rs.getInt("ordered");
            String description = rs.getString("description");
            int status = rs.getInt("status");
            //8.创建Brand对象
            Brand brand = new Brand(id,brandName,companyName,ordered,description,status);
            //9.将对象brand放到list中
            list.add(brand);
        }
        //10.输出集合
        list.forEach(System.out::println);//:: 方法引用
//        System.out.println("list = " + list);
        //11.释放资源
        rs.close();
        pst.close();
        conn.close();

    }

    //添加品牌方法
    private static void addBrand() throws Exception {


    }

    //修改
    private static void updateBrand() {


    }

    //删除
    private static void deleteBrand() {


    }
}
