package com.atguigu.c_if;

public class Demo11If_Switch {
    public static void main(String[] args) {
        int week = 7;
        if (week == 1) {
            System.out.println("周一");
        } else if (week == 2) {
            System.out.println("周二");
        } else if (week == 3) {
            System.out.println("周三");
        } else if (week == 4) {
            System.out.println("周四");
        } else if (week == 5) {
            System.out.println("周五");
        } else if (week == 6) {
            System.out.println("周六");
        } else if (week == 7) {
            System.out.println("周日");
        } else {
            System.out.println("输入有误!");
        }

        switch (week) {
            case 1:
                System.out.println("周一");
                break;
            case 2:
                System.out.println("周二");
                break;
            case 3:
                System.out.println("周三");
                break;
            case 4:
                System.out.println("周四");
                break;
            case 5:
                System.out.println("周五");
                break;
            case 6:
                System.out.println("周六");
                break;
            case 7:
                System.out.println("周日");
                break;
            default:
                System.out.println("输入有误");
                break;
        }
    }
}
