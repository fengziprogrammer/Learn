package com.atguigu.b_tree;

import java.util.Comparator;
import java.util.TreeMap;

public class Demo02TreeMap {
    public static void main(String[] args) {
        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put("d","低头思故乡");
        treeMap.put("a","床前明月光");
        treeMap.put("c","举头望明月");
        treeMap.put("b","疑是地上霜");
        System.out.println(treeMap);

        System.out.println("================================");

        TreeMap<Person, String> treeMap1 = new TreeMap<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o2.getAge()-o1.getAge();
            }
        });
        treeMap1.put(new Person("柳岩",36),"湖南");
        treeMap1.put(new Person("曼曼",48),"辽宁");
        treeMap1.put(new Person("涛哥",18),"廊坊");
        System.out.println(treeMap1);
    }
}
