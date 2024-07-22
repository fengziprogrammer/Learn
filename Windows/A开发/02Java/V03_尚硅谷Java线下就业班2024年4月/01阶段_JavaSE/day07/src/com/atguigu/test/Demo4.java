package com.atguigu.test;

public class Demo4 {

    /*
    创建一个类,使用一个类
        创建格式
            类名 对象名= new 类名();
         使用格式
            对象名.属性名/对象名.方法名();

           类的组成
            属性,功能,构造器,代码块,内部类

         实例的初始化过程会使用到构造器
         构造器(构造方法)
            作用: 构建本类对象,可以对属性赋值
            格式
                [权限修饰符] 类名(){}
                注意:构造器没有返回值类型的组成  连void也没有
            访问时机
                每创建一次对象,就会访问一次

            特点
                1> 没有定义构造时,系统会自动给出一个空参构造
                2> 如果自定义了构造,系统将不再给出空参构造
                3> 每创建一次对象,就会访问一次构造
     */
    public static void main(String[] args) {

        Phone phone = new Phone();
        phone.brand = "8848牌";
        phone.price = 8848.88;
        System.out.println(phone.brand);//"8848牌"
        System.out.println(phone.price);

        phone.call();
        phone.sendMessage();

        System.out.println("--------------");
        Phone phone2 = new Phone();
        phone2.brand = "锤子";
        System.out.println(phone2.price);
        System.out.println(phone2.brand);// "锤子"

        System.out.println(phone.brand);//"8848牌"  ?
        System.out.println(phone.price);
        phone2.call();
        phone2.sendMessage();
        System.out.println("-------------");

        Phone phone3 = phone2;
        phone3.brand = "菠萝";
        System.out.println(phone3.brand);
        System.out.println(phone2.brand);//?"锤子"
        System.out.println("------------");

        Phone phone4 = new Phone(88.8,"小天才电话儿童手表");
        System.out.println(phone4.brand);
        System.out.println(phone4.price);
        System.out.println(phone3.brand);



    }
}

/*
    定义一个手机类
        属性:价格,品牌
        功能:打电话,发信息
*/
class Phone{

    // 属性:价格,品牌  成员变量 有默认的初始值
    double price ;
    String brand ;

    public Phone(){
        System.out.println("-----------空参构造");
    }

    public Phone(double a,String b ){
        // 对属性进行赋值
        price = a;
        brand = b;
        System.out.println("-------------有参构造");

    }

    // 功能:打电话,发信息
    public void call(){
        System.out.println("-------call");
    }

    public void sendMessage(){
        System.out.println("-------sendMessage");
    }
}



