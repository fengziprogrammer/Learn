package com.atguigu.genericity;

public class Demo10 {
    public static void main(String[] args) {


        // 再创建对象时,确认泛型的数据类型
        new BookImpl1<String>().method("书中自有黄金屋");
        new BookImpl1<Boolean>().method(true);

        // 具体的实现类,不需要写泛型
        new BookImpl2().method(333);
        // new BookImpl2().method("aa");

    }
}

interface Book<E>{
    void method(E e);
}

// 1>实现类没有确定具体的数据类型
class BookImpl1<E> implements Book<E>{

    @Override
    public void method(E e) {
        System.out.println(e);
    }
}

// 2>实现类确定了具体的数据类型
class BookImpl2 implements Book<Integer>{

    @Override
    public void method(Integer integer) {
        System.out.println(integer);
    }
}

