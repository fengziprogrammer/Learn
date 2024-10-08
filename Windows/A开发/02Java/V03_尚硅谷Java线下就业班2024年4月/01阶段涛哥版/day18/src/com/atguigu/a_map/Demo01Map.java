package com.atguigu.a_map;

import java.util.HashMap;
import java.util.Scanner;

public class Demo01Map {
    public static void main(String[] args) {
        //1.创建Scanner对象,键盘录入一个字符串:data
        Scanner sc = new Scanner(System.in);
        System.out.println("请您输入一个字符串:");
        String data = sc.next();
        //2.创建HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();
        //3.遍历data,将每一个元素获取出来
        char[] chars = data.toCharArray();
        for (char aChar : chars) {
            String key = aChar+"";
            //4.挨个判断,集合中是否包含指定的key
            if (!hashMap.containsKey(key)){
            //5.如果不包含,证明字符第一次出现,我们就将此字符和1存到集合中
                hashMap.put(key,1);
            }else{
            //6.如果包含,根据字符获取对应的value,让value++,重新存到集合中
                Integer value = hashMap.get(key);
                value++;
                hashMap.put(key,value);
            }
        }
        System.out.println(hashMap);
    }
}
