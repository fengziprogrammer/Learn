package day04;
import java.util.Scanner;
//������С��Ϸ
public class Guessing {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = (int)(Math.random()*1000+1); //1��1000֮�ڵ������
		System.out.println(num); //����
		
		//num=250
		//300(��),200(С),250(��)
		int guess;
		do {         //��ϰ-------------------5:20����
			System.out.println("�°�!");
			guess = scan.nextInt();  //1+3
			if(guess>num) {
				System.out.println("̫����");
			}else if(guess<num) {
				System.out.println("̫С��");
			}else {
				System.out.println("��ϲ��¶���!");
			}
		}while(guess!=num); //2
		
		
		
		
		/*
		//300(��), 200(С), 250(��)
		System.out.println("�°�!");
		int guess = scan.nextInt(); //1.
		while(guess!=num) { //2.
			if(guess>num) {
				System.out.println("̫����");
			}else {
				System.out.println("̫С��");
			}
			System.out.println("�°�!");
			guess = scan.nextInt(); //3.
		}
		System.out.println("��ϲ��¶���!");
		*/
		
	}
}































