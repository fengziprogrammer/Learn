class  Demo4 {

/*
	&& 与 & 区别
	相同点
		计算的逻辑结果一致的
	不同点
		&& 具备短路效果 
			原理 遇false 则false 
			如果左边是false  右边则不执行
		& 不具备短路效果
			如果左边是false  右边仍然执行
	|| 与 | 区别
	相同点
		计算的逻辑结果一致的
	不同点
		|| 具备短路效果 
			原理 遇true 则true 
			如果左边是true  右边则不执行
		| 不具备短路效果
			如果左边是true  右边仍然执行
*/
	public static void main(String[] args) {

		int a = 3;
		int b = 4;
		int c = 5;

		int x = 3;
		int y = 4;

		// & 与，且 and；有false则false
		System.out.println((a > b) && (x++ == y)); //F & F -> F
		System.out.println(x);// ?

		//System.out.println((a > b) && (a < c)); //F & T -> F
		//System.out.println((a < b) && (a > c)); //T & F -> F
		//System.out.println((a < b) && (a < c)); // T & T -> T
		//System.out.println("===============");
		// | 或；有true则true
		/*System.out.println((a > b) | (a > c)); //F
		System.out.println((a > b) | (a < c)); //T
		System.out.println((a < b) | (a > c)); //T
		System.out.println((a < b) | (a < c)); //T*/
		System.out.println("===============");

		// ^ 异或；相同为false，不同为true
		//System.out.println((a > b) ^ (a > c));//F F F
		//System.out.println((a > b) ^ (a < c)); //F T T
		//System.out.println((a < b) ^ (a > c)); //T F T
		//System.out.println((a < b) ^ (a < c)); // T T F
		System.out.println("===============");
		// ! 非；非false则true，非true则false
		//System.out.println(!false);//t
		//System.out.println(!!true);//t 
	}
}
