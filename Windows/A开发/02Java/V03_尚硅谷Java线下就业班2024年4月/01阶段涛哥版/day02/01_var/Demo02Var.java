public class Demo02Var{
	public static void main(String[] args){
		int num1 = 10;
		int result01 = num1+3;
		System.out.println(result01);
		System.out.println(num1-3);
		System.out.println(num1*3);
		System.out.println(num1/3);//取整数部分
		System.out.println(num1/3.0);//如果符号前后有一个为小数,结果就是带小数的,默认类型为double
		
		System.out.println("===================");
		
		int a = 10;
		int b = 2;
		
		int sum = a+b;
		System.out.println(sum);
		
		int sub = a-b;
		System.out.println(sub);
		
		int mul = a*b;
		System.out.println(mul);
		
		int div = a/b;
		System.out.println(div);
	}
}