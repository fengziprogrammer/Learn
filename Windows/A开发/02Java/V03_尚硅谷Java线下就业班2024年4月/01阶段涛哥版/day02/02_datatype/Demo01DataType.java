public class Demo01DataType{
	public static void main(String[] args){
		/*
		  100默认类型为int
		  num1类型为long
		  将100赋值给long型的num1,相当将取值范围小的数据类型赋值给了取值范围大的数据类型
		  发生了自动类型转换
		*/
		long num1 = 100;
		System.out.println(num1);
		
		
		/*
		  2默认类型为int
		  num2类型为double
		  将2赋值给了double型的num2,相当于将取值范围小的数据类型赋值给了取值范围大的数据类型
		  发生了自动类型转换
		*/
		double num2 = 2;
		System.out.println(num2);
		
		int num3 = 10;
		double num4 = 2.5;
		
		/*
		  double  = int+double
		  
		  double = double+double
		  
		  小类型和大类型做运算,小类型会自动提升为大类型
		*/
		double sum = num3+num4;
		System.out.println(sum);
		
	}
}