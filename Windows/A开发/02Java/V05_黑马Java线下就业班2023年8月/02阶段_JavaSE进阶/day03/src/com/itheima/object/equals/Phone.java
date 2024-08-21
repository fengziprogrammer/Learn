package com.itheima.object.equals;

import java.util.Objects;

public class Phone {
    private String brand;
    private int price;

    public Phone() {
    }

    public Phone(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        //判断：当前对象的地址值 和 传递对象的地址值 相同
        if (this == o) {
            //两个对象地址值相同 ： 说明是同一个对象
            return true;
        }
        //判断： 传递过来的对象是null   或者   当前对象的类型和传递对象的类型 不匹配
        if (o == null || getClass() != o.getClass()) {
            //当要比较的对象是null时， 就不需要比较， 直接返回：false
            //当比较的两个对象类型不一样， 不需要比较， 直接返回：false
            return false;
        }

        //向下转型
        Phone phone = (Phone) o;
        //     基本数据类型比较                 使用Objects工具类中的equals方法，比较两个字符串是否相同
        return this.price == phone.price &&  Objects.equals(this.brand, phone.brand);

        //                                   使用String类中的equals方法， 比较两个字符串是否相同
      //  return this.price == phone.price &&  this.brand.equals(phone.brand);

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
