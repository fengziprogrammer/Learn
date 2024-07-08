import java.util.Scanner;

//4、输入两个正整数m和n，求其最大公约数和最小公倍数
public class LoopExer4While {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int m;
        while(true){
            System.out.print("请输入正整数m的值：");
            m = input.nextInt();
            
            if(m <= 0){
                System.out.println("m的值必须是正整数，请重新输入");
            }else{
                break;
            }
        }

        int n;
        while(true){
            System.out.print("请输入正整数n的值：");
            n = input.nextInt();

            if(n <= 0){
                System.out.println("n的值必须是正整数，请重新输入");
            }else{
                break;
            }
        }

        int max = m > n ? m : n;
        int min = m < n ? m : n;

        while(min>=1){
            if(m%min==0 && n%min==0){
                System.out.println("最大公约数是" + min);
                break;
            }
            min--;
        }

        while(max<=m*n){
            if(max%m==0 && max%n==0){
                System.out.println("最小公倍数是：" + max);
                break;
            }
            max++;
        }
    }
}
