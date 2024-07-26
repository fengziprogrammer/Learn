package com.atguigu.b_objectarray;

public class Test01 {
    public static void main(String[] args) {
        /*
          定义一个存储int型数据的数组: int[]
          定义一个存储double型数据的数组: double[]
          定义一个存储char型数据的数组: char[]
          定义一个存储字符串型数据的数组: String[]
          定义一个存储Person类型对象的数组:  Person[]

         */

        Person[] arr = new Person[3];
        Person p1 = new Person("柳岩", 36);
        Person p2 = new Person("曼曼", 46);
        Person p3 = new Person("涛哥", 18);
        //将三个对象存储到数组中
        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;

        /*
          i = 0,arr[0] = p1   将p1的地址值赋值给了p,那么p就代表p1对象
          i = 1,arr[1] = p2   将p2的地址值赋值给了p,那么p就代表p2对象
          i = 2,arr[2] = p3   将p3的地址值赋值给了p,那么p就代表p3对象
         */
        for (int i = 0; i < arr.length; i++) {
            Person p = arr[i];
            System.out.println(p.getName()+"..."+p.getAge());
        }
    }
}
