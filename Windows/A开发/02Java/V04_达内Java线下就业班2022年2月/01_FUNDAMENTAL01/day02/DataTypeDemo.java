package day02;
//数据类型的演示
public class DataTypeDemo {
	public static void main(String[] args) {
		//数据类型间的转换:
		byte b1 = 5; 
		byte b2 = 6;
		byte b3 = (byte)(b1+b2);
		
		System.out.println(2+2);     //4
		System.out.println(2+'2');   //52，2加上'2'的码50
		System.out.println('2'+'2'); //100，'2'的码50，加上'2'的码50
		System.out.println('2'); //2
		
		//练习+下课----------------5:20继续
		
		
		
		
		
		
		/*
		int a = 5;
		long b = a;     //自动类型转换
		int c = (int)b; //强制类型转换
		
		long d = 5;   //自动类型转换
		double e = 5; //自动类型转换
		
		long f = 10000000000L;
		int g = (int)f;
		System.out.println(g); //强转有可能发生溢出
		double h = 56.987;
		int i = (int)h;
		System.out.println(i); //56，强转有可能丢失精度
		*/
		
		
		
		
		/*
		//1)int:整型，4个字节，-21个多亿到21个多亿
		int a = 250; //250为整数直接量，默认int类型
		//int b = 10000000000; //编译错误，100亿默认为int，但超范围了
		//int c = 3.14; //编译错误，数据类型不匹配
		System.out.println(5/2);   //2
		System.out.println(2/5);   //0
		System.out.println(5/2.0); //2.5
		int d = 2147483647; //int的最大值
		d = d+1;
		System.out.println(d); //-2147483648，溢出是需要避免的
		*/
	   
		/*
		//2)long:长整型，8个字节，很大很大很大
		//long a = 10000000000; //编译错误，100亿默认为int型，但超出范围了
		long b = 10000000000L; //100亿L为长整型直接量
		long c = 1000000000*2*10L;
		System.out.println(c); //200亿
		long d = 1000000000*3*10L;
		System.out.println(d); //不是300亿，发生溢出了
		long e = 1000000000L*3*10;
		System.out.println(e); //300亿
		
		//3)double:浮点型，8个字节，很大很大很大
		double f = 3.14; //3.14为浮点数直接量，默认double型
		float g = 3.14F; //float型数据需在数字后加F或f
		double h=3.0,i=2.9;
		System.out.println(h-i); //0.10000000000000009，舍入误差
		*/
		
		/*
		//4)boolean:布尔型，1个字节
		boolean b1 = true;  //true为布尔型直接量
		boolean b2 = false; //false为布尔型直接量
		//boolean b3 = 25; //编译错误，布尔型只能取值为true或false
		
		//5)char:字符型，2个字节
		char c1 = '女'; //字符女
		char c2 = 'f';  //字符f
		char c3 = '6';  //字符6
		char c4 = ' ';  //空格符
		//char c5 = 女; //编译错误，字符直接量必须放在单引号中
		//char c6 = ''; //编译错误，必须有字符
		//char c7 = '10'; //编译错误，只能有一个字符
		
		char c8 = 65; //0到65535之间
		System.out.println(c8); //A，输出时会依据变量的数据类型来输出
		char c9 = '\\';
		System.out.println(c9); //\
		
		*/
	}
}

















