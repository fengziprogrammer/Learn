package com.itheima.api_demo.integer_demo;
/*
    包装类 :
        基本数据类型 : byte    short   int      long    float   double      char        boolean
        引用数据类型 : Byte    Short   Integer  Long    Float   Double      Character   Boolean

    JDK5版本
        自动装箱 : 基本数据类型转换为对应的包装类      Integer i1 = 10;
        自动拆箱 : 包装类类型转换为对应基本数据类型    int i2 = i1;

    Integer类 :
        Integer 类在对象中包装了一个基本类型 int 的值。Integer 类型的对象包含一个 int 类型的字段

       自定义常量 :
            public static final int MAX_VALUE : 值为 2^31－1 的常量
            public static final int MIN_VALUE : 值为 －2^31 的常量

       构造方法 :
            1 public Integer(int value) : 把int数据封装成对应的包装类对象
            2 public Integer(String s)  : 把String数据封装成对应的包装类对象
                注意 : s中的内容必须是数字字符

       自动装箱和自动拆箱 : JDK5版本开始
            自动装箱 : 把基本数据类型数据赋值给对应的包装类类型
            自动拆箱 : 把包装类类型数据赋值给对应的基本数据类型


            自动装箱通过的是Integer类中静态方法 : public static Integer valueOf(int i)
            自动拆箱通过的是Integer类中的成员方法 : public int intValue()
 */
public class IntegerDemo {
    public static void main(String[] args) {
        // 自动装箱 : 基本数据类型转换为对应的包装类      Integer i1 = 10;
        Integer i = 10;

        // 自动拆箱 : 包装类类型转换为对应基本数据类型    int i2 = i1;
        int num = i;

        // 1 public Integer(int value) : 把int数据封装成对应的包装类对象
        Integer i2 = new Integer(20);
        // 2 public Integer(String s)  : 把String数据封装成对应的包装类对象
        Integer i3 = new Integer("3a0");
        System.out.println(i2);//20
        System.out.println(i3);//30
    }
}