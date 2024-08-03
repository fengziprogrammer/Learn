1、权限修饰符有几种情况，各自的可见性范围是什么？
				private  缺省	protected 	public
本类			yes		yes		yes			yes		
本包			no		yes		yes			yes
其他包的子类	no		no		yes			yes
其他包的非子类	no		no		no			yes

修饰类（这里指外部类）：只能public和缺省
修饰成员（目前学习的成员主要是实例变量，实例方法）：可以四种任选一种

2、继承的关键字是什么？extends

3、继承的特点和要求有哪些？
（1）子类会继承父类所有的实例变量和实例方法。
只要权限修饰符允许，子类中可以直接访问父类中声明的所有实例变量和实例方法。
只要权限修饰符允许，在其他类中，通过子类对象可以调用父类中声明的所有实例变量和实例方法。
（2）Java只支持单继承
（3）Java支持多层继承
面试题会出现：多重继承（同时可以有多个直接父类，错误）和多层继承
（4）Java中同一个父类可以同时有多个子类
（5）其他的后面在补充

4、Overload与Override的区别？
Overload：方法的重载
Override：方法的重写
区别：	方法名		形参列表	返回值类型		权限修饰符		其他
重载	必须相同	必须不同	无关/不看		不看			不看
重写	必须相同	必须相同	有要求			有要求			后面再说
			
重写时：			
返回值类型：基本数据类型和void必须相同，引用数据类型可以是<=
权限修饰符：总体来说是>=，
			在子类中不可见的方法是不能被重写（例如：private，跨包的话缺省的情况下）
			
							

5、局部变量与成员变量（目前主要是指实例变量）的区别
（1）声明位置不同
局部变量：在方法的(形参列表)或方法体{局部变量}
成员变量：在类中但是方法外
（2）在内存中存储位置不同
局部变量：在栈
成员变量：堆
（3）生命周期
局部变量：方法的每一次调用都会全新的
成员变量：和对象的生命周期相同，每一个对象的实例变量都是独立的。
（4）作用域
局部变量：有作用域范围，从声明它的位置开始，到它所属的{}结构为止
	for(int i=0; i<5; i++){
		if(i==3){
			int temp = 3;
		}
	}
成员变量：本类中都可见，其他类中需要通过方法，如果权限修饰符允许，也可以通过对象.直接访问
（5）修饰符（后面再总结）
局部变量：final
成员变量：有很多



6、下面Exam6.java文件的代码有哪些语法错误
import java.util.Scanner;//(1)不需要(2)如果需要，它的位置不对，它应该在package的下面

package com.atguigu.exam; 

private class Exam6{//错误，外部类不能用private修饰，这里应该用public，当然也可以缺省
	public static void main(String[] args){
		Demo d = new Demo();
		System.out.println(d.num);//因为num是private，跨类就不能直接使用了
	}

}

public class Demo{//如果Demo类在Exam6.java文件中声明的话，那么不能加public
	private int num;

	public void setNum(int num){
		num = num;//如果要给成员变量num赋值，=左边的num必须加this.
	}

	public void getNum(){//返回值类型不能是void，应该是int
		return num;
	}

	public void method(String str){
		System.out.println("str = " + str);
	}
}

class SubDemo extends Demo, Exam10{//Java只支持单继承，SubDemo只能同时继承一个父类
	
	@Override//表示重写
	public void method(int num){//如果method方法是重写，那么形参列表必须和上面一样
		System.out.println("num = " + num);
	}
}