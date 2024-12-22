package com.itheima.sh.a_jdbc_01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCTest02 {
    public static void main(String[] args) throws Exception {
       /*
            需求：JDBC的API详解
        */
        /*
            第一步：注册驱动
            1.注册驱动：从mysql5.0以后开始我们java屌丝程序员不需要书写了，但是必须要注册驱动，底层帮助我们注册了
            2.注册驱动代码：是使用DriverManager类中的静态方法：
                static void registerDriver(Driver driver) 向 DriverManager 注册给定驱动程序。
                 参数Driver是一个sun公司定义的接口：java.sql.Driver,表示驱动接口，所有的驱动实现类都必须实现该接口。
                 接口不能创建对象，但是registerDriver方法需要java.sql.Driver接口对象，我们可以创建该接口的实现类对象，实现类由mysql厂商提供：
                    public class com.mysql.jdbc.Driver implements java.sql.Driver {
                        public Driver() throws SQLException {
                        }

                        static {
                            try {
                                DriverManager.registerDriver(new Driver());
                            } catch (SQLException var1) {
                                throw new RuntimeException("Can't register driver!");
                            }
                        }
                    }
                    创建mysql厂商提供实现类com.mysql.jdbc.Driver对象：new Driver();
                 代码实现：DriverManager.registerDriver(new Driver()); 这行代码是真正注册驱动的代码
            3.我们入门代码： Class clazz = Class.forName("com.mysql.jdbc.Driver");
                这样书写的原因是上述代码表示将com.mysql.jdbc.Driver类加载到内存中，当前类加载就会执行com.mysql.jdbc.Driver类中的静态代码块：
                 static {
                            try {
                                //真正注册mysql驱动的代码
                                DriverManager.registerDriver(new Driver());
                            } catch (SQLException var1) {
                                throw new RuntimeException("Can't register driver!");
                            }
                        }
            4.从mysql5.0(jdbc4开始，jar包是5.1后的包)以后开始我们java屌丝程序员不需要书写了，但是必须要注册驱动，底层帮助我们注册了
                底层使用spi机制，自动查找驱动包下面的：META-INF/services/java.sql.Driver的文件内容：
                    com.mysql.jdbc.Driver
                思想：就是将com.mysql.jdbc.Driver类加载内存中了然后执行该鳄梨静态代码块自动注册驱动了
         */

        /*
            第二步：获取和数据库连接：
                使用DriverManager类调用静态方法：
                    static Connection getConnection(String url, String user, String password)
                        方法返回值：Connection
                            1.Connection是sun公司定义的接口：java.sql.Connection
                            2.作用：
                                1）获取发送sql语句的对象：
                                    I:使用Connection接口的方法： Statement createStatement()
                                    II:PreparedStatement prepareStatement(String sql)
                                2) 操作事务，使用Connection接口的方法：
                                    开启手动控制事务：void setAutoCommit(false)
                                    一切正常，提交事务：void commit()
                                    出现异常，回滚事务：void rollback()
         */
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/day03_heima141", "root", "1234");

        /*
            第三步：
                获取发送sql语句对象:使用Connection接口中的方法：
                    Statement createStatement()
                    上述方法返回值：Statement，属于sun公司定义的接口：java.sql.Statement,用来向数据库发送sql语句：
                        1）DDL(数据库 数据表)和DML(insert update delete): 使用Statement接口中的方法：
                             int executeUpdate(String sql) 执行给定 SQL 语句，该语句可能为 INSERT、UPDATE 或 DELETE 语句，或者不返回任何内容的 SQL 语句（如 SQL DDL 语句）。
                                executeUpdate方法返回值：对于 SQL 数据操作语言 (DML) 语句，返回行记录数 (2) 对于什么都不返回的 SQL 语句，返回 0
                        2) DQL(select语句)：使用Statement接口中的方法：
                            ResultSet executeQuery(String sql) 执行给定的 SQL 语句，该语句返回单个 ResultSet 对象。
         */
        Statement st = conn.createStatement();

        /*
            第四步：
                向数据库发送sql语句，发送select语句，使用Statement接口中的方法：
                    ResultSet executeQuery(String sql)
                        executeQuery方法的返回值：ResultSet，是sun公司定义的接口：java.sql.ResultSet,表示结果集接口，用来存储从
                        mysql数据库服务器中查询的数据的。我们需要迭代ResultSet结果集来取出该结果集中的数据。
         */
        ResultSet rs = st.executeQuery("select * from user");
        /*
            第五步：处理结果集
                说明：
                    1.rs.next() 如果光标具有下一行数据返回true
         */
        while(rs.next()){
            //获取数据：
            //获取id
            int id = rs.getInt("id");//getInt方法的参数id表示数据表user的字段名
            String name = rs.getString("name");//getString方法的参数name表示数据表user的字段名
            int age = rs.getInt(3);//getInt方法的参数3,因为获取的字段age位于user表的第三列，所以这里的3表示第三列
            int sex = rs.getInt(4);//getInt方法的参数4,因为获取的字段sex位于user表的第4列，所以这里的4表示第4列
            //输出数据到idea控制台
            System.out.println(id+"---"+name+"---"+age+"---"+sex);
        }
        /*
            第六步：释放资源，将获取的资源还给mysql服务器
         */
        rs.close();
        st.close();
        conn.close();
    }
}
