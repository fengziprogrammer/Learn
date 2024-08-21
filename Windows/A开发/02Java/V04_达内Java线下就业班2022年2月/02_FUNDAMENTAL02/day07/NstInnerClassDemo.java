package oo.day07;
//匿名内部类
public class NstInnerClassDemo {
	public static void main(String[] args) {
		//1)创建了Aoo的一个派生类，但是没有名字
		//2)为该派生类创建了一个对象，名为o1
		//3)大括号中的为派生类的类体
		Aoo o1 = new Aoo() {
			
		};
		
		//1)创建了Aoo的一个派生类，但是没有名字
		//2)为该派生类创建了一个对象，名为o2
		//3)大括号中的为派生类的类体
		Aoo o2 = new Aoo() {
			
		};
		
		
		int num = 5;
		//1)创建了Boo的一个派生类，但是没有名字
		//2)为该派生类创建了一个对象，名为o3
		//3)大括号中的为派生类的类体
		Boo o3 = new Boo() {
			void show() {
				System.out.println("showshow");
				//num = 8; //编译错误，不能修改，因为num一定是final的
			}
		};
		o3.show();
		
	}
}

abstract class Boo{
	abstract void show();
}

abstract class Aoo{
}






















