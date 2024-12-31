package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 从文件中读取字符串
 */
public class ReadStringDemo {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf
                = new RandomAccessFile("raf.txt","r");
        //创建一个与文件等长的字节数组
        byte[] data = new byte[(int)raf.length()];
        raf.read(data);//一次性将文件所有字节读入字节数组
        //将字节数组所有内容按照UTF-8字符集还原为字符串
        String str = new String(data,"UTF-8");
        System.out.println(str);

        raf.close();
    }
}





