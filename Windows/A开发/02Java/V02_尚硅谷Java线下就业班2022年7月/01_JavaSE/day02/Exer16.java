public class Exer16{
	public static void main(String[] args){
		int a = 3;
		int b = 2;
		int c = 1;
		
		/*
		˼·��
		��1���Ȱ�a��b�е����ֵ�ҳ������ŵ�һ��max������
		*/
		int max = a >= b ? a : b;
		
		//������������㣬�ܹ�ȷ������max��һ����a��b�нϴ���
		
		/*
		��2��ȷ��max��c˭���󣬸���ļ�������max��
		*/
		//int max = max >= c ? max : c;//���maxǰ���ڼ�int����ʾ�ظ�����
		max = max >= c ? max : c;
		//���max>=c������max������max�Լ���ֵ������max���޸�Ϊc��ֵ
		System.out.println("max = " + max);
		
		
	}
}