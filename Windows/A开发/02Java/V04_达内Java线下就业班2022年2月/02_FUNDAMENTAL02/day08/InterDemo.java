package oo.day08;
//�ӿڵ���ʾ
public class InterDemo {
	public static void main(String[] args) {
		//Inter4 o1 = new Inter4(); //������󣬽ӿڲ��ܱ�ʵ����
		Inter4 o2 = new Doo(); //��������
		Inter3 o3 = new Doo(); //��������
	}
}

interface Inter3{
	void show();
}
interface Inter4 extends Inter3{
	void test();
}
class Doo implements Inter4{
	public void test() {}
	public void show() {}
}














//��ʾ�ӿڵĶ�ʵ��
interface Inter1{
	void show();
}
interface Inter2{
	void test();
}
abstract class Boo{
	abstract void say();
}
class Coo extends Boo implements Inter1,Inter2{
	public void show() {}
	public void test() {}
	void say() {}
}



















//��ʾ�ӿڵ�ʵ��
class Aoo implements Inter{
	public void show() {}
	public void test() {}
}

//��ʾ�ӿڵ��﷨
interface Inter{
	public static final int NUM = 5;
	public abstract void show();
	int COUNT = 5; //Ĭ��public static final
	void test(); //Ĭ��public abstract
	//int number; //������󣬳�����������ͬʱ��ʼ��
	//void say() {} //������󣬳��󷽷������з�����
}




























