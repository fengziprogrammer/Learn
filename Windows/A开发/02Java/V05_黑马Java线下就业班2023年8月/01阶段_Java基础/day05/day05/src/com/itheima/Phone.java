package com.itheima;

/*
    类: 对一类具有共同属性和行为事物的描述
        1.成员变量, 必须私有
        2.成员方法, 针对被私有的属性, 提供对应的get和set方法
        2.成员方法, 其他方法

    成员位置: 类中方法外

    this:
        this可以调用本类成员(成员变量,成员方法)
        方法被哪个对象调用, 方法中的this就是哪一个对象
        我们用this解决"局部变量和成员变量重名问题" -> 能理解即可, 应为get和set都是快捷键生成的!
 */
public class Phone {
    //成员变量, 必须私有
    private String brand;
    private int price;

    //构造方法
    public Phone() {
    }

    public Phone(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    //针对被私有的属性, 提供对应的get和set方法
    //右键 - Generate - Getter & Setter - 全选 - OK -> 自动生成
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    //成员方法
    public void call(String name) {
        System.out.println("给" + name + "打电话");
    }
    public void sendMessage() {
        System.out.println("发短信");
    }
}
