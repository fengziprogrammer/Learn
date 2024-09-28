package com.itheima.map_demo.map_demo;

import com.itheima.map_demo.map_test.HashMapTest1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    Map中常用方法 :
        public V put(K key, V value):  把指定的键与指定的值添加到Map集合中
        public V remove(Object key): 把指定的键 所对应的键值对元素 在Map集合中删除，返回被删除元素的值
        public V get(Object key) 根据指定的键，在Map集合中获取对应的值
        public Set<K> keySet(): 获取Map集合中所有的键，存储到Set集合中
        public boolean containKey(Object key): 判断该集合中是否有此键。

     需求 : 将以下数据保存到Map集合中 , 进行测试以上方法
        “文章“       "马伊琍"
        “谢霆锋”     “王菲”
        “李亚鹏”     “王菲”

    注意 :
        单列集合中所有集合添加的方法都叫做 : add()
        双列集合中所有集合添加的方法都叫做 : put()
 */
public class MapDemo1 {
    public static void main(String[] args) {
        // 创建集合对象
        Map<String, String> map = new HashMap<>();

        //  public V put(K key, V value):  把指定的键与指定的值添加到Map集合中
        //  put方法如果把元素成功添加则返回null
        map.put("文章", "马伊琍");
        map.put("李亚鹏", "王菲");
        map.put("谢霆锋", "王菲");
//        System.out.println(map.put("谢霆锋", "王菲"));   // null
//        System.out.println(map.put("谢霆锋", "张柏芝")); // 王菲

        // public V remove(Object key): 把指定的键 所对应的键值对元素 在Map集合中删除，返回被删除元素的值
        // System.out.println(map.remove("文章"));

        // public V get(Object key) 根据指定的键，在Map集合中获取对应的值
        // System.out.println(map.get("文章1"));

        // public Set<K> keySet(): 获取Map集合中所有的键，存储到Set集合中
        // Set<String> set = map.keySet();
        // System.out.println(set);

        // Collection<String> values = map.values();
        // System.out.println(values);

        //  public boolean containKey(Object key): 判断该集合中是否有此键
        System.out.println(map.containsKey("谢霆锋"));
        System.out.println(map.containsValue("马伊琍"));

        System.out.println(map);// {文章=马伊琍, 谢霆锋=王菲, 李亚鹏=王菲}
    }
}
