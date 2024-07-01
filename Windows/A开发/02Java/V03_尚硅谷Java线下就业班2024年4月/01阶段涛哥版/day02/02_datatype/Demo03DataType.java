public class Demo03DataType{
	public static void main(String[] args){
		//精度损失
		int num1 = (int)2.9;
		System.out.println(num1);
		
		//数据溢出
		
		/*
		  int占内存4个字节-> 一个字节是8个二进制位  -> 32位二进制
		  
		  100亿:36位二进制
		  
		  将36位二进制的100亿强制赋值给最多能存32位二进制的int型变量
		  多出来4位,多出来的,干掉前4位
		*/
		int num2 = (int)10000000000L;
		System.out.println(num2);//1410065408
	}
}