package com.atguigu.g_var;

public class Demo02Var {
    public static void main(String[] args) {
        String result = concat("张无忌", "张翠山", "张三丰", "金毛狮王", "白眉鹰王", "青翼蝠王", "紫衫龙王");
        System.out.println("result = " + result);
    }
    public static String concat(String...s){
        String str = "";
        for (int i = 0; i < s.length; i++) {
            str+=s[i];
        }
        return str;
    }
}
