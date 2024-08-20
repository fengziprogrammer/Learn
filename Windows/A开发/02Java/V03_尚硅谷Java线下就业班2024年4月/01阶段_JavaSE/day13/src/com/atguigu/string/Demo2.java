package com.atguigu.string;

public class Demo2 {

    /*
    需求:
    给定一串字符串,校验其是否是 qq号码
        1:要求必须是5-15位数字
        2:0不能开头
        3:必须都是数字

        "0123"
     */
    public static void main(String[] args) {

        System.out.println(checkQQ("0123"));
        System.out.println(checkQQ("123456"));//
        System.out.println(checkQQ("123fgsdfg"));
        System.out.println(checkQQ("1234859437549"));//
        System.out.println(checkQQ("12348594375492345"));

        System.out.println("-----------------");
        String regex = "[1-9]\\d{4,14}";
        System.out.println("0123".matches(regex));
        System.out.println("123456".matches(regex));
        System.out.println("123fgsdfg".matches(regex));
        System.out.println("1234859437549".matches(regex));
        System.out.println("12348594375492345".matches(regex));

    }

     /*
    需求：校验qq号码.
         1:要求必须是5-15位数字
         2:0不能开头
         3:必须都是数字
     明确返回值类型boolean
     明确参数列表String qq

     */

    public static boolean checkQQ(String qq) {

        boolean flag = true;// 声明一个变量,默认为true ,代表校验结果

        if(qq.length() >= 5 && qq.length() <= 15){
            if(!qq.startsWith("0")){
                char[] arr = qq.toCharArray();
                for (int i = 0; i < arr.length; i++) {
                    char ch = arr[i];
                    if(!(ch >= '0' && ch <= '9')){
                        flag = false;
                        break;
                    }
                }
            }else{
                flag = false;
            }
        }else{
            flag = false;
        }

        return flag;

    }
}
