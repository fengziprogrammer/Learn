public class Exer17_2{
	public static void main(String[] args){
		int m = 1;
		int n = 2;
		
		System.out.println("����֮ǰ��");
		System.out.println("m = " + m);
		System.out.println("n = " + n);
		/*
		��ʽ����ʹ�ð�λ��������
		�������Ϳ���
		*/
		m = m ^ n;//m����ֵ = �ɵ�m ^ �ɵ�n
		n = m ^ n;//n����ֵ = m����ֵ ^ �ɵ�n = �ɵ�m ^ �ɵ�n ^ �ɵ�n = �ɵ�m;
		m = m ^ n;//m�ĸ���ֵ = m����ֵ ^ �µ�n = �ɵ�m ^ �ɵ�n ^ �ɵ�m =�ɵ�n; 
		
		System.out.println("����֮��");
		System.out.println("m = " + m);
		System.out.println("n = " + n);
	}
}