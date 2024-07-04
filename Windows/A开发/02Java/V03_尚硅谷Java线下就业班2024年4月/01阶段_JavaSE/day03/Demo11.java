import java.util.Scanner;
class Demo11 {

	/*
		需求: 键盘录入两个整数
			1> 导包  class  import java.util.Scanner
			2> 创建对象
			3> 使用对象
			4> 释放资源
		求出最大值
	*/
	public static void main(String[] args) {

		//1> 导包  class  import java.util.Scanner
		//2> 创建对象
		Scanner sc = new Scanner(System.in);

		//3> 使用对象 获得一个整数 赋值为num1
		System.out.println("请输入第一个整数:");
		int num1 = sc.nextInt();

		System.out.println("请输入第二个整数:");
		int num2 = sc.nextInt();
		System.out.println(num1 +"," +num2);

		//求出最大值
		int max = (num1 > num2)? num1 : num2;
		System.out.println("这两个整数的最大值:" + max);

		//4> 释放资源
		sc.close();

		
	}
}
