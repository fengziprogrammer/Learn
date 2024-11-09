package com.itheima.file_demo;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    练习一 ：统计一个文件夹中每种文件的个数并打印。

	打印格式如下：
		txt:3个
		doc:1个
		jpg:2个
		…
	分析 :
	    HashMap<String , Integer>集合 : 键存储的是文件扩展名  值存储的是文件类型出现的次数
	    主要使用的是HashMap集合的键唯一

    思路 : new File("day10_demo\\统计文件个数文件夹"); --> listFiles() --> File[] --> 遍历数组拿到每一个File对象
    --> getName() --> split("\\.") --> 数组[1]

 */
public class FileTest1 {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        File f = new File("day10_demo\\统计文件个数文件夹");
        // 拿到儿子辈的文件数组
        File[] files = f.listFiles();
        // 增强for遍历File数组
        for (File file : files) {
            // 获取每一个File对象的名字
            String FileName = file.getName();// a.a.a.a.txt
            String[] strings = FileName.split("\\.");
            // name表示的是扩展名
            String name = strings[strings.length - 1];
            if (hm.containsKey(name)) {
                // 包含
                hm.put(name, hm.get(name) + 1);
            } else {
                // 键没有此扩展名
                hm.put(name, 1);
            }
        }
        // 遍历Map集合
        Set<Map.Entry<String, Integer>> set = hm.entrySet();
        for (Map.Entry<String, Integer> entry : set) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + ":" + value + "个");
        }
    }
}