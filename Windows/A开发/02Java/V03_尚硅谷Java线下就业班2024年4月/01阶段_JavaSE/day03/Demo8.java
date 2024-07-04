class Demo8 {

	/*
		条件运算符/三元运算符
		数据类型 变量名 =  (条件表达式)? 值1 : 值2;
		执行顺序
			1.条件表达式 -> boolean
			2.boolean 值 true 执行值1
			3.boolean 值 false  执行值2
		求两个整数的最大值
		求三个整数的最大值
		求两个整数是否相等

	*/
	public static void main(String[] args) {

		int x = 80;
		int y = 20;
		
		//boolean b = (x == y)? true:false ;
		String s = (x == y)? "相等":"不相等" ;
		System.out.println(s);
		
		
		
		
		/*int z = 777;

		int max = ( x > y)? x: y;

		int min;//  代表的是x 与y的最小值
		min = (x < y)?x :y;

		int max2;// 代表的是x y z的最大值
		//max2 = (max > z) ? max : z;

		max2 = ((( x > y)? x: y) > z) ? (( x > y)? x: y) : z;

		System.out.println(max2);*/
	}
}
