package oo.day01;
//ѧ����
public class Student { 
	//��Ա����
	String name;
	int age;
	String address;
	//���췽��
	Student(String name,int age,String address){
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	//����
	void study() {
		System.out.println(name+"��ѧϰ...");
	}
	void sayHi() {
		System.out.println("��Һã��ҽ�"+name+"������"+age+"���ˣ���ס"+address);
	}
}
















