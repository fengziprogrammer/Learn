package com.itheima;

/*
    变量使用注意事项
        1.变量名不能重复
        2.变量未赋值不能使用
        3.定义long类型,要在数据后加L(大小写都行,一般大写)
        4.定义float类型,要在数据后加F(大小写都行,一般大写)
        5.可以在一行定义多个变量,数据类型必须一致(不推荐)
 */
public class Demo04 {
    public static void main(String[] args) {
        //1.变量名不能重复
        int a = 10;
        //int a = 20; //编译失败 -> 修改代码

        //2.(局部)变量未赋值不能使用
        int age = 18;
        age = 20;
        System.out.println(age);

        //3.定义long类型,要在数据后加L(大小写都行,一般大写)
        long l1 = 10000; //将int类型的10000常量,赋值给long类型的变量l1
        //long l2 = 2200000000; //22个亿超出了默认int类型的范围,需要将它声明为更大的类型
        long l2 = 2200000000L;

        //4.定义float类型,要在数据后加F(大小写都行,一般大写)
        double d = 3.14; //将double类型的3.14赋值给了double类型的变量d
        //float f = 3.14; //将double类型的数据, 赋值给float类型的变量, float装不下! 报错
        //float f = (float)3.14; 强制类型转换, 不允许

        //5.可以在一行定义多个变量,数据类型必须一致(不推荐,但是最好能识别)
        int a1 = 10, a2 = 20, a3 = 30;
        double d1 = 3.0, d2 = 4.1, d3 = 5.2;
    }
}
