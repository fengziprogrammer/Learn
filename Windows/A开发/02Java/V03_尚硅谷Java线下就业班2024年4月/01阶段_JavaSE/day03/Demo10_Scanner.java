import java.util.Scanner;//导包
class Demo10_Scanner {

	/*
		- 导包
			格式： import java.util.Scanner; //包  文件
			位置：在class上面。
		- 创建键盘录入对象
			格式：Scanner sc = new Scanner(System.in);//标准输入流
			new 关键字 创建一个引用数据类型的对象
		- 通过对象获取数据
			格式：int x = sc.nextInt();
		- 释放资源
			格式:sc.close();
	*/
	public static void main(String[] args) {
		
		// 创建键盘录入对象  
		// int   a = 10/;
		Scanner sc = new Scanner(System.in);
		
		// 通过对象获取数据 通过键盘录入对象 可以获取键盘录入的一个整数
		int x = sc.nextInt(); // = 右边  获取键盘录入的一个整数
		System.out.println(x);

		sc.close();//释放资源
	
	}


}
