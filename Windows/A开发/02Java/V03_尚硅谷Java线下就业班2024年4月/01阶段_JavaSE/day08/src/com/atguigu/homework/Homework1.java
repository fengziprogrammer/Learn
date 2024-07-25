package com.atguigu.homework;

public class Homework1 {

    /*
       把大象(Elephant)放入冰箱(IceBox)分几步,如何使用Java代码实现
       分析
        - 把大象关冰箱分几步?
            三步 :1 打开冰箱, 2.把大象放进去 3.关闭冰箱
        - 这个过程涉及到几个事物?
            大象 (属性:姓名,年龄  功能: 吃饭 睡觉)
            冰箱(属性: 品牌,价格 功能:打开 ,盛放(大象的类型  变量) 关闭)

            构造
     */
    public static void main(String[] args) {

        // 把大象(Elephant)放入冰箱(IceBox)分几步
        Elephant elephant1 = new Elephant();
        Elephant elephant2 = new Elephant();
        elephant1.name = "小象";
        elephant1.age = 1;

        IceBox ib = new IceBox();
        ib.brand = "海尔兄弟";
        ib.price = 10000;
        ib.on();
        ib.putElephant(elephant1);
        ib.putElephant(elephant2);
        ib.putElephant(new Elephant());
        ib.putElephant(new Elephant());
        ib.close();

        System.out.println("-----------");
        IceBox ib2 = new IceBox("格力",20000);
        ib2.putElephant(elephant1);
        System.out.println(ib2.brand + "..." + ib2.price);

    }
}

class Elephant{
    // 属性:姓名,年龄  功能: 吃饭 睡觉
    String name;
    int age;

    public void eat(){
        System.out.println("---大象吃饭");
    }

    public void sleep(){
        System.out.println("---大象睡觉");
    }

}

class IceBox{
    // 冰箱(属性: 品牌,价格 功能:打开 ,盛放(大象的类型  变量) 关闭)
    String brand;
    double price;

    // 空参 有参构造
    public IceBox(){
        System.out.println("-------------IceBox空参构造");
    }

    public IceBox(String a,double b){
        // 给属性赋值
        brand = a;
        price = b;
        System.out.println("-------------IceBox有参构造");
    }

    public void on(){
        System.out.println("----打开冰箱");
    }

    public void putElephant(Elephant elephant){
        System.out.println("------装大象,该大象的姓名为" +
                elephant.name + ",年龄为" + elephant.age);
    }

    public void close(){
        System.out.println("------关闭冰箱");
    }
}




