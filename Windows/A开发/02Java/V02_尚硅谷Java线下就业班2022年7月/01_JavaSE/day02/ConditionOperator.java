/*

4�����������
�������ʽ ? ������ʽ1 : ������ʽ2

�������ʽ���Ϊtrue����������������ı��ʽȡ������ʽ1��ֵ������ȡ���ʽ2��ֵ��
*/

public class ConditionOperator{
	public static void main(String[] args){
		//�ж���������a,b˭�󣬰Ѵ�ı�����ֵ��max
		int a = 2;
		int b = 2;
		int max = a >= b ? a : b;
		//���a>=b��������ȡa��ֵ����max������ȡb��ֵ����max
		System.out.println(max);
		
		boolean marry = false;
		System.out.println(marry ? "�ѻ�" : "δ��"  );
	}
}