package com.itheima.extends_contructor;

/*
   1 子类中所有的构造方法默认都会访问父类中无参的构造方法 , 为什么？
        当对子类进行初始化时 , 可能会用到父类的数据 , 所以说当给子类就进行初始化时
        会先执行父类的空参构造方法 , 给父类的数据进行初始化
        简单理解 : 当创建子类对象前 , 一定会先对父类的数据初始化

    2  为什么父类的空参构造方法会执行 ?
        每一个构造方法第一行有效数据的位置都会有一个super() , 去访问父类的空参数构造方法

    3 如果父类中没有空参构造方法，只有带参构造方法，会出现什么现象呢 ？
        1) 子类访问父类的有参构造
        2) 子类构造方法中提供this(,,,)访问自己的有参构造
 */
public class Test1 {
    public static void main(String[] args) {
        // Zi z = new Zi();
        Zi z = new Zi(10);
    }
}

class Fu {
    int num = 10;
//    public Fu() {
//        System.out.println("父类中的空参构造方法");
//    }

    public Fu(int a) {
        System.out.println("父类中的有参构造方法");
    }
}

class Zi extends Fu {
    public Zi() {
        // 构造方法的默认第一行有效语句, 都存在一个super() , 去访问父类的空参数构造
        // super();
        // this(10);
        super(10);
        System.out.println(num);
        System.out.println("子类中的空参构造方法");
    }

    public Zi(int a) {
        super(10);
        System.out.println("子类中的有参构造方法");
    }
}