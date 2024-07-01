package com.itheima;

/*
    案例: 数字相加 (类型转换)

    类型转换分为
        1.隐式转换: 小->大 计算机自动完成的
        2.强制转换: 大->小 手动书写格式,不推荐

    byte -> short(char)参与运算 会自动提升为int
        int -> long -> float -> double
 */
public class Demo02 {
    public static void main(String[] args) {
        //1.隐式转换 小->大
        int a = 10;
        double b = 12.3;
        System.out.println(a + b); //22.3 a先提升为double类型,在做运算

        int ii = (int)(a + b);
        System.out.println(ii); //22 如果使用double想转为int,小数点后面就丢失了

        double num = 100; //100默认是int类型,赋值给double,从小到大,属于隐式转换
        System.out.println(num);

        //2.强制转换 大->小
        //格式: 数据类型 变量名 = (目标类型)变量值;
        int i = (int) 3.14;
        System.out.println(i); //3 强转可能会造成数据精度的丢失,不建议!
    }
}
