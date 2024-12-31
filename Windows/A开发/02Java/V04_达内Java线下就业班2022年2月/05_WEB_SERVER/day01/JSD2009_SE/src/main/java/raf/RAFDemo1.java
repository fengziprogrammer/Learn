package raf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * java.io.RandomAccessFile
 * RAF是专门用来读写文件数据的类，其基于指针对文件进行随机访问。读写操作灵活
 */
public class RAFDemo1 {
    public static void main(String[] args) throws IOException {
        /*
            RandomAccessFile常用的构造器
            RandomAccessFile(String path,String mode)
            RandomAccessFile(File file,String mode)
            第一个参数是要操作的文件，可以直接给路径，或指定一个File对象
            第二个参数为操作模式:
            r:只读模式
            rw:读写模式
         */
        //对当前目录下的raf.dat文件进行操作
//        File file = new File("./raf.dat");
//        RandomAccessFile raf = new RandomAccessFile(
//                file,"rw"
//        );

        RandomAccessFile raf = new RandomAccessFile(
                "./raf.dat","rw"
        );
        /*
            void write(int d)
            向文件中写入1个字节，写入的是给定的int值对应的2进制的"低八位"
                                       vvvvvvvv
            00000000 00000000 00000000 00000001
         */
        raf.write(1);//文件内容:00000001
        raf.write(2);//文件内容:00000001 00000010
        System.out.println("写出完毕!");

        raf.close();







    }
}
