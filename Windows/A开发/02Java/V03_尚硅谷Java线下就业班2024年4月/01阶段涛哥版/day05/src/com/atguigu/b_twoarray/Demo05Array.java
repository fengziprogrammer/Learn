package com.atguigu.b_twoarray;

public class Demo05Array {
    public static void main(String[] args) {
        String[][] arr1 = {{"乔峰","虚竹","段誉"},{"张三丰","张翠山","张无忌"},{"郭靖","黄蓉"}};
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.println(arr1[i][j]);
            }
        }
    }
}
