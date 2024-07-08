import java.util.Scanner;

public class LoopExer4 {
    public static void main(String[] args) {
        //4、输入两个正整数m和n，求其最大公约数和最小公倍数
        Scanner input = new Scanner(System.in);

        System.out.print("请输入第一个正整数：");
        int m = input.nextInt();

        System.out.print("请输入第二个正整数：");
        int n = input.nextInt();
        /*
        公约数：在[1, m|n]能够同时把m和n都整除的数。

        假设：m = 12 ，n = 28  从28->1依次判断
        而[12,28]是不可能有它们的公约数的，所以这个范围不需要找。

        如果能够构成[12->1]范围找，更快
         */
        /*for(int i=n; i>=1; i--){
            if(m%i==0 && n%i==0){
                System.out.println(i +"是它们的最大公约数");
                break;
            }
        }//结果是对的，但是效率不高
        */
        /*
        提高效率：先确定m和n的大小关系。
        从[m和n中小的那个数开始 -> 1]找，找到的第一个公约数是它们的最大公约数
         */
        int max = m > n ? m : n;
        int min = m < n ? m : n;
        for(int i=min; i>=1; i--){
            if(m%i==0 && n%i==0){
                System.out.println(i +"是它们的最大公约数");
//                System.out.println(m*n/i +"是它们的最小公倍数");
                break;
            }
        }

        /*
        公倍数，能够同时被m和n整除的数。
        从[m和n中大的那个数开始找 -> m*n]找，找到的第一个公倍数是它们的最小公倍数
         */
        for(int i=max; i<=m*n; i++){
            if(i%m==0 && i%n==0){
                System.out.println(i +"是它们的最小公倍数");
            }
        }

        input.close();
    }
}
