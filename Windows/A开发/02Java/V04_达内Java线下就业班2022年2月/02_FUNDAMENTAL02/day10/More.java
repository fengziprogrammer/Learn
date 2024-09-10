package oo.day10;
import java.util.Arrays;
//补充内容
public class More {
	public static void main(String[] args) {
		//int[] arr = {35,3,27,9,15};
		//System.out.println(Arrays.toString(arr)); //适合于基于类型数组的简便输出
		
		
		Student zs = new Student();
		zs.setName("zhangsan"); //赋值
		zs.setAge(25);
		System.out.println(zs.getName()); //取值
		System.out.println(zs.getAge());		
	}
}

class Student{ //get/set方法
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}














