import java.util.Scanner;

/*
2、从键盘输入年份，循环输出这年12个月每个月的总天数。
输出格式如下：
1月->31天
2月->平年28天，闰年29天
3月->31天
...
 */
public class Exam2 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.print("请输入年份：");
        int year = input.nextInt();

        for(int month = 1; month <= 12; month++){
            if(month == 1 || month == 3 || month == 5 || month == 7 || month==8 || month==10 || month==12){
                System.out.println(month + "：31天");
            }else if(month==4  || month == 6 || month==9 || month==11){
                System.out.println(month + "：30天");
            }else{
                System.out.println(month + "："+ ( (year%4==0 && year%100!=0 || year%400==0) ? "29" : "28" ) +"天");
            }
        }

        input.close();
    }
}
