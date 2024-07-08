import java.util.Scanner;

/*
10、赌数游戏：随机产生3个1-6的整数，
如果三个数相等，那么称为“豹子”，
如果三个数之和大于9，称为“大”，
如果三个数之和小于等于9，称为“小”，
用户从键盘输入押的是“豹子”、“大”、“小”，
并判断是否猜对了
提示：随机数  Math.random()产生 [0,1)范围内的小数
 */
public class ExpandExer10 {
    public static void main(String[] args) {
        //随机产生3个1-6的整数
        /*
        Math.random() -> [0,1)的小数
        Math.random() * 6 -> [0,6)的小数
        Math.random() * 6 + 1 -> [1,7)的小数
        (int)( Math.random() * 6 + 1) -> [1,7)的整数，[1,6]的整数
         */
        int a = (int)(Math.random() * 6 + 1);
        int b = (int)(Math.random() * 6 + 1);
        int c = (int)(Math.random() * 6 + 1);
/*        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);*/

        Scanner input = new Scanner(System.in);

        System.out.print("请押宝（豹子、大、小）：");
        String guess = input.next();

        boolean flag = false;
        switch (guess){
            case "豹子":
                flag = a == b && b == c;
                /*
                这句代码要被执行，只有输入的是豹子。
                flag的结果只有2种，
                当 a=b=c时，为true，否则为false
                 */
                break;
            case "大":
                flag = a + b + c > 9;
                break;
                /*
                这句代码要被执行，只有输入的是大。
                flag的结果只有2种，
                当 a + b + c>9时，为true，否则为false
                 */
            case "小":
                flag = a + b + c<=9;
                break;
                /*
                这句代码要被执行，只有输入的是大。
                flag的结果只有2种，
                当 a + b + c<=9时，为true，否则为false
                 */
            /*default:
                flag = false;
                System.out.println("输入错误");*/
        }

        System.out.println(flag ? "猜对了" : "猜错了");
        input.close();
    }
}
