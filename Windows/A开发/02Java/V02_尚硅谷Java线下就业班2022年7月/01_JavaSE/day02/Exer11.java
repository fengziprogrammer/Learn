public class Exer11{
	public static void main(String[] args){
		int i = 0;
		int result = ++i/--i; //java.lang.ArithmeticException:
		/*
		i������Ϊ1��ȡ1
		i���Լ�Ϊ0��ȡ0
		
		1/0
		*/
		System.out.println("result="+result);
	}
}