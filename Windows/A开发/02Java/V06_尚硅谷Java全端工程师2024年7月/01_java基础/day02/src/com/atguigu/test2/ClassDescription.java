package com.atguigu.test2;

/**
 * @author WHD
 * @description TODO
 * @date 2023/7/26 14:09
 *  同一个源文件中可以定义多个类。
 *  编译后，每个类都会生成独立的 .class文件。
 *  一个类中，只能有一个main方法，每个类都可以有自己的main方法
 *  public修饰的类称为公开类，要求类名必须与文件名称完全相同，包括大小写。
 *  一个源文件中，只能有一个公开类。
 */
public class ClassDescription {
    public static void main(String[] args) {
        System.out.println("TestClassDescription print");
    }
}

class B{
    public static void main(String[] args) {
        System.out.println("B class print");
    }
}

class C{
    public static void main(String[] args) {
        System.out.println("C class print");
    }
}