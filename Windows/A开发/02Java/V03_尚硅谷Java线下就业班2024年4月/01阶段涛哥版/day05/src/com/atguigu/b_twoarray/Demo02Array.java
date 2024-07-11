package com.atguigu.b_twoarray;

public class Demo02Array {
    public static void main(String[] args) {
        String[][] arr1 = {{"乔峰","虚竹","段誉"},{"张三丰","张翠山","张无忌"},{"郭靖","黄蓉"}};
        System.out.println(arr1.length);
        //获取每一个一维数组长度
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i].length);
        }
    }
}
