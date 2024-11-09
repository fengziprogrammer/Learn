package com.itheima.inputstream_demo;

/*
    JDK7版本优化处理方式
        1 JDK7优化后可以使用 try-with-resource 语句 , 该语句确保了每个资源在语句结束时自动关闭。
        2 简单理解 : 使用此语句,会自动释放资源 , 不需要自己在写finally代码块了

    格式 :
        try (创建流对象语句1 ; 创建流对象语句2 ...) {
            // 读写数据
        } catch (IOException e) {
            处理异常的代码...
        }

    注意 :
         使用前提 , 资源的类型必须是AutoCloseable接口的实现类

    需求 : 对上一个复制图片的代码进行使用捕获方式处理
 */

import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamDemo3 {
    public static void main(String[] args) {
        try (// 1 创建字节输出流对象
             FileOutputStream fos = new FileOutputStream("day10_demo\\abc.txt")) {
            // 2 写数据
            fos.write(97);
            fos.write(98);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}