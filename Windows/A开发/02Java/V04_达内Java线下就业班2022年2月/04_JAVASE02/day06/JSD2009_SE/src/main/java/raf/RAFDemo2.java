package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 从文件中读取字节
 */
public class RAFDemo2 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf
                = new RandomAccessFile("raf.dat","r");
        //文件内容:00000001 00000010
        /*
            int read()
            读取一个字节并以int形式返回(读取的数据在int值对应2进制的低八位上)
            如果返回的int值为-1则表示文件末尾
         */
        // 00000000 00000000 00000000 00000001
        int d = raf.read();
        System.out.println(d);
        // 00000000 00000000 00000000 00000010
        d = raf.read();
        System.out.println(d);

        d = raf.read();//-1 文件末尾了
        System.out.println(d);
        raf.close();


    }
}





