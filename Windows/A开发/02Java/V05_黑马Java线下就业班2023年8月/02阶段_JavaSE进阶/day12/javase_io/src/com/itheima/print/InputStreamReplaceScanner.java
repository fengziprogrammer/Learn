package com.itheima.print;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputStreamReplaceScanner {
    public static void main(String[] args) throws IOException {
        //Scanner sc = new Scanner(System.in);
        //System.in = InputStream字节输入流对象

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入数据：");
        String str = br.readLine();
        br.close();

        System.out.println(str);
    }
}
