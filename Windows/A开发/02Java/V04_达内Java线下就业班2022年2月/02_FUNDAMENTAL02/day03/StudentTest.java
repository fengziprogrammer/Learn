package oo.day03;
//ѧ����Ĳ�����
public class StudentTest {
	public static void main(String[] args) {
		Student[] stus = new Student[3];
		stus[0] = new Student("zs",25,"LF");
		stus[1] = new Student("ls",26,"JMS");
		stus[2] = new Student("ww",24,"SD");
		
		System.out.println(stus[0].name); //�����1��ѧ��������
		stus[1].age = 28; //�޸ĵ�2��ѧ��������Ϊ28
	    stus[2].sayHi(); //��3��ѧ��������ʺ�
	    for(int i=0;i<stus.length;i++) { //��������ѧ��
	    	System.out.println(stus[i].name); //���ÿ��ѧ��������
	    	stus[i].sayHi(); //ÿ��ѧ��������ʺ�
	    }
	    
	}
}
















