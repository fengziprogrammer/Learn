package com.itheima.commons_io;

import org.apache.commons.io.IOUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    org.apache.commons.io.IOUtils类

    public static int copy(InputStream in, OutputStream out):
	把input输入流中的内容拷贝到output输出流中，返回拷贝的字节个数(适合文件大小为2GB以下)

    public static long copyLarge(InputStream in, OutputStream out):
	把input输入流中的内容拷贝到output输出流中，返回拷贝的字节个数(适合文件大小为2GB以上)
 */
public class Test1 {
    public static void main(String[] args) throws IOException {
        // public static int copy(InputStream in, OutputStream out):
        IOUtils.copy(new FileInputStream("D:\\传智播客\\安装包\\IO资源 图片\\liqin.jpg") , new FileOutputStream("day11_demo\\copy.jpg"));
    }
}