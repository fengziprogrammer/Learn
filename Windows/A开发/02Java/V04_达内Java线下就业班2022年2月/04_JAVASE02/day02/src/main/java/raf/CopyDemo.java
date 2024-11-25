package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Random;

/**
 * 文件复制
 */
public class CopyDemo {
    public static void main(String[] args) throws IOException {
        RandomAccessFile src
                = new RandomAccessFile("movie.mp4","r");

        RandomAccessFile desc
                = new RandomAccessFile("movie_cp.mp4","rw");

        /*
            SE.pptx
            00111010 11010111 01011001 01110010 11001010 00101010...

            SE_CP.pptx
            00111010
         */

        int d;//用于记录每次读取到的字节
        // d = 00000000 00000000 00000000 00111010
        long start = System.currentTimeMillis();
        while((d = src.read()) != -1) {
            desc.write(d);
        }
        long end = System.currentTimeMillis();
        System.out.println("复制完毕!耗时:"+(end-start)+"ms");

        src.close();
        desc.close();

    }
}
