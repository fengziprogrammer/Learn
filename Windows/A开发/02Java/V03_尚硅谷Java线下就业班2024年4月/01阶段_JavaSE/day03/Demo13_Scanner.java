import java.util.Scanner;
class Demo13_Scanner {

	/*
		next()��nextLine()�����ַ����ݵ�����
		next()������
			�����ո�ȿհ׷�������Ϊ�������
		nextLine()������
			�����س����У�����Ϊ�������
	*/
	public static void main(String[] args) {

		// 2.��������
		Scanner sc = new Scanner(System.in);

		// 3.ʹ�ö���
		System.out.println("������һ������");
		//String line = sc.nextLine(); // ����aaa  bb(aaa�ո�ո�bb) ���aaa  bb
		String line = sc.next();// ����aaa  bb(aaa�ո�ո�bb) ���aaa

		System.out.println(line);
	}
}
