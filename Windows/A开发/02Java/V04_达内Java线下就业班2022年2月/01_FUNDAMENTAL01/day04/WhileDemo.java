package day04;
//while�ṹ����ʾ
public class WhileDemo {
	public static void main(String[] args) {
		//2)���9�ĳ˷���:
		int num = 1;       
		while(num<=9) {
			System.out.println(num+"*9="+num*9);
			num++;
		}
		
		//1)���10��"�ж��ǳɹ��Ľ���":
		int times = 0;    //1)ѭ�������ĳ�ʼ��
		while(times<10) { //2)ѭ��������
			System.out.println("�ж��ǳɹ��Ľ���");
			times++;      //3)ѭ�������ĸı�
		}
		System.out.println("over");
		/*
		 * ִ�й���:
		 *             times=0
		 * true  ���    times=1
		 * true  ���    times=2
		 * true  ���    times=3
		 * ...         times=4/5/6/7/8
		 * true  ���     times=9
		 * true  ���     times=10
		 * false whileѭ������
		 * ���over
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * 1.while�ṹ:
		 *   1)�﷨:
		 *       while(boolean){
		 *         ����-------------����ִ�еĴ���
		 *       }
		 *   2)ִ�й���:
		 *       �ж�boolean��ֵ����Ϊtrue��ִ�����飬
		 *       ���ж�boolean��ֵ����Ϊtrue����ִ�����飬
		 *       ���ж�boolean��ֵ����Ϊtrue����ִ�����飬
		 *       �Դ����ƣ�ֱ��boolean��ֵΪfalseʱ��whileѭ������
		 */
	}
}


















