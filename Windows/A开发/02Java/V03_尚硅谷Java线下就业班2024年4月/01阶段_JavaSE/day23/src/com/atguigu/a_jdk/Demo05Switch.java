package com.atguigu.a_jdk;

public class Demo05Switch {
    public static void main(String[] args) {
        //method01();
        //method02();
        //method03();
        //method04();
        method05();
    }

    /**
     * jdk13之后,想要获取switch中的返回值
     * 直接用yield
     */
    private static void method05() {
        int month = 1;
        String season = switch (month) {
            case 12, 1, 2->{
                yield "冬季";
            }
            case 3, 4, 5->{
               yield "春季" ;
            }

            case 6, 7, 8->{
                yield "夏季" ;
            }

            case 9, 10, 11->{
                yield "秋季" ;
            }

            default -> {
                yield "有毛病";
            }
        };
        System.out.println("season = " + season);
    }

    /**
     * jdk13之前,如果想要switch的返回值
     * 我们需要在switch外面定义变量
     * 在switch里面为其赋值
     */
    private static void method04() {
        int month = 1;
        String season = "";
        switch (month) {
            case 12, 1, 2:
                season = "冬季";
                break;
            case 3, 4, 5:
                season = "春季";
                break;
            case 6, 7, 8:
                season = "夏季";
                break;
            case 9, 10, 11:
                season = "秋季";
                break;
        }
        System.out.println("season = " + season);
    }

    /**
     * jdk12之后可以将:改成 ->
     * 如果将:改成-> 不写break也不会穿透
     */
    private static void method03() {
        int month = 1;
        switch (month) {
            case 12, 1, 2->
                System.out.println("冬季");
                //break;
            case 3, 4, 5->
                System.out.println("春季");
                //break;
            case 6, 7, 8->
                System.out.println("夏天");
                //break;
            case 9, 10, 11->
                System.out.println("秋季");
                //break;
        }
    }

    /**
     * jdk12之后
     * 如果用: 不写break依然会穿透
     */
    private static void method02() {
        int month = 1;
        switch (month) {
            case 12, 1, 2:
                System.out.println("冬季");
                break;
            case 3, 4, 5:
                System.out.println("春季");
                break;
            case 6, 7, 8:
                System.out.println("夏天");
                break;
            case 9, 10, 11:
                System.out.println("秋季");
                break;
        }
    }

    /**
     * jdk12之前
     */
    private static void method01() {
        int month = 5;
        switch (month) {
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
                System.out.println("夏天");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
                break;
        }
    }
}
