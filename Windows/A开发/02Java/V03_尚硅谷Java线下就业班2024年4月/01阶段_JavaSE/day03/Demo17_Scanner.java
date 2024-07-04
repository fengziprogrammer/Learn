import java.util.Scanner;
class Demo17_Scanner {

	/*
		Scanner 使用中容易出现的小问题
		解决方案 
		1> 使用两个Scanenr
		2> 通用nextLine() -> int

	*/

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("请输入第一个内容");
		String line = sc.nextLine();
		int a = Integer.valueOf(line);

		//Scanner sc2 = new Scanner(System.in);
		System.out.println("请输入第二个内容");		
		String b = sc2.nextLine();//""
		System.out.println(a+"," +b + "*****");

		sc.close();
	}
}
