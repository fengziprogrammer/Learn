package day04;
import java.util.Scanner;
//�����������
public class CommandBySwitch {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("��ѡ����: 1.���  2.ȡ��  3.��ѯ���  4.�˿�");
		int command = scan.nextInt();
		
		switch(command) {
		case 1: 
			System.out.println("���");
			break;
		case 2:
			System.out.println("ȡ��");
			break;
		case 3:
			System.out.println("��ѯ���");
			break;
		case 4:
			System.out.println("�˿��ɹ�");
			break;
		default:
			System.out.println("�������");
		}
	}
}




















