package com.atguigu.set;

import java.util.Comparator;
import java.util.TreeSet;

public class Demo6 {

    /*
    请使用TreeSet编写程序,将字符串"helloatguigu"进行排序,顺序为: aegghillotuu
        分析
            str  -> arr
            treeset.add(arr[i])

            自定义排序(更推荐)
                1>  new TreeSet(比较器 Comparator)
                2> 重写compare()     返回值 代表的是两个对象的差值,决定了如何排序
                    0 两个对象一致  去重  -> 只保留第一个元素
                    正数  后- 前 差值为正  后 > 前  --> 正序输出
                    负数  后 < 前  --> 逆序输出
     */
    public static void main(String[] args) {

        String s = "helloatguigu";
        char[] arr = s.toCharArray();
        TreeSet<Character> set = new TreeSet<>(new Comparator<Character>() {

            /*
                返回值 代表的是两个对象的差值,决定了如何排序
                顺序为: aegghillotuu  正序 不去重
             */
            @Override
            public int compare(Character o1, Character o2) {

                int num = o1.compareTo(o2);
                return (num == 0) ? 1 :num;
            }
        });

        for (char ch : arr) {
            set.add(ch);
        }
        System.out.println(set);

    }
}
