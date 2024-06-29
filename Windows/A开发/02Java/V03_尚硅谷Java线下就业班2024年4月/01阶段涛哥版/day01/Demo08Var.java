public class Demo08Var{
	public static void main(String[] args){
		//byte
		byte num1 = 100;
		num1 = 101;
		//num1 = 200;超出了byte的取值范围了
		System.out.println(num1);
		
		//short
		short num2 = 100;
		System.out.println(num2);
		
		//int 整数默认类型
		int num3 = 100000000;
		System.out.println(num3);
		
		/*
		  long 定义long型的变量,习惯上再值得后面加上L或者l
		  建议用L
		*/
		long num4 = 100000000L;
		System.out.println(num4);
		
		/*
		  float 定义float型的变量,请在小数后面加F或者f
		  建议用F
		*/
		float num5 = 2.5F;
		System.out.println(num5);
		
		/*
		  double
		*/
		double num6 = 2.5;
		System.out.println(num6);
		
		/*
		  char 代表字符变量
		*/
		char num7 = '中';
		System.out.println(num7);
		
		/*
		  boolean
		  true false
		*/
		
		boolean num8 = true;
		boolean num9 = false;
		System.out.println(num8);
		System.out.println(num9);
		
		/*
		  num9代表的是false
		  相当于将num9的false赋值给了变量num8,此时num8的true被覆盖了,变成了num9的false了
		*/
	    num8 = num9;
		System.out.println(num8);
		
		/*
		  String 字符串
		*/
		String s = "atguigu";
		s = "taoge";
		System.out.println(s);
	}
}