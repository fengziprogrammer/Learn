package com.atguigu.a_buffered;

import java.io.BufferedReader;
import java.io.FileReader;

public class Demo03BufferedReader {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("day20_IO\\io\\bufferedwriter.txt"));
        /*String s1 = br.readLine();
        System.out.println("s1 = " + s1);

        String s2 = br.readLine();
        System.out.println("s2 = " + s2);

        String s3 = br.readLine();
        System.out.println("s3 = " + s3);

        String s4 = br.readLine();
        System.out.println("s4 = " + s4);*/

        String line;
        while((line = br.readLine())!=null){
            System.out.println(line);
        }

        br.close();
    }
}
