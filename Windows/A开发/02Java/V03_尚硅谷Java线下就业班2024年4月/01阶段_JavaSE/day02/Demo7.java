class Demo7 {

	/*
		自动转换(隐式转换)
			1> byte short char --> int
			2> 小的与大的参与运算  小 -> 大
		强制转换(显式转换)
			需要将取值范围大的值 -> 取值范围小的值
			格式
			目标数据类型  变量名 = (目标数据类型)转换的值;

		注意
			取值范围
			byte  -128  127
			超过了取值范围的强转,可能会得到意想不到的结果
	*/
	public static void main(String[] args) {
		
		

		short s1 = 3;
		//short s2 = s1 + 5;//?
		int i = 10;
		long l = 88;

		// s1 自动 -> int -> long
		// i  int -> long
		long l2 = s1 + i + l;
		int i2 = (int)(s1 + i + l);
		
		System.out.println(i2);// 8
		System.out.println("-------------------");

		byte b1 = 127;
		byte b2 = 3;

		// byte  = int 3 + int 4;
		byte b3 = (byte)(b1 + b2);
		System.out.println(b3);//128
		
	}
}
