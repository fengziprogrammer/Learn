package oo.day05;
//static����ʾ
public class StaticDemo {
	public static void main(String[] args) {
		/*
		Loo o1 = new Loo();
		o1.show();
		Loo o2 = new Loo();
		o2.show();
		Loo o3 = new Loo();
		o3.show();
		System.out.println(Loo.b); //����ͨ��������������
		*/
		
		//Moo.test(); //����ͨ��������������
		
		Noo o4 = new Noo();
		Noo o5 = new Noo();
		Noo o6 = new Noo();
	}
}

class Noo{ //��ʾ��̬��
	static {
		System.out.println("��̬��");
	}
	Noo(){
		System.out.println("���췽��");
	}
}












class Moo{ //��ʾ��̬����
	int a;        //ʵ������(�����������)
	static int b; //��̬����(������������)	
	void show() { //����ʽthis
		System.out.println(this.a);
		System.out.println(Moo.b);
	}
	static void test() { //û����ʽthis
		//��̬����û����ʽthis���ݣ�
		//û��this����ζ��û�ж���
		//��ʵ������a����ͨ������������ʣ�
		//�������´���������
		//System.out.println(a);
		System.out.println(Moo.b);   //˼��+�¿�---------3:10����
	}
}
























class Loo{ //��ʾ��̬����
	int a;
	static int b;
	Loo(){
		a++;
		b++;
	}
	void show() {
		System.out.println("a="+a+",b="+b);
	}
}





















