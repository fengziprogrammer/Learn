package day04;
import java.util.Scanner; //1.
//Scanner的演示
public class ScannerDemo {
	public static void main(String[] args) {
		//ScoreLevel:接收用户输入的成绩score(double)，并输出
		//CommandBySwitch:接收用户输入的命令command(int)，并输出
		Scanner scan = new Scanner(System.in); //2.
		System.out.println("请输入年龄:");
		int age = scan.nextInt(); //3.
		System.out.println("请输入价格:");
		double price = scan.nextDouble();

		System.out.println("年龄为:"+age);
		System.out.println("价格为:"+price);
	}  
}      
    














