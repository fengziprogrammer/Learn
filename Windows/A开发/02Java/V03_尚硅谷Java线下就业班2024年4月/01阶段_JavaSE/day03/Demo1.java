class Demo1 {

	public static void main(String[] args) {

		// 其他变量放在一起使用
		int x = 3;

		int y = ++x; // y的值是4，x的值是4，
		
		//int y = x++ + x; 		
		//System.out.println(x);//4 
		//System.out.println(y);//4
		System.out.println("==========");
        
		// 和输出语句一起
		int z = 5;
		//System.out.println(++z);// 输出结果是6，z的值也是6
		System.out.println(z++);// 输出结果是5，z的值是6
		System.out.println(z);//6
	}
}
