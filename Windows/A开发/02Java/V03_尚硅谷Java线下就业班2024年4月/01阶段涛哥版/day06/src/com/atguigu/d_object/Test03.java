package com.atguigu.d_object;

public class Test03 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.name = "狗";
        animal.color = "黑白";
        System.out.println(animal.name+"..."+animal.color);

        System.out.println("========================");

        animal.eat("狗","屎");
        animal.jiao("狗");
    }
}
