package com.atguigu.genericity;

import java.util.ArrayList;

public class Demo3 {


    /*
        泛型
            <大写字母>
            约束的 是 集合的元素的类
        泛型的好处
            1> 语法校验从运行时 提前到编译期
            2> 省略了强制转换

            一般情况下 推荐加上泛型  但是不推荐将Object当做泛型
     */
    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        list.add(112);
        list.add("aa");
        list.add(true);
        System.out.println(list);

        for (Object obj : list) {// obj 每个元素
            if(obj  instanceof  String){

                String s = (String)obj;// 强转
                System.out.println(s.length());
            }
        }

        ArrayList<String> list2 = new ArrayList();
        // list2.add(112);
        // list2.add(true);
        list2.add("aa");
        list2.add("bbb");
        list2.add("cc");
        System.out.println(list2);

        for (String s : list2) {
            System.out.println(s.length());
        }

    }
}
