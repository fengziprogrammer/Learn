import java.util.Scanner;

/*
从键盘输入两个整数，求它们的和、差、商、乘积、余数
 */
public class Exer2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("请输入第一个整数：");
        int a = s.nextInt();

        System.out.print("请输入第二个整数：");
        int b = s.nextInt();

        System.out.println(a + "+" + b + "=" + (a+b));
        System.out.println(a + "-" + b + "=" + (a-b));
        System.out.println(a + "*" + b + "=" + a*b);
        System.out.println(a + "/" + b + "=" + a/b);
        System.out.println(a + "%" + b + "=" + a%b);

        s.close();
    }
}
