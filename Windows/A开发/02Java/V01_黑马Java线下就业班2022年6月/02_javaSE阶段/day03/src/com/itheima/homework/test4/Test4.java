package com.itheima.homework.test4;

/*
    创建接口Charge，其中有一个抽象方法charge()，
    创建接口Play，其中有一个抽象方法play()，
    创建类Bus来实现接口Charge，对于Bus中的charge()，实现为输出“公共汽车：1元/张，不计公里数”。
    创建类Taxi来实现接口Charge，对于Taxi中的charge()，实现为输出“出租车：1.6元/公里，起价3公里。”

     声明类Cinema来同时实现接口Charge，Play。对于Cinema中的charge()，实现为输出`解放电影院：“30元/张，凭学生证享受半价。”
    对于Cinema中的play()。实现输出为`“正在放映电影。“

    在测试类中创建Bus，Taxi，Cinema的对象，调用方法输出结果。
 */
public class Test4 {
    public static void main(String[] args) {

        Bus bus = new Bus();
        bus.charge();

        Taxi taxi = new Taxi();
        taxi.charge();

        Cinema cinema = new Cinema();
        cinema.charge();
        cinema.play();
    }
}

// 公交车
class Bus implements Charge {

    @Override
    public void charge() {
        System.out.println("公共汽车：1元/张，不计公里数");
    }
}

// 出租车
class Taxi implements Charge {

    @Override
    public void charge() {
        System.out.println("出租车：1.6元/公里，起价3公里");
    }
}

// 电影院
class Cinema  implements Charge, Play {

    @Override
    public void charge() {
        System.out.println("30元/张，凭学生证享受半价");
    }

    @Override
    public void play() {
        System.out.println("正在放映电影");
    }
}