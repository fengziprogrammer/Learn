package oo.day05;
//static的演示
public class StaticDemo {
	public static void main(String[] args) {
		/*
		Loo o1 = new Loo();
		o1.show();
		Loo o2 = new Loo();
		o2.show();
		Loo o3 = new Loo();
		o3.show();
		System.out.println(Loo.b); //常常通过类名点来访问
		*/
		
		//Moo.test(); //常常通过类名点来访问
		
		Noo o4 = new Noo();
		Noo o5 = new Noo();
		Noo o6 = new Noo();
	}
}

class Noo{ //演示静态块
	static {
		System.out.println("静态块");
	}
	Noo(){
		System.out.println("构造方法");
	}
}












class Moo{ //演示静态方法
	int a;        //实例变量(对象点来访问)
	static int b; //静态变量(类名点来访问)	
	void show() { //有隐式this
		System.out.println(this.a);
		System.out.println(Moo.b);
	}
	static void test() { //没有隐式this
		//静态方法没有隐式this传递，
		//没有this就意味着没有对象，
		//而实例变量a必须通过对象点来访问，
		//所以如下代码编译错误
		//System.out.println(a);
		System.out.println(Moo.b);   //思考+下课---------3:10继续
	}
}
























class Loo{ //演示静态变量
	int a;
	static int b;
	Loo(){
		a++;
		b++;
	}
	void show() {
		System.out.println("a="+a+",b="+b);
	}
}





















