package day03;
//if...else�ṹ����ʾ
public class IfElseDemo {
	public static void main(String[] args) {
		//1)������ż�����ж�:
		int num = 6; //6, 5 
		if(num%2==0) {
			System.out.println(num+"��ż��");
		}else {
			System.out.println(num+"������");
		}
		
		//2)��500��8�ۣ�����500��9��:
		double price = 300.0; //���ѽ�� 600.0,300.0
		if(price>=500) { //��500
			price*=0.8; //��8��
		}else { //����500
			price*=0.9; //��9��
		}
		System.out.println("�������ѽ��Ϊ:"+price);
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * 2.if...else�ṹ: 2��·
		 *   1)�﷨:
		 *       if(boolean){
		 *         ����1
		 *       }else{
		 *         ����2
		 *       }
		 *   2)ִ�й���:
		 *       �ж�boolean��ֵ:
		 *         ��Ϊtrue����ִ������1(��������)
		 *         ��Ϊfalse����ִ������2(��������)
		 *   3)˵��:
		 *       ����1������2����������֮һ
		 */
	}
}














