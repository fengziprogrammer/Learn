package com.itheima.innerclass_demo.member_innerclass;

public class Test {
    public static void main(String[] args) {
        // 创建成员内部类的对象 : 外部类名.内部类名 对象名= new  外部类构造方法(...).new 内部类的构造方法(...);
        Person.Heart heart = new Person().new Heart();
        heart.beats();

        // 静态成员内部类创建对象的方式
        // Person.Heart heart = new Person.Heart();
    }
}

//class Person {
//    static int num = 30;
//
//    // 想拿到 num = 20
//    public void show(){
//        Heart heart = new Heart();
//        System.out.println(heart.num);// 20
//    }
//
//    // 静态的成员内部类
//    static class Heart {
//        private int rate;
//        int num = 20;
//        public void beats() {
//            int num = 10;
//            System.out.println("咚咚咚!");
//            System.out.println(num);// 10
//            System.out.println(this.num);// 20
//            System.out.println(Person.num);// 30
//        }
//    }
//}

// 外部类
class Person {
    int num = 30;

    // 想拿到 num = 20
    public void show() {
        Heart heart = new Heart();
        System.out.println(heart.num);// 20
    }

    // 心脏类
    class Heart {
        private int rate;
        int num = 20;

        public void beats() {
            int num = 10;
            System.out.println("咚咚咚!");
            System.out.println(num);// 10
            System.out.println(this.num);// 20
            System.out.println(Person.this.num);// 30
        }
    }
}


