package com.atguigu.e_newjdk;

public class Demo04Switch {
    public static void main(String[] args) {
        //method01();
        //method02();
        //method03();
        //method04();
        method05();
    }

    /**
     * jdk13之后:yield返回switch中的返回值
     */
    private static void method05() {
        int month = 3;
        var season = switch (month) {
            case 3, 4, 5 -> {
                yield "春季";
            }
            case 6, 7, 8 -> {
                yield "夏季";
            }

            case 9, 10, 11->{
                yield "秋季";
            }

            case 12, 1, 2->{
                yield "冬季";
            }

            default->{
                yield "有误";
            }
        };
        System.out.println(season);
    }

    /**
     * jdk13之前:想要将switch中某个case的结果返回
     * 我们需要在switch外面定义一个变量,然后将case对应的结果赋值给此变量
     */
    private static void method04() {
        int month = 3;
        String season = "";
        switch (month) {
            case 3, 4, 5:
                season = "春季";
                break;
            case 6, 7, 8:
                season = "夏季";
                break;
            case 9, 10, 11:
                season = "秋季";
                break;
            case 12, 1, 2:
                season = "冬季";
                break;
            default:
                System.out.println("月份输入有误！");
        }

        System.out.println(season);
    }

    /**
     * jdk12之后:switch
     * 将:改成 ->
     * <p>
     * 可以省略break,但是不会出现穿透现象
     */
    private static void method03() {
        int month = 3;
        switch (month) {
            case 3, 4, 5 -> System.out.println("春季");
            //break;
            case 6, 7, 8 -> System.out.println("夏季");
            // break;
            case 9, 10, 11 -> System.out.println("秋季");
            //break;
            case 12, 1, 2 -> System.out.println("冬季");
            // break;
            default -> System.out.println("月份输入有误！");
        }
    }

    /**
     * jdk12之后:switch写法
     */
    private static void method02() {
        int month = 3;
        switch (month) {
            case 3, 4, 5:
                System.out.println("春季");
                break;
            case 6, 7, 8:
                System.out.println("夏季");
                break;
            case 9, 10, 11:
                System.out.println("秋季");
                break;
            case 12, 1, 2:
                System.out.println("冬季");
                break;
            default:
                System.out.println("月份输入有误！");
        }
    }

    /**
     * jdk12之前:switch写法
     */
    private static void method01() {
        int month = 3;
        switch (month) {
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
            case 12:
            case 1:
            case 2:
                System.out.println("冬季");
                break;
            default:
                System.out.println("月份输入有误！");
        }
    }
}
