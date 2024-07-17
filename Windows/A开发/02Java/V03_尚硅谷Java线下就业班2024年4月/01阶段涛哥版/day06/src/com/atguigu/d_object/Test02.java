package com.atguigu.d_object;

public class Test02 {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.brand = "华为";
        phone.color = "曜石黑";
        phone.price = 8999;

        System.out.println(phone.brand+"..."+phone.color+"..."+phone.price);

        phone.call("曼曼");

        String mess = phone.message("曼曼");
        System.out.println("mess = " + mess);
    }
}
