import java.util.Scanner;
class Demo12_Scanner {

	/*
		需求:
		请通过键盘录入对象,获取个人信息,并输出至控制台
		(姓名,年龄,性别,身高,体重等)

		nextInt() 后面使用nextLine()   出现问题
		解决方案
			1> 使用不同Scanner  不推荐
			2> 通用nextLine()  String -> int  推荐
			3> 暂行的方案  nextLine之前 多使用nextLine()
	*/
	public static void main(String[] args) {

		// 1.导包
		// 2.创建对象
		Scanner sc = new Scanner(System.in);

		// 3.使用对象
		System.out.println("请输入你的姓名");
		String name = sc.nextLine();

		System.out.println("请输入你的年龄");
		int age = sc.nextInt();

		//Scanner sc2 = new Scanner(System.in);
		sc.nextLine();
		System.out.println("请输入你的性别");
		String sex = sc.nextLine();//通过分隔符 回车识别 一行数据的界限

		System.out.println("请输入你的身高cm");
		int heigh = sc.nextInt();

		System.out.println("请输入你的体重KG");
		double weigh = sc.nextDouble();
		System.out.println(name+ ","+ age+ ","+sex+ ","+heigh+ ","+weigh);


		// 4.释放资源

		sc.close();
	}
}
