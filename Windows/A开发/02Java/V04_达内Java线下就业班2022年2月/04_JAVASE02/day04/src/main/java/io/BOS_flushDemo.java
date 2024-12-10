package io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 缓冲输出流的缓冲区问题
 */
public class BOS_flushDemo {
    public static void main(String[] args) throws IOException{
        FileOutputStream fos = new FileOutputStream("bos.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        String str = "摩擦摩擦，在光滑的马路牙子上打出溜划";
        bos.write(str.getBytes("UTF-8"));
        /*
            void flush()
            将缓冲流的缓冲区中已经缓存的数据一次性写出。
            频繁调用这个方法会降低写数据的效率，但是可以保证写出数据的及时性
         */
        bos.flush();
        System.out.println("写出完毕!");

        bos.close();
    }
}
