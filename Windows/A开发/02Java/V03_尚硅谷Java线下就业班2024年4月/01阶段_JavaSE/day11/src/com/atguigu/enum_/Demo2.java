package com.atguigu.enum_;

public class Demo2 extends Object{

    /*
        枚举类的要求和特点
            构造
                1> 如果没有自定义构造,默认会给出一个私有的空参构造
                2> 如果自定义构造,不再给出默认的私有的空参构造
                3> 可以定义有参构造,常量对象使用有参构造进行初始化的方式为
                    常量对象(属性值)
            常量对象
                1> 常量对象必须定义在首行
                2> 常量对象默认是使用空参构造进行的初始化,需要使用有参构造进行初始化
                    常量对象(属性值)
            继承
                1> 每一个枚举类默认继承 java.lang.Enum 但是不允许手动写出
                2>  Enum 重写Object的toString() ,返回的结果是常量对象的名字,
                    如果需要返回的是属性值,需要再次重写toString()

       1.String toString(): 默认返回的是常量名（对象名），可以继续手动重写该方法！
        2.String name():返回的是常量名（对象名）
        3.int ordinal():返回常量的顺序号，默认从0开始
        4.枚举类型[] values():返回该枚举类的所有的常量对象，返回类型是当前枚举的数组类型，是一个静态方法
        5.枚举类型 valueOf(String name)：根据枚举常量对象名称获取枚举对象
     */
    public static void main(String[] args) {

        // Week week = new Week();// 构造是私有的
        Week monday1 = Week.MONDAY;
        Week monday2 = Week.MONDAY;
        System.out.println(monday1);
        System.out.println(monday2);
        System.out.println(monday1 == monday2);

        System.out.println("-----------------");
        Week monday  = Week.MONDAY;
        Week tuesday  = Week.TUESDAY;
        Week wednesday  = Week.WEDNESDAY;
        Week thursday  = Week.THURSDAY;
        Week friday  = Week.FRIDAY;
        Week saturday  = Week.SATURDAY;
        Week sunday  = Week.SUNDAY;

        System.out.println(monday.name());// 对象名
        System.out.println(tuesday.name());// 对象名
        System.out.println(wednesday.name());// 对象名
        System.out.println(thursday.name());// 对象名
        System.out.println(friday.name());// 对象名
        System.out.println(saturday.name());// 对象名
        System.out.println(sunday.name());// 对象名

        System.out.println("---------------------");
        System.out.println(monday.ordinal());
        System.out.println(tuesday.ordinal());
        System.out.println(wednesday.ordinal());
        System.out.println(thursday.ordinal());
        System.out.println(friday.ordinal());
        System.out.println(saturday.ordinal());
        System.out.println(sunday.ordinal());

        System.out.println("------------");
        Week[] arr = Week.values();
        // for (int i = 0;i<= arr.length-1;i++){}
        for (int i = 0; i < arr.length; i++) { // itar
            System.out.println(arr[i]);

        }

        System.out.println("------------");
        System.out.println(Week.valueOf("MONDAY"));


    }
}

// 枚举类
enum Week {

    MONDAY("星期一"),
    TUESDAY("星期二"),
    WEDNESDAY("星期三"),
    THURSDAY("星期四"),
    FRIDAY("星期五"),
    SATURDAY("星期六"),
    SUNDAY("星期日");

    String name;// name 属性值
    // private Week(){}

    private Week(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Week{" +
                "name='" + name + '\'' +
                '}';
    }
}
