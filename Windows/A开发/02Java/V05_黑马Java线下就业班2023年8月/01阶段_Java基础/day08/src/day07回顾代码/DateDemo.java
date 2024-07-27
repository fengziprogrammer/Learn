package day07回顾代码;
/*
    Date
        创建对象
            空参构造: 封装了系统时间
            带参构造: 指定一个毫秒值,封装从时间原点经过指定毫秒值的一个时刻
        常用方法
            getTime
 */

import java.util.Date;
public class DateDemo {
    public static void main(String[] args) {
        //空参构造: 封装了系统时间
        Date d1 = new Date();
        System.out.println(d1); //Thu Oct 13 09:01:40 CST 2022 -> 不好看!我们学习技术将它格式化

        //带参构造: 指定一个毫秒值,封装从时间原点经过指定毫秒值的一个时刻
        Date d2 = new Date(1000 * 60 * 60 * 24); //一天的毫秒
        System.out.println(d2); //Fri Jan 02 00:00:00 CST 1970

        //当前系统时间毫秒值
        System.out.println(new Date().getTime()); //1665623130145
        //System类的方法也可以获取当前系统时间毫秒值
        System.out.println(System.currentTimeMillis()); //1665623130145
    }
}
