package oo.day07;
//�����ڲ���
public class NstInnerClassDemo {
	public static void main(String[] args) {
		//1)������Aoo��һ�������࣬����û������
		//2)Ϊ�������ഴ����һ��������Ϊo1
		//3)�������е�Ϊ�����������
		Aoo o1 = new Aoo() {
			
		};
		
		//1)������Aoo��һ�������࣬����û������
		//2)Ϊ�������ഴ����һ��������Ϊo2
		//3)�������е�Ϊ�����������
		Aoo o2 = new Aoo() {
			
		};
		
		
		int num = 5;
		//1)������Boo��һ�������࣬����û������
		//2)Ϊ�������ഴ����һ��������Ϊo3
		//3)�������е�Ϊ�����������
		Boo o3 = new Boo() {
			void show() {
				System.out.println("showshow");
				//num = 8; //������󣬲����޸ģ���Ϊnumһ����final��
			}
		};
		o3.show();
		
	}
}

abstract class Boo{
	abstract void show();
}

abstract class Aoo{
}






















