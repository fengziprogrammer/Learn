package day04;
import java.util.Scanner;
//�ɼ��ȼ��ж�
public class ScoreLevel {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("������ɼ�:");
		double score = scan.nextDouble();
		
		//888, -56, 95, 85, 65, 45
		if(score<0 || score>100) {
			System.out.println("�ɼ����Ϸ�");
		}else if(score>=90) { //�Ϸ�
			System.out.println("A-����");
		}else if(score>=80) {
			System.out.println("B-����");
		}else if(score>=60) {
			System.out.println("C-�е�");
		}else {
			System.out.println("D-������");
		}
	}
}





















