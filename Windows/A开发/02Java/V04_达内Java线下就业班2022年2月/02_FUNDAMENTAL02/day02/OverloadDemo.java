package oo.day02;
//���ص���ʾ
public class OverloadDemo {
	public static void main(String[] args) {
		Aoo o = new Aoo();
		o.show();
		o.show("zhangsan");
		o.show(25);
		o.show("zhangsan", 25);
		o.show(25, "zhangsan");
	}
}
class Aoo{
	void show() { }
	void show(String name) { }
	void show(int age) { }
	void show(String name,int age) { }
	void show(int age,String name) { }
	//int show() { return 1; } //������������뷵��ֵ�����޹�
	//void show(String address) { } //���������������������޹�
}
















