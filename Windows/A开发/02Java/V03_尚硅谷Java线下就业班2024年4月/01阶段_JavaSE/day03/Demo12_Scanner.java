import java.util.Scanner;
class Demo12_Scanner {

	/*
		����:
		��ͨ������¼�����,��ȡ������Ϣ,�����������̨
		(����,����,�Ա�,���,���ص�)

		nextInt() ����ʹ��nextLine()   ��������
		�������
			1> ʹ�ò�ͬScanner  ���Ƽ�
			2> ͨ��nextLine()  String -> int  �Ƽ�
			3> ���еķ���  nextLine֮ǰ ��ʹ��nextLine()
	*/
	public static void main(String[] args) {

		// 1.����
		// 2.��������
		Scanner sc = new Scanner(System.in);

		// 3.ʹ�ö���
		System.out.println("�������������");
		String name = sc.nextLine();

		System.out.println("�������������");
		int age = sc.nextInt();

		//Scanner sc2 = new Scanner(System.in);
		sc.nextLine();
		System.out.println("����������Ա�");
		String sex = sc.nextLine();//ͨ���ָ��� �س�ʶ�� һ�����ݵĽ���

		System.out.println("������������cm");
		int heigh = sc.nextInt();

		System.out.println("�������������KG");
		double weigh = sc.nextDouble();
		System.out.println(name+ ","+ age+ ","+sex+ ","+heigh+ ","+weigh);


		// 4.�ͷ���Դ

		sc.close();
	}
}
