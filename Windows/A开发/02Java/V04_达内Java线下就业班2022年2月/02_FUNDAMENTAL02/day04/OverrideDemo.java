package oo.day04;
//��д����ʾ
public class OverrideDemo {
	public static void main(String[] args) {
	}
}

//�����������С
class Coo{
	void show() {}
	double test() { return 0.0; }
	Doo say() { return null; }
	Coo sayHi() { return null; }
}
class Doo extends Coo{
	//int show() { return 5;} //�������voidʱ������ͬ
	//int test() { return 0; } //������󣬻�������ʱ������ͬ
	//Coo say() { return null; } //��������������ͱ���С�ڻ����
	Doo sayHi() { return null; } //��ȷ
}


















