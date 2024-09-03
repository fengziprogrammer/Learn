package com.itheima.homework.test3;
/*
    1. 编写一个接口ShapePara，要求： 接口中的方法：
        int getArea()：获得图形的面积。
        int getCircumference()：获得图形的周长

    2. 编写一个圆类Circle，要求：圆类Circle实现接口ShapePara。
        该类含有一个静态常量：
        PI： double类型，值为3.14
        该类包含有成员变量：
        radius: public修饰的double类型radius,表示圆的半径。
        x:	private修饰的double型变量x，表示圆心的横坐标。
        y:	protected修饰的double型变量y，表示圆心的纵坐标。

   **包含的方法有：**

   ```java
   Circle(double radius) 有参构造方法。以形参表中的参数初始化半径，圆心为坐标原点（x=0,y=0）。

   double getRadius()：获取半径为方法的返回值。
   void setRadius(double  radius)：利用形参表中的参数设置类Circle的radius域。

   void setCenter(double x, double  y)：利用形参表中的参数设置类Circle的圆心坐标。

   ```

请根据上述要求代码实现相关类和接口，并定创建测试类，定义一个圆对象。半径为10，求周长和面积。

```
注：
圆周长公式： 周长 = PI*2*radius
圆面积公式： 面积 = PI * radius*radius
```

**代码：**
 */
public class Test3 {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        // 获取圆的面积
        System.out.println(circle.getArea());
        // 获取圆的周长
        System.out.println(circle.getCircumference());

    }
}
