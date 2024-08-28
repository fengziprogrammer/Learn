package com.itheima.packing_class;

public class Test3 {
    public static void main(String[] args) {
        //记住：java语言为了数据存储的优化，提供了：基础常量池（采用一种模式：享元模式）

        //我们学习的知识理解：new 就是开辟一个新空间
        Integer num1 = new Integer(100);
        Integer num2 = new Integer(100);
        System.out.println(num1 == num2);//比较地址值

        //Integer属于引用类型，num3变量中存储的是引用类型的地址值
        Integer num3 = 123; //先去常量池中找有没有123这个数字存在，有就直接使用（使用常量池中的地址）
        Integer num4 = 123;
        System.out.println(num3 == num4);//比较地址值

    }
}
