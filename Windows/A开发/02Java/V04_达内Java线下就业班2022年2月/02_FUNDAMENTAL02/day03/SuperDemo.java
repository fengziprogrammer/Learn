package oo.day03;
//super����ʾ
public class SuperDemo {
	public static void main(String[] args) {
		Boo o = new Boo();
	}
}


class Coo{
	Coo(int a){
	}
}

class Doo extends Coo{
	Doo(){
		super(5);
	}
	/*
	//���´���ΪĬ�ϵ�:
	Doo(){
		super();
	}
	*/
}















class Aoo{
	Aoo(){
		System.out.println("���๹��");
	}
}
class Boo extends Aoo{
	Boo(){
		super(); //Ĭ�ϵ�--���ó����޲ι��췽��
		System.out.println("�����๹��");
	}
}
















