package day06;
//��������ʾ
public class MethodDemo {
	public static void main(String[] args) {
		//say();
		
		/*
		//sayHi(); //��������в�����봫��
		//sayHi(250); //������󣬲������ͱ���ƥ��
		sayHi("zhangsan"); //String name="zhangsan"  ---ʵ��
		sayHi("lisi"); //String name="lisi"
		*/
		
		/*
		sayHello("WKJ",37); //String name="WKJ",int age=37
		sayHello("zhangsan",25);
		*/
		
		/*
		double a = getNum(); //getNum()��ֵ����return����Ǹ���
		System.out.println(a); //ģ��Է���ֵ�ĺ�������
		*/
		
		/*
		int b = plus(5,6);
		System.out.println(b); //ģ��Է���ֵ�ĺ�������
		
		int c=5,d=6;
		int m = plus(c,d); //������c��d�������
		System.out.println(m); //ģ��Է���ֵ�ĺ�������
		*/
		
		/*
		double[] arr = testArray();
		for(int i=0;i<arr.length;i++) { //ģ��Է���ֵ�ĺ�������
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
		b(); //������Ƕ�׵���
		System.out.println(222);
	}
	public static void b() {
		System.out.println(333);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void sayHello(String name,int age) { //�в��޷���ֵ
		if(age>45) { //��ĳ���ض������£���ǰ��������
			return; //����������ִ��
		}
		System.out.println("��Һã��ҽ�"+name+"������"+age+"����");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public static double[] testArray() { //�޲��з���ֵ
		double[] ds = {3.14,45.67,0.57};
		return ds;
	}
	
	public static int plus(int num1,int num2) { //�в��з���ֵ
		int num = num1+num2;
		return num; //���ص���num������Ǹ���
		//return num1+num2; //���ص���num1��num2�ĺ�
	}
	
	/*
	 * �����з���ֵ�ķ�����java�涨:
	 * 1)�ڷ����б������return��return������һ����
	 * 2)����return������������뷵��ֵ����ƥ��
	 */
	public static double getNum() { //�޲��з���ֵ
		//return; //�������return������һ����
		//return "abc"; //��������뷵��ֵ���Ͳ�ƥ��
		return 8.88; //1)����������ִ��  2)���ؽ�������÷�
	}
	
	public static void say() { //�޲��޷���ֵ
		System.out.println("��Һã��ҽ�WKJ������37����");
	}
	
	public static void sayHi(String name) { //�в��޷���ֵ----�β�
		System.out.println("��Һã��ҽ�"+name+"������37����");
	}
	
	
	
	
	
}



















