package com.atguigu.generic;

//ChineseStudent不再是泛型类了
public class ChineseStudent extends Student<String> {
    public ChineseStudent(String name, String score) {
        super(name, score);
    }
}
