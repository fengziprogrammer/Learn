package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 通过提高每次实际读写的数据量，减少实际读写的次数可以提高读写效率
 * 单字节读写属于随机读写形式。一组字节读写属于块读写。
 * 对于机械硬盘而言，随机读写的效率非常差，块读写效率还是不错的。
 *
 */
public class CopyDemo2 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile src
                = new RandomAccessFile("movie.mp4","r");

        RandomAccessFile desc
                = new RandomAccessFile("movie_cp2.mp4","rw");

        /*
            int read(byte[] data)
            一次性从文件中读取给定的字节数组总长度的字节量，并存入到该数组中
            返回值为实际读取到的字节量，如果返回为-1则表示文件末尾。

            src
            00111010 11010111 01011001 01110010 11001010 00101010 01011101

            byte[] data = new byte[3];
            [00111010 11010111 01011001]

            int len = src.read(data) //第一次调用时读取文件前3个字节放入数组
            len:3


            void write(byte[] data)
            一次性将给定的字节数组中的所有字节写入文件

            void write(byte[] data,int offset,int len)
            将给定的字节数组从下标offset处的连续len个字节一次性写出

            00000000  1byte  1字节
            1024byte  1kb
            1024kb    1mb
            1024mb    1gb
         */
        byte[] data = new byte[1024*10];//10kb
        int len;//记录每次实际读取到的字节数
        long start = System.currentTimeMillis();
        while((len = src.read(data))!=-1){
            //从原文件实际读取到多少字节，就写多少字节
            desc.write(data,0,len);
        }
        long end = System.currentTimeMillis();
        System.out.println("复制完毕!耗时:"+(end-start)+"ms");

        src.close();
        desc.close();
    }
}







