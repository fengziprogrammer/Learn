public class Demo04DataType{
	public static void main(String[] args){
		byte num1 = 100;//等号右边是一个值,不超出范围,不会报错,jvm自动强转
		System.out.println(num1);
		
		byte num2 = (byte)200;//如果超出范围,需要我们自己强转
		System.out.println(num2);
		
		byte num3 = 10+1;
		System.out.println(num3);
		
		byte num4 = 1;
		
		/*
		  byte = byte+int
		  byte = int+int -> 需要手动转
		*/
		byte num5 = (byte)(num4+1);
		System.out.println(num5);
		
		System.out.println("=====================");
		
		char num6 = '0';
		System.out.println(num6+0);
		
		System.out.println('中'+0);//20013
		
		int num7 = '国';
		System.out.println(num7);
	}
}