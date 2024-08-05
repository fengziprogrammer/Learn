package oo.day04;
//重写与重载区别的演示
public class OverrideOverloadDemo {
	public static void main(String[] args) {
		Goo goo = new Goo();
		Father o = new Son();
		goo.show(o); //重载看参数/引用类型
	}
}
                   
class Goo{
	void show(Father o) {
		System.out.println("超类型参数");
	}
	void show(Son o) {
		System.out.println("派生类型参数");
	}
}

















class Father{
}
class Son extends Father{
}































