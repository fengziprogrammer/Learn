package oo.day05;
//final����ʾ
public class FinalDemo {
	public static void main(String[] args) {
		
	}
}

//��ʾfinal������
final class Hoo{}
//class Ioo extends Hoo{} //�������final���಻�ܱ��̳�
class Joo{}
final class Koo extends Joo{} //��ȷ�����ܵ��ϰ֣����ܵ�����


//��ʾfinal���η���
class Foo{
	final void show() {}
	void test() {}
}
class Goo extends Foo{
	//void show() {} //�������final�ķ������ܱ���д
	void test() {}
}


//��ʾfinal���α���
class Eoo{
	final int num = 5;
	void show() {
		//num = 8; //�������final�ı������ܱ��޸�
	}
}






















