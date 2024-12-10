package io;

import java.io.*;

/**
 * 缓冲流:java.io.BufferedInputStream和OutputStream
 * 缓冲字节输入流与输出流是一对高级字节流，作用是加快读写效率。
 */
public class CopyDemo1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("2009.pptx");
        BufferedInputStream bis = new BufferedInputStream(fis);

        FileOutputStream fos = new FileOutputStream("2009_cp2.pptx");
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        int d;
        long start = System.currentTimeMillis();
        while((d = bis.read())!=-1){
            bos.write(d);
        }
        long end = System.currentTimeMillis();
        System.out.println("复制完毕!耗时:"+(end-start)+"ms");

        bis.close();
        bos.close();
    }
}
