public class Exer13{
	public static void main(String[] args){
		int a = 1;
		int b = 2;
		int c = 0;
		boolean flag = false;
		if(flag=true){ //=��ֵ��if(true)��ͬʱ�޸���flag��ֵ
			c = a++ + b;//ִ��
			/*
			(1)a++����ȡa��ֵ1���ŵ�������ջ�У�a����Ϊ2
			(2)��+��1+2=3
			(3)��ֵ c=3
			*/
		}

		if(flag=false){//���Ǹ�ֵ��flag����ֵ��false��if(false)������
			c = ++a - b;//��ִ��
		}
		System.out.println("a = " + a);//2
		System.out.println("b = " + b);//2
		System.out.println("c = " + c);//3
	}	
}