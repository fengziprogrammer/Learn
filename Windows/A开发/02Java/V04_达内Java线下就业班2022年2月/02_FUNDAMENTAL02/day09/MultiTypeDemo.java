package oo.day09;

public class MultiTypeDemo {
	public static void main(String[] args) {
		Aoo o = new Boo(); //��������
		Boo o1 = (Boo)o; //oָ��Ķ������Boo����
		Inter o2 = (Inter)o; //oָ��Ķ���ʵ����Inter�ӿ�
		//Coo o3 = (Coo)o; //����ʱ����ClassCastException����ת���쳣
		if(o instanceof Coo) { //false
			Coo o4 = (Coo)o;
		}else {
			System.out.println("o����Coo����");
		}
	}
}

interface Inter{
}
class Aoo{
}
class Boo extends Aoo implements Inter{
}
class Coo extends Aoo{
}

















