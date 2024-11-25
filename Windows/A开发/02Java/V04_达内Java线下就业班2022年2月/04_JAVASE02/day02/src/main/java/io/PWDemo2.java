package io;

import java.io.*;

/**
 * 使用流连接创建PW并完成文本数据的写出操作
 */
public class PWDemo2 {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        FileOutputStream fos = new FileOutputStream("pw2.txt");
        OutputStreamWriter osw
                = new OutputStreamWriter(fos,"UTF-8");
        BufferedWriter bw = new BufferedWriter(osw);
        PrintWriter pw = new PrintWriter(bw);

        pw.println("啦啦啦");
        pw.println("哈哈哈");
        System.out.println("写出完毕!");
        pw.close();


    }
}
