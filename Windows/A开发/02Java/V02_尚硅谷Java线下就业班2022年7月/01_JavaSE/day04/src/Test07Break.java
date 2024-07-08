import java.util.Scanner;

/*
break：关键字，表示中断
只能用在：
（1）switch...case结构
（2）循环体中

 */
public class Test07Break {
    public static void main(String[] args) {
        //从键盘输入一个整数，判断它是否是素数
        /*
        素数：又称为质数，这个数只有1和它本身两个约数，只能被1和它本身整数，例如：11,7等
         */
        Scanner input = new Scanner(System.in);

        System.out.print("请输入正整数：");
        int num = input.nextInt();//11

//        设一个标记
        boolean flag = true;//true表示num是素数的意思
        //如果num被[2,num-1]之间任意一个数整除了，那么num就不是素数
        int count = 0;
        for(int i=2; i<=num-1; i++){
            count++;
            if(num%i==0){//说明num被i给整除了
                flag = false;
                break;//提前中断，结束当前for循环
            }
        }
        System.out.println("循环了" + count +"次");

        if(flag){
            System.out.println(num + "是素数");
        }else{
            System.out.println(num + "不是素数");
        }

        input.close();
    }
}
