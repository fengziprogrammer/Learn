package com.atguigu.exer;

/*
（1）声明一个Person<T>类，包含姓名和伴侣属性，其中姓名是String类型，而伴侣的类型不确定，用T表示，
因为伴侣可以是Person，可以是Animal（例如：金刚），可以是Ghost鬼（例如：倩女幽魂），
可以是Demon妖（例如：白娘子），可以是Robot机器人（例如：剪刀手爱德华）。。。。

Person<T>类属性私有化，提供有参构造、get/set方法、重写toString方法。

（2）声明Demon妖类，包含姓名属性，属性私有化，提供有参构造、get/set方法、重写toString方法。

（3）在测试类中，

- 创建1个Person对象“你自己”，伴侣为另一个Person对象"你对象"，打印显示信息；
- 创建1个Person对象“许仙”，他伴侣为Demon对象"白娘子"，打印显示信息；
 */
public class Exercise4 {
    public static void main(String[] args) {
        //创建1个Person对象“许仙”，他伴侣为Demon对象"白娘子"，打印显示信息；
        Person<Demon> xu = new Person<>("许仙",new Demon("白娘子"));
        System.out.println(xu);

        //创建1个Person对象“你自己”，伴侣为另一个Person对象"你对象"，打印显示信息；
        Person<Person> self = new Person<>("柴老师");
        Person<Person> lover = new Person<>("老公");
        //牵手
        self.setLover(lover);
        lover.setLover(self);
        System.out.println(self);
        System.out.println(lover);

    }
}
