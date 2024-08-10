package com.atguigu.integer;

public class Demo2 {

    /*
        需求
            基本数据类型和字符串之间的转换
            int -> String
            String -> int

        结论
            你需要转换为什么类型,该类型的valueOf()


         新需求
            String -> Boolean

            double  -> String

     */
    public static void main(String[] args) {

        // int -> String
        int num = 3;
        String s1 = num + "";   // 比较常见
        System.out.println(s1);
        String s2 = String.valueOf("3");
        System.out.println(s2);

        // String -> int
        Integer i = Integer.valueOf("3");
        System.out.println(i);

        int i1 = Integer.parseInt("4");
        System.out.println(i1);

        Boolean b = Boolean.valueOf("true");
        System.out.println(b);



    }
}
