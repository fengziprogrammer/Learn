package com.itheima;
/*
    冰箱类
       成员变量
            品牌 brand
            容量 capacity
            型号 type
            颜色 color
            价格 price
       成员方法
            show(); 展示对象所有属性
 */
public class Refrigerator {
    //成员变量
    private String brand;
    private int capacity;
    private String type;
    private String color;
    private double price;

    //构造方法
    public Refrigerator() {
    }

    public Refrigerator(String brand, int capacity, String type,
                        String color, double price) {
        this.brand = brand;
        this.capacity = capacity;
        this.type = type;
        this.color = color;
        this.price = price;
    }

    //成员方法
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //成员方法 show(); 展示对象所有属性
    public void show(){
        //打印格式不固定,自己随便写
        System.out.println("品牌:" + brand);
        System.out.println("容量:" + capacity);
        System.out.println("型号:" + type);
        System.out.println("颜色:" + color);
        System.out.println("价格:" + price);
    }
}
