package oo.day01;
//学生类的测试类
public class StudentTest {
	public static void main(String[] args) {
		//Student zs = new Student(); //编译错误，Student类没有无参构造方法
		Student zs = new Student("zhangsan",25,"LF");
		zs.sayHi();
	}
}
















