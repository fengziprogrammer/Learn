package com.itheima.bufferedstream_demo;

import java.io.*;
import java.util.Arrays;

/*
    需求：读取文件中的数据 : 33 22 11 55 44
    排序后 : 11 22 33 44 55  再次写到本地文件

    分析 :
        文件中 : 33 22 11 55 44
        BufferedReader的功能readLine() : "33 22 11 55 44"
        使用String类中的功能split(" ") : {"33" ,"22" ,"11" ,"55" ,"44"}
        把字符串数组 --> 整数类型数组
        Arrays.sort(整数数组) : {11,22,33,44,55}
        创建高效的字符输出流
        遍历数组按照格式写入文件中
        释放资源

    步骤 :
        1 创建高效的字符输入流对象
        2 读取文件中的一行数据
        3 将数据按照空格切割
        4 把字符串数组转成int类型数组
        5 对int类型的数组进行排序
        6 创建高效的字符输出流对象
        7 遍历数组,把数组中的数据写入到文件中
        8 释放资源
 */
public class BufferedStreamDemo3 {
    public static void main(String[] args) throws IOException {
        // 1 创建高效的字符输入流对象
        BufferedReader br = new BufferedReader(new FileReader("day11_demo\\numbers.txt"));

        // 3 读取文件中的一行数据
        String s = br.readLine();
        // 4 将数据按照空格切割
        String[] strings = s.split(" ");
        // 5 把字符串数组转成int类型数组
        int[] arr = new int[strings.length];
        for (int i = 0; i < strings.length; i++) {
            arr[i] = Integer.parseInt(strings[i]);
        }

        br.close();
        // 排序
        Arrays.sort(arr);

        // 2 创建高效的字符输出流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("day11_demo\\numbers.txt" ));

        // 6 遍历数组,把数组中的数据写入到文件中
        for (int i = 0; i < arr.length; i++) {
            bw.write(arr[i] + "");
            if (i != arr.length - 1) {
                bw.write(" ");
            }
            bw.flush();
        }

        // 7 释放资源
        bw.close();
    }
}