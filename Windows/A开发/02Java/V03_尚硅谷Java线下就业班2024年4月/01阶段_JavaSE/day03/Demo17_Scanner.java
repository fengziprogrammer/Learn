import java.util.Scanner;
class Demo17_Scanner {

	/*
		Scanner ʹ�������׳��ֵ�С����
		������� 
		1> ʹ������Scanenr
		2> ͨ��nextLine() -> int

	*/

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("�������һ������");
		String line = sc.nextLine();
		int a = Integer.valueOf(line);

		//Scanner sc2 = new Scanner(System.in);
		System.out.println("������ڶ�������");		
		String b = sc2.nextLine();//""
		System.out.println(a+"," +b + "*****");

		sc.close();
	}
}
