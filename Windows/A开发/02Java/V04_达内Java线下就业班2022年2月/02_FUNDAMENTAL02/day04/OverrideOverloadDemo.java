package oo.day04;
//��д�������������ʾ
public class OverrideOverloadDemo {
	public static void main(String[] args) {
		Goo goo = new Goo();
		Father o = new Son();
		goo.show(o); //���ؿ�����/��������
	}
}
                   
class Goo{
	void show(Father o) {
		System.out.println("�����Ͳ���");
	}
	void show(Son o) {
		System.out.println("�������Ͳ���");
	}
}

















class Father{
}
class Son extends Father{
}































