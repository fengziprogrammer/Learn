import java.util.Scanner;

public class ExpandExer2 {
    public static void main(String[] args) {
        //2、从键盘输入一个分数，如果成绩在[0,100]之间，就显示成绩值，否则就显示输入成绩错误！
        Scanner input = new Scanner(System.in);

        System.out.print("请输入成绩[0,100]：");
        int score = input.nextInt();

        if(score>=0 && score<=100){
            System.out.println("score = " + score);
        }else{
            System.out.println("成绩输入有误！");
        }

        input.close();
    }
}
