package com.itheima.stream_demo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class Test2 {
    public static void main(String[] args) throws IOException {
        // 需求 : 把文件中的姓刘的 , 名字长度2 过滤出来
        // 需求 : 名字作为键 , 字号作为值 , 收集到一个Map集合
        ArrayList<String> list = new ArrayList<>();
        addElement(list);
        System.out.println(list); // [1.刘焉-字君郎, 2.刘璋-字季玉, 3.刘备-字玄德, 4.刘禅-字公嗣]

        Map<String, String> map = list.stream().filter(
                (String s) -> { // "1.刘焉-字君郎"
                    String[] strings = s.split("-"); // {"1.刘焉" , "字君郎"}
                    String[] strings1 = strings[0].split("\\."); // {"1" , "刘焉"}
                    return strings1[1].startsWith("刘") && strings1[1].length() == 2;
                }
        ).collect(Collectors.toMap(
                // s = 1.刘焉-字君郎
                (String s) -> {
                    String[] strings = s.split("-"); // {"1.刘焉" , "字君郎"}
                    String[] strings1 = strings[0].split("\\."); // {"1" , "刘焉"}
                    return strings1[1];
                }
                ,
                (String s) -> {
                    String[] strings = s.split("-");// {"1.刘焉" , "字君郎"}
                    return strings[1];
                }
        ));

        System.out.println(map);

    }

    public static void addElement(ArrayList<String> list) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("D:\\传智播客\\上海-JavaSE进阶面授\\上海就业就业139期\\day08【异常，自定义异常 , Lambda表达式，Stream流】\\代码\\day08_demo\\name.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            list.add(line);
        }
        br.close();
    }
}
