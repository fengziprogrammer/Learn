package oo.day05;
//���ʿ������η�����ʾ
public class Aoo {
	public int a;    //�κ���
	protected int b; //���ࡢ�����ࡢͬ����
	int c;           //���ࡢͬ����
	private int d;   //����
	
	void show() { 
		a = 1;
		b = 2;
		c = 3;
		d = 4;
	}
}

class Boo{ //��ʾprivate
	void show() {
		Aoo o = new Aoo();
		o.a = 1;
		o.b = 2;
		o.c = 3;
		//o.d = 4; //�������
	}
}















