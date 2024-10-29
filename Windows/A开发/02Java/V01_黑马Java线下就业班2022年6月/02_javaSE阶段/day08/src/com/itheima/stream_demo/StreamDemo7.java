package com.itheima.stream_demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

/*
    Stream流的收集操作 : 第三部分

    1 创建一个ArrayList集合，并添加以下字符串。字符串中前面是姓名，后面是年龄
        "zhangsan,23"
        "lisi,24"
        "wangwu,25"
    2 保留年龄大于等于24岁的人，并将结果收集到Map集合中，姓名为键，年龄为值
        需求1 : 保留年龄大于等于24岁的人
        需求2 : 并将结果收集到Map集合中，姓名为键，年龄为值
    收集方法 :
        public static  Collector toMap(Function keyMapper  ,   Function valueMapper)：把元素收集到Map集合中
 */
public class StreamDemo7 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("zhangsan,23");
        list.add("lisi,24");
        list.add("wangwu,25");

        //  需求1 : 保留年龄大于等于24岁的人
        Map<String, String> map = list.stream().filter((String s) -> {
            String[] strings = s.split(",");
            int age = Integer.parseInt(strings[1]);
            return age >= 24;
        }).collect(Collectors.toMap(
                // s代表的是字符串整体 "lisi,24"
                (String s) -> {  // 作为Map集合的键
                    return s.split(",")[0];
                }
                ,
                (String s) -> { // 作为Map集合的值
                    return s.split(",")[1];
                }
        ));

        System.out.println(map);
    }
}
