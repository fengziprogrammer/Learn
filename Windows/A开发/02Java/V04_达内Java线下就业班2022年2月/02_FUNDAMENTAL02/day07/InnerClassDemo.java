package oo.day07;
//��Ա�ڲ���
public class InnerClassDemo {
	public static void main(String[] args) {
		Mama m = new Mama();
		//Baby b = new Baby(); //��������ڲ�����ⲻ�߱��ɼ���
	}
}

class Mama{ //�ⲿ��
	private String name;
	void create() {
		Baby b = new Baby(); //��ȷ
	}
	class Baby{ //�ڲ���
		void showName() {
			System.out.println(name);
			System.out.println(Mama.this.name);
			//System.out.println(this.name); //�������thisָ����ǰBaby����
		}
	}
}























