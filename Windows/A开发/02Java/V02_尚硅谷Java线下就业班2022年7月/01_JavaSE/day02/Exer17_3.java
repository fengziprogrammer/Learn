public class Exer17_3{
	public static void main(String[] args){
		int m = 1;
		int n = 2;
		
		System.out.println("����֮ǰ��");
		System.out.println("m = " + m);
		System.out.println("n = " + n);
		/*
		��ʽ����������ټ�
		�з��գ���m��n��ֵ�Ƚϴ󣬻���������ݾʹ���
		m+n����int��Χ�������⡣
		*/
		m = m + n;//�µ�m = �ɵ�m + �ɵ�n
		n = m - n;//�µ�n = �µ�m - �ɵ�n = �ɵ�m + �ɵ�n - �ɵ�n = �ɵ�m
		m = m - n;//���µ�m =�µ�m -�µ�n = �ɵ�m + �ɵ�n - �ɵ�m = �ɵ�n
		
		System.out.println("����֮��");
		System.out.println("m = " + m);
		System.out.println("n = " + n);
	}
}