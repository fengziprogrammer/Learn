package day05;
//forѭ������ʾ
public class ForDemo {
	public static void main(String[] args) {
		//���9�ĳ˷���ֻҪȡ��3����0��
		for(int num=1;num<=9;num++) {
			if(num%3!=0) {
				System.out.println(num+"*9="+num*9);
			}
		}
		
		//���9�ĳ˷�������ȡ��3��0��
		for(int num=1;num<=9;num++) {
			if(num%3==0) {
				continue; //����ѭ������ʣ������������һ��ѭ��(ȥnum++)
			}
			System.out.println(num+"*9="+num*9);
		}
		/*
		 * num=1  1*9=9
		 * num=2  2*9=18
		 * num=3  
		 * num=4  4*9=36
		 * num=5  5*9=45
		 * num=6  
		 * num=7  7*9=63
		 * num=8  8*9=72
		 * num=9 
		 * num=10  
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		for(int num=1;num<=9;num++) {
			if(num==5) {
				break; //��ĳ���ض��������£���ǰ����ѭ��
			}
			System.out.println(num+"*9="+num*9);
		}
		*/
		/*
		 * num=1  1*9=9
		 * num=2  2*9=18
		 * num=3  3*9=27
		 * num=4  4*9=36
		 * num=5  
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		int num=1;
		for(;num<=9;num++) {
			System.out.println(num+"*9="+num*9);
		}
		*/
		/*
		for(int num=1;num<=9;) {
			System.out.println(num+"*9="+num*9);
			num++;
		}
		*/
		/*
		for(;;) { //��ѭ��
			System.out.println("��Ҫѧϰ...");
		}
		*/
		/*
		for(int i=1,j=5;i<=5;i+=2,j-=2) {
		}
		*/
		/*
		 * i=1,j=5
		 * i=3,j=3
		 * i=5,j=1
		 * i=7,j=-1
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		//1)���10��"�ж��ǳɹ��Ľ���":
		for(int times=0;times<10;times++) {
			System.out.println("�ж��ǳɹ��Ľ���");
		}
		*/
		/*
		//2)���9�ĳ˷���:
		for(int num=1;num<=9;num++) {
			System.out.println(num+"*9="+num*9);
		}
		*/
		/* ִ�й���:
		 * num=1  true  1*9=9
		 * num=2  true  2*9=18
		 * num=3  true  3*9=27
		 * num=4  true  4*9=36
		 * num=5/6/7/8...
		 * num=9  true  9*9=81
		 * num=10 false forѭ������
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * 3.for�ṹ:
		 *   1)�﷨:
		 *             1      2        3
		 *       for(Ҫ��1 ; Ҫ��2 ; Ҫ��3){
		 *         ����/ѭ����--------------����ִ�еĴ���  4
		 *       }
		 *   2)ִ�й���:
		 *       1243243243243243...2
		 */
	}
}


















