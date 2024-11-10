package com.atguigu.exer;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//案例需求：使用文件字节流复制一个视频文件
//例如：D:\atguigu\javaee\JavaSE20220106\video\day0107_01video\day0107_01JavaSE阶段学什么.avi
//复制到当前工程的根目录
/*
复制文件：其实就是读一个文件，然后把读取的数据写到另一个文件


4、IO流操作的步骤：
A：先选择合适的IO流类，创建它的对象
B：读或写操作
C：关闭IO流
    因为IO流类的对象会在JVM内存中开辟空间。这个部分的内存，可以由JVM的GC自动回收。
    但是IO流的操作还会在JVM内存的外部开辟空间，因为IO操作需要用到操作系统的一些函数，这些内存GC是无法回收的。
    那么要通过调用close方法，通知操作系统释放对应的内存。
 */
public class Exercise3 {
    @Test
    public void test()throws IOException{
        FileInputStream fis = new FileInputStream("D:\\atguigu\\javaee\\JavaSE20220106\\video\\day0107_01video\\day0107_01JavaSE阶段学什么.avi");
        //要求上面这个文件必须存在，否则会报错

        FileOutputStream fos = new FileOutputStream("day0107_01JavaSE阶段学什么1.avi");
        //下面这个文件可以不存在

        byte[] data = new byte[1024];//一次读取1KB
    /*    while(fis.read(data) != -1){//错误，因为这个循环会导致每次循环读了两次，一次用于判断，一次用于输出
            fos.write(fis.read(data));
        }*/
        int len;
        while((len= fis.read(data)) !=-1){
            fos.write(data,0,len);
        }

        fis.close();
        fos.close();
    }

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\atguigu\\javaee\\JavaSE20220106\\video\\day0107_01video\\day0107_01JavaSE阶段学什么.avi");
        //要求上面这个文件必须存在，否则会报错

        FileOutputStream fos = new FileOutputStream("day0107_01JavaSE阶段学什么.avi");
        //下面这个文件可以不存在

        byte[] data = new byte[1024];//一次读取1KB
        while(true){
            int len = fis.read(data);//从源文件读取len个字节
            if(len == -1){
                break;
            }
            fos.write(data,0,len);//把本次读取的len个字节写到目标文件中
        }

        fis.close();
        fos.close();
    }
}
