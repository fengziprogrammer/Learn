package com.atguigu.e_commonsio;

import org.apache.commons.io.IOUtils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Demo01IOUtils {
    public static void main(String[] args) throws Exception {
        method01();
        method02();
    }

    private static void method02() {
        //静态方法：IOUtils.closeQuietly(任意流对象)悄悄的释放资源，自动处理close()方法抛出的异常。
        FileWriter fw = null;
        try {
            fw = new FileWriter("day20_IO\\4.txt");
            fw.write("床前鞋两双");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //fw.close();
            if (fw != null) {
                IOUtils.closeQuietly(fw);
            }
        }
    }

    private static void method01() throws IOException {
        //静态方法：IOUtils.copy(InputStream in,OutputStream out)传递字节流，实现文件复制。
        IOUtils.copy(new FileInputStream("E:\\Idea\\io\\1.png"), new FileOutputStream("E:\\Idea\\io\\HongKong.png"));
    }
}
