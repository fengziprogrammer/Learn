package oo.day03;
//ѧ����
public class Student { 
	String name;
	int age;
	String address;
	Student(String name,int age,String address){
		this.name = name;
		this.age = age;
		this.address = address;
	}

	void study() {
		System.out.println(name+"��ѧϰ...");
	}
	void sayHi() {
		System.out.println("��Һã��ҽ�"+name+"������"+age+"���ˣ���ס"+address);
	}
}
















