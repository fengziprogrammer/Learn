import java.util.Scanner;
class Demo11 {

	/*
		����: ����¼����������
			1> ����  class  import java.util.Scanner
			2> ��������
			3> ʹ�ö���
			4> �ͷ���Դ
		������ֵ
	*/
	public static void main(String[] args) {

		//1> ����  class  import java.util.Scanner
		//2> ��������
		Scanner sc = new Scanner(System.in);

		//3> ʹ�ö��� ���һ������ ��ֵΪnum1
		System.out.println("�������һ������:");
		int num1 = sc.nextInt();

		System.out.println("������ڶ�������:");
		int num2 = sc.nextInt();
		System.out.println(num1 +"," +num2);

		//������ֵ
		int max = (num1 > num2)? num1 : num2;
		System.out.println("���������������ֵ:" + max);

		//4> �ͷ���Դ
		sc.close();

		
	}
}
