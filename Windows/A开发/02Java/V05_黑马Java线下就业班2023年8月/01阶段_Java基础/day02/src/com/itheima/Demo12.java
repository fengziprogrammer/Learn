package com.itheima;

/*
    需求: 根据月份打印对应季节
        12 1 2 冬季
        3 4 5 春季
        6 7 8 夏季
        9 10 11 秋季

    使用case穿透
        当case中省略break不写,就会开启穿透
        后续case就不具备匹配效果,执行遇到的所有语句体
        直到遇到下一个break,或者switch执行完毕停止
 */
public class Demo12 {
    public static void main(String[] args) {
        //定义变量
        int month = 3;
        month = 10;
        month = -1;

        //4. 使用JDK14的新特性优化switch
        switch (month) {
            case 12, 1, 2:
                System.out.println("冬季");
                break;
            case 3, 4, 5:
                System.out.println("春季");
                break;
            case 6, 7, 8:
                System.out.println("夏季");
                break;
            case 9, 10, 11:
                System.out.println("秋季");
                break;
            default:
                System.out.println("你输入的月份有误!");
                break;
        }
        //3. 使用case穿透优化switch
       /* switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("冬季");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
                break;
            default: //类似else备胎的作用
                System.out.println("你输入的月份有误!");
                break;
        }*/
        //2. 使用switch完成
       /*
       switch (month) {
            case 12:
                System.out.println("冬季");
                break;
            case 1:
                System.out.println("冬季");
                break;
            case 2:
                System.out.println("冬季");
                break;

            case 3:
                System.out.println("春季");
                break;
            case 4:
                System.out.println("春季");
                break;
            case 5:
                System.out.println("春季");
                break;

            case 6:
                System.out.println("夏季");
                break;
            case 7:
                System.out.println("夏季");
                break;
            case 8:
                System.out.println("夏季");
                break;

            case 9:
                System.out.println("秋季");
                break;
            case 10:
                System.out.println("秋季");
                break;
            case 11:
                System.out.println("秋季");
                break;
            default: //类似else备胎的作用
                System.out.println("你输入的月份有误!");
                break;
        }
        */
        //1. if实现
       /*
        if (month == 12 || month == 1 || month == 2) {
            System.out.println("冬季");
        } else if (month == 3 || month == 4 || month == 5) {
            System.out.println("春季");
        } else if (month == 6 || month == 7 || month == 8) {
            System.out.println("春季");
        } else if (month == 9 || month == 10 || month == 11) {
            System.out.println("春季");
        } else {
            System.out.println("你输入的月份有误!");
        }
        */

    }
}
