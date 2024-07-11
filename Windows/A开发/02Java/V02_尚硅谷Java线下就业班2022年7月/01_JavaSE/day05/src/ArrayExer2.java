import java.util.Scanner;

/*
用一个数组，保存星期一到星期天的7个英语单词，从键盘输入1-7，显示对应的单词
{"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"}



 */
public class ArrayExer2 {
    public static void main(String[] args) {
        //用一个数组，保存星期一到星期天的7个英语单词
        //字符串常量用""，元素列表用{}
        String[] weekNames = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

        Scanner input = new Scanner(System.in);
        System.out.print("请输入星期值[1,7]：");
        int weekValue = input.nextInt();

        /*
        weekValue = 1，输出Monday，weekNames[0]
        weekValue = 2，输出Tuesday，weekNames[1]
        ...
         */
        if(weekValue>= 1 && weekValue<=7) {
            System.out.println(weekValue + "对应的单词是：" + weekNames[weekValue - 1]);
        }else{
            System.out.println("输入有误！");
        }

        input.close();
    }
}
