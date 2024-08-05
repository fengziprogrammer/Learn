package oo.day04;
public class Test {
	public static void main(String[] args) {
		Person[] ps = new Person[5];
		ps[0] = new Student("zhangsan",25,"LF","111"); //��������
		ps[1] = new Student("lisi",26,"JMS","222");
		ps[2] = new Teacher("wangwu",37,"SD",8000.0);
		ps[3] = new Teacher("zhaoliu",45,"SX",20000.0);
		ps[4] = new Doctor("sunqi",29,"LF","����ҽʦ");
		for(int i=0;i<ps.length;i++) {
			ps[i].sayHi();
		}
		
		//��д����������ʱ�������������
		Student zs = new Student("zhangsan",25,"LF","111");
		Person pp = new Student("zhangsan",25,"LF","111");
		zs.sayHi(); //������Student���
		pp.sayHi(); //������Student���
	}
}

class Person{
	String name;
	int age;
	String address;
	Person(String name,int age,String address){
		this.name = name;
		this.age = age;
		this.address = address;
	}
	void sayHi() {
		System.out.println("��Һã��ҽ�"+name+"������"+age+"���ˣ���ס"+address);
	}
}
class Student extends Person{
	String stuId; //ѧ��
	Student(String name,int age,String address,String stuId){
		super(name,age,address);
		this.stuId = stuId;
	}
	void sayHi() {
		System.out.println("��Һã��ҽ�"+name+"������"+age+"���ˣ���ס"+address+"��ѧ��Ϊ:"+stuId);
	}
}
class Teacher extends Person{
	double salary; //����
	Teacher(String name,int age,String address,double salary){
		super(name,age,address);
		this.salary = salary;
	}
	void sayHi() {
		System.out.println("��Һã��ҽ�"+name+"������"+age+"���ˣ���ס"+address+"������Ϊ:"+salary);
	}
}
class Doctor extends Person{
	String level; //ְ��
	Doctor(String name,int age,String address,String level){
		super(name,age,address);
		this.level = level;
	}
}





















