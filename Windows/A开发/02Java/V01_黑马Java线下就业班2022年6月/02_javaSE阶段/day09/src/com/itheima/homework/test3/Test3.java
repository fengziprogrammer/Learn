package com.itheima.homework.test3;

/*
    按以下步骤要求编写代码：

    1. 定义一个“年龄异常类”：AgeException，使其继承自RuntimeException，并添加无参、String参数的构造方法；
    2. 定义一个“性别异常类”：SexException，使其继承自RuntimeException，并添加无参、String参数的构造方法；
    3. 定义一个Student类，属性：姓名、性别、年龄。
       在性别的set方法中判断是否是男/女，如果不是则抛出：性别异常
       在年龄的set方法中判断年龄是否是15--50之间，如果不是则抛出：年龄异常
    4. 编写测试类，创建一个Student对象，并在try{}中调用setXxx()方法为对象属性赋值，在catch()中打印年龄错误。
 */
public class Test3 {
    public static void main(String[] args) {
        Student s = new Student();

        try {
            s.setAge(100);
        } catch (AgeException e) {
            System.out.println("年龄有误");
        }

        System.out.println(s);
    }
}
