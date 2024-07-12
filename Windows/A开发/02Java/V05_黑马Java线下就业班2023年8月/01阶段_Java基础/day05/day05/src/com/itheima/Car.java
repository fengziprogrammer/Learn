package com.itheima;
/*
    构造方法:
        本质作用是创建对象
        构造方法在new对象的时候自动调用的, 而且每new一次, 自动调用一次
        我们可以借助构造方法的加载的时机, 完成对象的赋值

    格式: 方法名和类名一致
        public 方法名(){

        }

    注意事项:
        如果我们不提供构造, 系统会提供一个默认的空参构造
        如果我们提供了带参构造, 那么系统就不会提供空参构造了
        结论: 两种构造我们都手动提供
 */

public class Car {
    private String brand;
    private int price;

    public Car(){

    }

    public Car(String brand, int price){
        this.brand = brand;
        this.price = price;
    }

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
}
