import java.util.Scanner;

public class Exam3 {
    public static void main(String[] args) {
        /*
        3、从键盘输入整数，判断是正数还是负数，输入0结束。
        并统计正数和负数的个数。（0既不是正数也不是负数）
         */
        Scanner input = new Scanner(System.in);

        int positive = 0;
        int negative = 0;
        while(true){
            System.out.print("请输入整数：");
            int num = input.nextInt();

            if(num == 0){
                break;
            }else if(num > 0){
                positive++;
            }else {
                negative++;
            }
        }

        System.out.println("正数：" + positive);
        System.out.println("负数：" + negative);

        input.close();
    }
}
