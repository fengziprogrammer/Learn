package oo.day09;

public class MultiTypeDemo {
	public static void main(String[] args) {
		Aoo o = new Boo(); //向上造型
		Boo o1 = (Boo)o; //o指向的对象就是Boo类型
		Inter o2 = (Inter)o; //o指向的对象实现了Inter接口
		//Coo o3 = (Coo)o; //运行时发生ClassCastException类型转换异常
		if(o instanceof Coo) { //false
			Coo o4 = (Coo)o;
		}else {
			System.out.println("o不是Coo类型");
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

















