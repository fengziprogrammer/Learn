package io;

import java.io.*;

/**
 * java标准的IO
 * Input和Output:输入与输出
 * 输入是从外界到程序的方向，作用是用来"读"的
 * 输出是从程序到外界的方向，作用是用来"写"的
 *
 * java.io.InputStream和OutputStream是两个抽象类，分别为字节输入流
 * 与字节输出流，里面定义了若干抽象方法，规定了输入流读取字节和输出流写出字节
 * 的相关方法。所有的字节流实现类(比如读写文件的，读写网络的等等)都继承自它们
 * 因此无论我们将来读写什么设备，只要使用对应的流用相同的读写字节方法就可以了。
 *
 * java将流划分为两类:
 * 节点流:也称为低级流，特点:真实连接我们程序与另一端的”管道“，负责实际读写
 *       数据的流。注意:读写数据一定是建立在低级流基础上进行的。
 * 处理流:也称为高级流，特点:不能独立存在，必须连接在其他流上，目的是当数据
 *       流经当前流时对其作某些加工处理，简化我们的读写操作。
 *
 * 文件流:java.io.FileOutputStream和FileInputStream
 * 它们是常用的一对低级流，用于读写文件数据。
 *
 *
 */
public class FOSDemo {
    public static void main(String[] args) throws IOException {
        /*
            构造方法:
            FileOutputStream(String path)
            FileOutputStream(File file)
            以上构造方法创建的文件输出流是覆盖模式，即:如果指定的文件已经
            存在，则会将该文件原有数据全部抹除。然后将通过当前流写出的数据
            保存到文件中。

            FileOutputStream(String path,boolean append)
            FileOutputStream(File file,boolean append)
            当第二个参数传入的为true则是追加模式，文件原数据保留，新写入的
            内容会被追加到文件中


            与RandomAccessFile写文件的区别:
            RAF是基于指针的随机读写形式，可以对文件任意位置写操作进行局部的
            覆盖，但是文件流不行，由于java标准的IO是顺序读写形式，对于写操
            作而言只能顺序向后写不能回退。因此写操作的灵活性不如RAF。
            但是后期基于流连接，我们可以串联若干高级流完成复杂读写操作，这一点
            是RAF所不及的。

         */
        FileOutputStream fos
                = new FileOutputStream("fos.txt",true);

//        RandomAccessFile fos
//                = new RandomAccessFile("fos.txt","rw");

        String str = "你存在，我深深的脑海里.";
        byte[] data = str.getBytes("UTF-8");
        fos.write(data);
        str = "我的梦里，我的心里，我的歌声里。";
        data = str.getBytes("UTF-8");
        fos.write(data);
        System.out.println("写出完毕!");
        fos.close();
    }
}








