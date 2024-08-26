package com.atguigu.exer.exer2;

/*
4、在测试类中，分别创建两个实现类的对象，调用对应的方法。通过接口名调用静态方法
 */
public class Exer2 {
    public static void main(String[] args) {
/*        Animal animal = new Animal();
        animal.eat();
        animal.breathe();
        animal.sleep();

        Plant plant = new Plant();
        plant.breathe();
        plant.eat();
        plant.sleep();*/

        LiveAble[] arr = new LiveAble[2];
        arr[0] = new Animal();
        arr[1] =  new Plant();
        //foreach循环的快捷键iter
        for (LiveAble liveAble : arr) {
            liveAble.eat();
            liveAble.breathe();
            liveAble.sleep();
        }

        LiveAble.drink();
    }
}
