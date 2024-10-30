package com.atguigu.a_buffered;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Demo02BufferedWriter {
    public static void main(String[] args)throws Exception {
        BufferedWriter bw = new BufferedWriter(new FileWriter("day20_IO\\io\\bufferedwriter.txt"));
        bw.write("枯藤老树昏鸦");
        bw.newLine();
        bw.write("小桥流水人家");
        bw.newLine();
        bw.write("古道西风瘦马");
        bw.newLine();
        bw.write("夕阳西下,断肠人在天涯");
        bw.newLine();
        bw.close();
    }
}
