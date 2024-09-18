package com.itheima.homework;

import java.util.Scanner;

/*
    请定义学员类，有以下成员属性：

​       姓名：String类型
​       年龄：int
​       身高：double
​       婚否：boolean
​       性别：char

    请从控制 台接收以下数据：
    ​       姓名：王哈哈
    ​       年龄：24
    ​       身高：1.82
    ​       婚否：false
    ​       性别：男
    以上数据要求全部使用String类型接收
    请创建“学员对象”，并将所有数据转换后，存储到这个对象中，最后打印此对象的所有属性。
 */
public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入名字:");
        String name = sc.nextLine();
        System.out.println("请输入年龄:");
        String age = sc.nextLine();
        System.out.println("请输入身高:");
        String height = sc.nextLine();
        System.out.println("请输入婚否:");
        String hunFou = sc.nextLine();// 否
        System.out.println("请输入性别:");
        String sex = sc.nextLine(); // "男"

        // 空参构造 + set方法
        Student s = new Student();
        s.setName(name);
        s.setAge(Integer.parseInt(age));
        s.setHeight(Double.parseDouble(height));
        s.setHun(Boolean.parseBoolean(hunFou));
        s.setSex(sex.charAt(0));

        System.out.println(s);// 因为Student重写了toString , 打印对象名打印的是内容



    }
}
