package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用文件流完成文件的复制操作
 * 流程:
 * 1:创建一个文件输入流用于读取原文件
 * 2:创建一个文件输出流用于写复制的文件
 * 3:循环从原文件读取字节写入到复制文件中完成复制操作
 *
 * 要求:使用块读写形式完成复制
 * 可参考RAF案例中的操作。
 */
public class Test1 {
    public static void main(String[] args) throws IOException{
        FileInputStream fis = new FileInputStream("2009.pptx");
        FileOutputStream fos = new FileOutputStream("2009_cp.pptx");

        int len;
        byte[] data = new byte[1024*10];
        while((len = fis.read(data))!=-1){
            fos.write(data,0,len);
        }
        System.out.println("复制完毕!");
        fis.close();
        fos.close();
    }
}






