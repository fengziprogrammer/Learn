package io;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * 缓冲字符流
 * java.io.BufferedWriter和BufferedReader
 * 缓冲在符流是一对高级流，内部维护一个缓冲区以块读写文本数据来提高读写效率。
 *
 * java.io.PrintWriter是具有自动行刷新的缓冲字符输出流，内部总是连接着
 * BufferedWriter作为缓冲加速功能。更常用。
 *
 * 缓冲流有一个特点:可以按行读写文本数据
 */
public class PWDemo {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        /*
            向文件中写入文本数据

            PrintWriter提供了直接对文件进行写操作的构造方法:
            PrintWriter(String fileName)
            PrintWriter(File file)
            内部会自行完成流连接操作，对文件进行写文本。

            PrintWriter(String fileName,String csn)
            PrintWriter(File file,String csn)
            创建的同时还可以指定字符集，推荐用这样的方式创建。实际开发中我们写出
            文本数据时都应当确定字符集，而不使用系统默认的。

         */
        PrintWriter pw = new PrintWriter("pw.txt","UTF-8");

        pw.println("我知道，那些夏天，就像青春一样回不来。");
        pw.println("代替梦想的，也只能是勉为其难。");
        System.out.println("写出完毕!");
        pw.close();

    }
}






