package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 使用文件输入流读取文件数据
 */
public class FISDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("fos.txt");

        byte[] data = new byte[1000];
        int len = fis.read(data);
        System.out.println("实际读取到了"+len+"个字节");
        String str = new String(data,0,len,"UTF-8");
        System.out.println(str);
        System.out.println(str.length());
        fis.close();
    }
}
