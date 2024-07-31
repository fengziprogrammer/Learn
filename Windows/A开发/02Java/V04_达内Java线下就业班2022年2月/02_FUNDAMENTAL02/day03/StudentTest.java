package oo.day03;
//学生类的测试类
public class StudentTest {
	public static void main(String[] args) {
		Student[] stus = new Student[3];
		stus[0] = new Student("zs",25,"LF");
		stus[1] = new Student("ls",26,"JMS");
		stus[2] = new Student("ww",24,"SD");
		
		System.out.println(stus[0].name); //输出第1个学生的名字
		stus[1].age = 28; //修改第2个学生的年龄为28
	    stus[2].sayHi(); //第3个学生跟大家问好
	    for(int i=0;i<stus.length;i++) { //遍历所有学生
	    	System.out.println(stus[i].name); //输出每个学生的名字
	    	stus[i].sayHi(); //每个学生跟大家问好
	    }
	    
	}
}
















