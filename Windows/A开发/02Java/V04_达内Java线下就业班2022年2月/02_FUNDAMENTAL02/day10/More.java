package oo.day10;
import java.util.Arrays;
//��������
public class More {
	public static void main(String[] args) {
		//int[] arr = {35,3,27,9,15};
		//System.out.println(Arrays.toString(arr)); //�ʺ��ڻ�����������ļ�����
		
		
		Student zs = new Student();
		zs.setName("zhangsan"); //��ֵ
		zs.setAge(25);
		System.out.println(zs.getName()); //ȡֵ
		System.out.println(zs.getAge());		
	}
}

class Student{ //get/set����
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














