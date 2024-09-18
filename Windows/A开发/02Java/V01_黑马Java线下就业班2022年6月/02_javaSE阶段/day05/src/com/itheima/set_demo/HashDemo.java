package com.itheima.set_demo;

import java.util.HashSet;

public class HashDemo {
    public static void main(String[] args) {
        HashSet<Person> hs = new HashSet<>();//{ p1 }

        Person p1 = new Person("李沁", 3);
        // Person p2 = new Person("李沁" , 18);
        Person p2 = new Person("柳岩", 7);

        hs.add(p1);
        hs.add(p2);

        for (Person h : hs) {
            System.out.println(h);
        }
    }
}
/*
    public V put(K key, V value) { // key代表的是HashSet集合添加的元素 p2

        int hash = hash(key); // 通过对象调用hashCode方法 , 获取添加元素的哈希值

        // 遍历当前集合中已经存在的元素
        for (Entry<K,V> e = table[i];  e != null; e = e.next) {
            Object k;
            if (e.hash == hash  && ( (k = e.key) == key || key.equals(k) )   ) {
                V oldValue = e.value;
                e.value = value;
                e.recordAccess(this);
                return oldValue;
            }
        }

        modCount++;
        // 添加元素的方法
        addEntry(hash, key, value, i);
        return null;
    }
*/