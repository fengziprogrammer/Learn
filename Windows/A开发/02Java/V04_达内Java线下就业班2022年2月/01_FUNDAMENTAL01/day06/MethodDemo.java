package day06;
//方法的演示
public class MethodDemo {
	public static void main(String[] args) {
		//say();
		
		/*
		//sayHi(); //编译错误，有参则必须传参
		//sayHi(250); //编译错误，参数类型必须匹配
		sayHi("zhangsan"); //String name="zhangsan"  ---实参
		sayHi("lisi"); //String name="lisi"
		*/
		
		/*
		sayHello("WKJ",37); //String name="WKJ",int age=37
		sayHello("zhangsan",25);
		*/
		
		/*
		double a = getNum(); //getNum()的值就是return后的那个数
		System.out.println(a); //模拟对返回值的后续操作
		*/
		
		/*
		int b = plus(5,6);
		System.out.println(b); //模拟对返回值的后续操作
		
		int c=5,d=6;
		int m = plus(c,d); //传的是c和d里面的数
		System.out.println(m); //模拟对返回值的后续操作
		*/
		
		/*
		double[] arr = testArray();
		for(int i=0;i<arr.length;i++) { //模拟对返回值的后续操作
			System.out.println(arr[i]);
		}
		*/
		/*
		sayHello("zhangsan",25);
		sayHello("lisi",50);
		*/
		
		a(); //111,333,222,444
		System.out.println(444);
		
	}
	
	public static void a() {
		System.out.println(111);
		b(); //方法的嵌套调用
		System.out.println(222);
	}
	public static void b() {
		System.out.println(333);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void sayHello(String name,int age) { //有参无返回值
		if(age>45) { //在某种特定条件下，提前结束方法
			return; //结束方法的执行
		}
		System.out.println("大家好，我叫"+name+"，今年"+age+"岁了");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public static double[] testArray() { //无参有返回值
		double[] ds = {3.14,45.67,0.57};
		return ds;
	}
	
	public static int plus(int num1,int num2) { //有参有返回值
		int num = num1+num2;
		return num; //返回的是num里面的那个数
		//return num1+num2; //返回的是num1与num2的和
	}
	
	/*
	 * 对于有返回值的方法，java规定:
	 * 1)在方法中必须得有return，return后必须跟一个数
	 * 2)并且return后的数还必须与返回值类型匹配
	 */
	public static double getNum() { //无参有返回值
		//return; //编译错误，return后必须跟一个数
		//return "abc"; //编译错误，与返回值类型不匹配
		return 8.88; //1)结束方法的执行  2)返回结果给调用方
	}
	
	public static void say() { //无参无返回值
		System.out.println("大家好，我叫WKJ，今年37岁了");
	}
	
	public static void sayHi(String name) { //有参无返回值----形参
		System.out.println("大家好，我叫"+name+"，今年37岁了");
	}
	
	
	
	
	
}



















