package com.atguigu.array;

public class Circle {
    double radius;

    double area(){
        return Math.PI * radius * radius;
    }

    double perimeter(){
        return 2 * Math.PI * radius;
    }

    String getInfo(){
        return "半径：" + radius +
                "，面积：" + area()
                +"，周长：" +perimeter();
    }
}
