class Demo2 {

	/*
	基本数据类型(重点)
		四类 8种
			整数类
				byte 1个字节   -128  127
				short 2个字节
				int 4个字节     默认
				long 8个字节

				long 声明时 一般情况下 标记l/L
			浮点类
				float double
			字符类
				char
			布尔类	
				boolean
	*/
	public static void main(String[] args) {

		byte b = 3;// 声明byte类型的变量 起名字b 赋值为3
		System.out.println(b);//

		//byte b2 = 300;
		//System.out.println(b2);//报错,300超过了byte的取值范围

		short s = 300;
		System.out.println(s);

		int i = 300;
		System.out.println(i);

		long l = 80000000000000L;
		System.out.println(l);
	}
}
