public class Exer12{
	public static void main(String[] args){
		int a = 1;
		int b = 2;
		int c = 0;
		
		boolean flag = false;
		if(flag==true){//����������
			c = a++ + b;//��ִ��
		}

		if(flag==false){//��������
			c = ++a - b;//ִ��
			/*
			(1)++a��a������Ϊ2��ȡ2
			(2)���� 2-2=0
			(3)��ֵ  0
			*/
		}
		System.out.println("a = " + a);//2
		System.out.println("b = " + b);//2
		System.out.println("c = " + c);//0
	}
}