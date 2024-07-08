public class LoopExer7 {
    public static void main(String[] args) {
        //输出菱形
        //上半部分：5行
        for (int i = 1; i <=5 ; i++) {
            //在换行之前，需要输出一些空格，然后输出一些*
            /*
            当i=1，空格4个，j=1,2,3,4
            当i=2，空格3个，j=1,2,3
            当i=3，空格2个，j=1,2
            当i=4，空格1个，j=1
            j<=5-i
             */
            for (int j = 1; j <= 5-i ; j++) {
                System.out.print("  ");
            }

            /*
            当i=1，1个*， j=1
            当i=2，3个*， j=1,2,3
            当i=3，5个*， j=1,2,3,4,5
            当i=4，7个*， j=1,2,3,4,5,6,7
            当i=5，9个*， j=1,2,3,4,5,6,7,8,9
                    j<=2*i-1

             */
            for (int j = 1; j <=2*i-1 ; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
        //下半部分：4行
        for (int i = 1; i <=4 ; i++) {
            //在换行之前，需要输出一些空格，然后输出一些*
            /*
            当i=1，空格1个，j=1
            当i=2，空格2个，j=1,2
            当i=3，空格3个，j=1,2,3
            当i=4，空格4个，j=1,2,3,4
            j<=i
             */
            for (int j = 1; j <= i ; j++) {
                System.out.print("  ");
            }

            /*
            当i=1，7个*， j=1,2,3,4,5,6,7
            当i=2，5个*， j=1,2,3,4,5
            当i=3，3个*， j=1,2,3
            当i=4，1个*， j=1
                j<=9-2*i
             */
            for (int j = 1; j <=9-2*i ; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
