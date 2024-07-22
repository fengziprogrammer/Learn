package com.atguigu.g_var;

public class Demo03Var {
    public static void main(String[] args) {
        String result = concat("-", "张无忌", "张翠山", "张三丰", "金毛狮王", "白眉鹰王", "青翼蝠王", "紫衫龙王");
        System.out.println("result = " + result);
    }

    public static String concat(String s, String... arr) {
        String str = "";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                str += arr[i];
            } else {
                str += arr[i] + s;
            }
        }
        return str;
    }
}
