package oo.day04;
//�������͵���ʾ
public class UploadDemo {
	public static void main(String[] args) {
		Aoo o1 = new Aoo();
		o1.a = 1;
		o1.show();
		//o1.b = 2; //������󣬳��಻�ܷ����������
		
		Boo o2 = new Boo();
		o2.b = 1;
		o2.test();
		o2.a = 2;  //��ȷ����������Է��ʳ����
		o2.show();
		
		Aoo o3 = new Boo(); //��������
		o3.a = 1;
		o3.show();
		//o3.b = 2; //��������ܵ����ʲô�������õ�����
	}
}

class Aoo{
	int a;
	void show() {
	}
}
class Boo extends Aoo{
	int b;
	void test() {
	}
}





















