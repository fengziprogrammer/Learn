package oo.day08;
//接口的演示
public class InterDemo {
	public static void main(String[] args) {
		//Inter4 o1 = new Inter4(); //编译错误，接口不能被实例化
		Inter4 o2 = new Doo(); //向上造型
		Inter3 o3 = new Doo(); //向上造型
	}
}

interface Inter3{
	void show();
}
interface Inter4 extends Inter3{
	void test();
}
class Doo implements Inter4{
	public void test() {}
	public void show() {}
}














//演示接口的多实现
interface Inter1{
	void show();
}
interface Inter2{
	void test();
}
abstract class Boo{
	abstract void say();
}
class Coo extends Boo implements Inter1,Inter2{
	public void show() {}
	public void test() {}
	void say() {}
}



















//演示接口的实现
class Aoo implements Inter{
	public void show() {}
	public void test() {}
}

//演示接口的语法
interface Inter{
	public static final int NUM = 5;
	public abstract void show();
	int COUNT = 5; //默认public static final
	void test(); //默认public abstract
	//int number; //编译错误，常量必须声明同时初始化
	//void say() {} //编译错误，抽象方法不能有方法体
}




























