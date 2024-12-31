package io;

import java.io.*;

/**
 * 字符流
 * java.io.Reader和Writer是所有字符输入流与输出流的超类。
 * 字符流与字节流(InputStream和OutputStream的子类)不同
 * 的是读写单位，字符流最小以一个字符为单位读写(char)
 * 但是底层本质还是读写字节，只不过字符与字节的转换由字符流完成
 *
 * 转换流:
 * java.io.InputStreamReader和OutputStreamWriter
 * 它们是一对高级流，实际开发中我们在读写字符串而组建流连接时他们是非常重要的
 * 一环。但是我们不会直接操作这两个流。
 * 它主要的作用:
 * 1:衔接其他高级字符流与字节流
 * 2:将字符与字节按照指定字符集进行转换
 *
 */
public class OSWDemo {
    public static void main(String[] args) throws IOException {
        //向文件中写入文本数据
        FileOutputStream fos
                = new FileOutputStream("osw.txt");
        OutputStreamWriter osw
                = new OutputStreamWriter(fos,"UTF-8");
        osw.write("让我再看你一遍，从南到北。");
        osw.write("像是被五环路，蒙住的双眼。");

        System.out.println("写出完毕");
        osw.close();

    }
}
