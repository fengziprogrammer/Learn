package raf;

import com.sun.deploy.nativesandbox.NativeSandboxBroker;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 读写基本类型数据，以及RAF基于指针的读写操作
 */
public class RAFDemo3 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf
                = new RandomAccessFile("raf.dat","rw");

        long pos = raf.getFilePointer();//获取RAF的指针位置
        System.out.println("pos:"+pos);//0,默认从头开始

        //写入一个int最大值到文件中
        int imax = Integer.MAX_VALUE;
        /*
                                       vvvvvvvv
            01111111 11111111 11111111 11111111
            imax>>>24
            00000000 00000000 00000000 01111111
            imax>>>16
            00000000 00000000 01111111 11111111
         */
        raf.write(imax>>>24);
        System.out.println("pos:"+raf.getFilePointer());//1
        raf.write(imax>>>16);
        raf.write(imax>>>8);
        raf.write(imax);
        System.out.println("pos:"+raf.getFilePointer());//4

        raf.writeInt(imax);//连续写4字节将int值写入文件，等同上面四句
        System.out.println("pos:"+raf.getFilePointer());//8
        raf.writeLong(123L);//连续写8字节将long值写入文件
        System.out.println("pos:"+raf.getFilePointer());//16
        raf.writeDouble(123.123);//连续写8字节将double写入文件
        System.out.println("pos:"+raf.getFilePointer());//24
        System.out.println("写出完毕!");
        /*
            void seek(long pos)
            将指针移动到指定位置
         */
        raf.seek(0);//移动到文件最开始

        int d = raf.readInt();
        System.out.println(d);//
        System.out.println("pos:"+raf.getFilePointer());//4

        //读取long
        raf.seek(8);//移动到文件的第9个字节的位置
        long l = raf.readLong();
        System.out.println(l);//123
        System.out.println("pos:"+raf.getFilePointer());//16

        double dou = raf.readDouble();
        System.out.println(dou);//123.123
        System.out.println("pos:"+raf.getFilePointer());//24

        //修改long值为456
        //1现将指针移动到long的开始位置
        raf.seek(8);
        //2从新写入456对应的2进制(long值为8字节)
        raf.writeLong(456L);


        raf.seek(8);
        l = raf.readLong();
        System.out.println(l);

        raf.close();
    }
}





