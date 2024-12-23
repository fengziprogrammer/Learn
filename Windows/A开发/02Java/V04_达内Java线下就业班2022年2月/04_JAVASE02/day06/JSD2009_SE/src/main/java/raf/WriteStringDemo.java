package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;

/**
 * 向文件中写入字符串
 */
public class WriteStringDemo {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf
             = new RandomAccessFile("raf.txt","rw");

        /*
            GBK:国标编码  英文占1字节，中文占2字节
            UTF-8:万国码，英文占1字节，中文占3字节
         */
        String line = "雷霆嘎巴~无情哈拉少~";
        /*
            UnsupportedEncodingException
            当我们将字符串按照指定字符集转换为字节时，如果字符集名字拼写有误
            则会抛出该异常
         */
        byte[] data = line.getBytes("UTF-8");
        raf.write(data);
        System.out.println("写出完毕!");
        raf.close();
    }
}





