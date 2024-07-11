import java.util.Scanner;

/*
已知平年12个月每个月的总天数是{ 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30,31}，
从键盘输入年，月，日后，计算这一天是这一年的第几天。提示：考虑闰年
 */
public class ArrayExer4 {
    public static void main(String[] args) {
        int[] totalDaysOfMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30,31};

        Scanner input = new Scanner(System.in);

        System.out.print("请输入年：");
        int year = input.nextInt();

        System.out.print("请输入月：");
        int month = input.nextInt();

        System.out.print("请输入日：");
        int day = input.nextInt();


        //如果year是闰年，把2月份总天数修改为29
        if(year%4==0 && year%100!=0 || year%400==0){
            totalDaysOfMonth[1] = 29;
        }

        int days = day;//累加了第month月的day天
        //累加[1,month-1]月的总天数
        for(int i=1; i<month; i++){
            days += totalDaysOfMonth[i-1];
        }
        System.out.println("这一天是这一年的第" + days +"天");

        input.close();
    }
}
