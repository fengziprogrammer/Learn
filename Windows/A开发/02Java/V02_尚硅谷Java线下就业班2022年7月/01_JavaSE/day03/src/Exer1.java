import java.util.Scanner;

/*
从键盘输入个人的信息，用合适的变量接收并输出
姓名、年龄、性别、体重、婚否等

变量名、方法名等，从第二个单词开始首字母大写。
 */
public class Exer1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("请输入姓名：");
        String name = input.next();

        System.out.print("请输入年龄：");
        int age = input.nextInt();

        System.out.print("请输入性别：");
        char gender = input.next().charAt(0);

        System.out.print("请输入体重：");
        double weight = input.nextDouble();

        System.out.print("请输入婚否(true/false)：");
        boolean marry = input.nextBoolean();

        System.out.println("姓名： " + name);
        System.out.println("年龄： " + gender);
        System.out.println("性别： " + name);
        System.out.println("体重： " + weight);
        System.out.println("婚姻状态 " + (marry?"已婚":"未婚"));

        input.close();
    }
}
