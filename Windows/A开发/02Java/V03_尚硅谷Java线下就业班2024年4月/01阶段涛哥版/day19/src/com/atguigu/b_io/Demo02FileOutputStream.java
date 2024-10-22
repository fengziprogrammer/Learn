package com.atguigu.b_io;

import java.io.FileOutputStream;

public class Demo02FileOutputStream {
    public static void main(String[] args)throws Exception {
        FileOutputStream fos = new FileOutputStream("day19_IO\\io\\1.txt",true);
        fos.write("床前明月光".getBytes());
        fos.write("\r\n".getBytes());
        fos.write("疑是地上霜\r\n".getBytes());
        fos.write("举头望明月\n".getBytes());
        fos.write("低头思故乡".getBytes());
        fos.close();
    }
}
