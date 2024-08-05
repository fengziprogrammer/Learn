package com.atguigu.n_innerclass;

public class Test01 {
    public static void main(String[] args) {
        Person person1 = new Person();
        method01(person1);//person1在内存中保存的是地址值,0x001

        System.out.println("=============================");

        /*
          method02返回的person1给了method02()
          此处的method02()接收了person1对象
          然后让person2接收了person1
          此时person2和person1的地址值一样
         */
        Person person2 = method02();//Person person2 = person1
        System.out.println(person2);
        person2.eat();
    }
    public static void method01(Person person2){//Person person2 = person1
        person2.eat();
    }

    public static Person method02(){
        Person person1 = new Person();
        System.out.println(person1);
        return person1;//person1在内存中保存的是地址值,0x002
    }
}
