package com.itcast;

/*
    类: 对一类具有共同属性和行为事物的描述
    对象: 根据类创建出来的实体

    手机类
 */
public class Phone {
    //成员变量: 必须使用private私有
    private String brand; //品牌
    private double price; //价格

    //构造方法: 提供两种
    public Phone(){

    }

    public Phone(String brand,double price){
        this.brand = brand;
        this.price = price;
    }

    //成员方法: 针对私有的属性, 必须提供对应的get和set方法
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    //成员方法: 其他方法根据需求走
    public void call(String name) {
        System.out.println("给" + name + "打电话");
    }
}
