package com.atguigu.inherited;

public class Phone {
    protected String name;
    protected double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void sendMessage(){
        System.out.println("发短信");
    }
    public void call(){
        System.out.println("打电话");
    }
    public void showNumber(){
        System.out.println("显示来电号码");
    }

    protected Person getOwner(){
        return new Person();//具体功能省略了
    }
}
