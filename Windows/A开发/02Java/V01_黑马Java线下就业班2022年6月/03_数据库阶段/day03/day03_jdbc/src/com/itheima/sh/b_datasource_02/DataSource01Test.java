package com.itheima.sh.b_datasource_02;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

/*
	需求：德鲁伊数据库连接池入门
*/
public class DataSource01Test {
    public static void main(String[] args) throws Exception{
        //1.导入jar包
        //2.在src下面创建配置文件，书写配置参数
        //3.使用德鲁伊核心类调用静态方法获取连接池对象
        //创建属性集对象
        /*
            Properties : 表示属性集对象，属于Map集合，父类是Hashtable。
                1.该集合可以将集合中的数据保存到硬盘上
                2.该集合可以读取硬盘配置文件中的数据加载到内存中，要求配置文件的数据格式：key=value 重点
                    使用Properties集合中的方法： void load(InputStream inStream) 从输入流中读取属性列表（键和元素对）。
                                                    参数：inStream属于InputStream类型，字节输入流，使用字节输入流关联要加载数据的文件
         */
        Properties p = new Properties();
        //使用属性集对象p调用Properties中的load方法加载配置文件druid.properties
        //参数位置书写src\druid.properties 原因是对于字节输入流FileInputStream书写相对路径相对的是当前项目根目录
        p.load(new FileInputStream("src\\druid.properties"));
        // public static DataSource createDataSource(Properties properties)
        DataSource ds = DruidDataSourceFactory.createDataSource(p);
        //4.使用连接池对象调用方法从连接池中获取连接池
        Connection conn = ds.getConnection();
        //5.使用连接对象获取预编译对象
        PreparedStatement pst = conn.prepareStatement("select * from user2");
        //6.执行sql
        ResultSet rs = pst.executeQuery();
        //7.处理结果集
        while(rs.next()){
            //获取数据
            int id = rs.getInt("id");
            String username = rs.getString("username");
            String password = rs.getString("password");
            System.out.println(id+"--"+username+"--"+password);
        }
       
        //8.释放资源
        rs.close();
        pst.close();
        conn.close();//这里执行的close方法不是将连接还给数据库，而是放到数据库连接池中，该close执行的是德鲁伊包下的close
        
    }
}
