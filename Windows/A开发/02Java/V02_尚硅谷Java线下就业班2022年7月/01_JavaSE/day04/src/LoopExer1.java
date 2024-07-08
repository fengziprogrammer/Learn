//1、打印1-100之间的偶数
public class LoopExer1 {
    public static void main(String[] args) {
        //从1循环到100
        //快捷键 fori
        for (int i = 1; i <=100 ; i++) {
            if(i%2==0) {
                System.out.println(i);
            }
        }

        System.out.println("------------------------");
        for (int i = 2; i <=100 ; i+=2) {
            System.out.println(i);
        }
    }
}
