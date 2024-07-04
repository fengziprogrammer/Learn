import java.util.Scanner;
class Demo13_Scanner {

	/*
		next()与nextLine()接收字符数据的区别
		next()方法：
			遇到空格等空白符，就认为输入结束
		nextLine()方法：
			遇到回车换行，就认为输入结束
	*/
	public static void main(String[] args) {

		// 2.创建对象
		Scanner sc = new Scanner(System.in);

		// 3.使用对象
		System.out.println("请输入一个内容");
		//String line = sc.nextLine(); // 输入aaa  bb(aaa空格空格bb) 结果aaa  bb
		String line = sc.next();// 输入aaa  bb(aaa空格空格bb) 结果aaa

		System.out.println(line);
	}
}
