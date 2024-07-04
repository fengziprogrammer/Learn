class Demo3_HomeWork {

	/*
	定义两个变量int a = 10, int b = 20;
	需求:将两个变量的值进行交换,结果,a = 20; b = 10;

		分析
			引入第三方变量 (无中生友)
			开关思想
	*/
	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		int c;//第三方变量 

		c = a;
		a = b;
		b = c;

		System.out.println(a);
		System.out.println(b);
	}
}
