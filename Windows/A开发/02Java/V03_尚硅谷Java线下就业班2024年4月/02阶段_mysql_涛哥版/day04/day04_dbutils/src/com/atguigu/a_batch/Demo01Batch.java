package com.atguigu.a_batch;

import com.atguigu.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * 1.在设置完所有要添加的参数,调用PreparedStatement中的addBatch(),
 *   将SQL语句添加到PreparedStatement中
 * 2.调用PreparedStatement中的executeBatch()方法批处理sql语句
 */
public class Demo01Batch {
    public static void main(String[] args)throws Exception {
        //1.获取连接
        Connection connection = JDBCUtils.getConn();
        //2.准备sql
        String sql = "insert into category (cname) values (?)";
        //3.获取执行平台
        PreparedStatement pst = connection.prepareStatement(sql);

        //循环100次添加
        for (int i = 0; i < 100; i++) {
            pst.setObject(1,"箱包"+i);
            //将多个SQL语句，写入内存
            pst.addBatch();
        }

         /*
          批量执行
          executeBatch() 将一批命令提交给数据库来执行，全部命令执行成功
          将内存中的SQL，打包一起发送MySQL运行
         */
        pst.executeBatch();

        //4.关闭资源
        JDBCUtils.close(connection,pst,null);

    }
}
