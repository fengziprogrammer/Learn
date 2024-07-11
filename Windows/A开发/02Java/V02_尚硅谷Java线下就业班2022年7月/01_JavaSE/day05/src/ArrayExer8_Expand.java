import java.util.Scanner;

public class ArrayExer8_Expand {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("请输入小组人数：");
        int count = input.nextInt();

        int[] scores = new int[count];
        String[] names = new String[count];

        int max = scores[0];
        for (int i = 0; i < names.length; i++) {
            System.out.print("请输入第"  +(i+1) + "学员的姓名：");
            names[i] = input.next();
            System.out.print("请输入第"  +(i+1) + "学员的成绩：");
            scores[i] = input.nextInt();
            if(scores[i] > max){
                max = scores[i];
            }
        }

        //遍历显示
        String result = "";
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + ":" + scores[i]);
            if(scores[i]  == max){
               result += names[i]+" ";
            }
        }
        System.out.println("最高分：" + max);
        System.out.println("最高分姓名：" + result);

    }
}
