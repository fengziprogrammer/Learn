package com.atguigu.test;

public class Demo6 {

    /*
        对象数组(与之前学的数组定义完全一样,只不过存储的是自定义类型而已)
        定义格式
            动态初始化
                数据类型[] 数组名 = new  数据类型[len];
            静态初始化(简写)
                数据类型[] 数组名 = {值1,值2,值3};

            数组元素未初始化前,是对应数据类型的默认值
            引用数据类型的默认值是 null,谨防空指针异常 访问了不存在的索引

            空指针异常 引发的条件  是访问了并不存在的引用地址值
     */
    public static void main(String[] args) {

        int [] arr1 = {1,2,3};
        String [] arr2 = {"a","b"};

        //存储学生的类型
        Student [] arr3 = new Student[3];
        System.out.println(arr3[0]);//null

        // 访问学生对象的姓名属性  对象名.属性名
        // System.out.println(arr3[0].name);//张三
        arr3[0] = new Student();
        System.out.println(arr3[0].name);//
        //System.out.println(arr3[1].age);//null

        arr3 = null;
        System.out.println(arr3[2]);


    }
}


