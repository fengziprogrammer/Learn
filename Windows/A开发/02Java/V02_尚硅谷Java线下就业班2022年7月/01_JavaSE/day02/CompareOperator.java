/*
2���Ƚ������/��ϵ�����
���ڣ�>
С�ڣ�<
���ڵ��ڣ�>=
С�ڵ��ڣ�<=
���ڣ�==
�����ڣ�!=

Compare���Ƚ�
Operator�������

ע�⣺
��1���Ƚ����������Ľ��ֻ�����֣�true/false
���ԱȽϱ��ʽͨ��������Ϊ�ж�������ʹ��

��2������ ==�Ǳ�ʾ�жϣ� =�Ǳ�ʾ��ֵ�����׻���
*/
public class CompareOperator{
	public static void main(String[] args){
		int a = 1;
		int b = 2;
		System.out.println(a < b);//true
		System.out.println(a >= b);//false
		System.out.println(a == b);//false
		
		boolean flag = false;
		//System.out.println(flag = true);//true  =�Ǹ�ֵ����true��ֵ��flag��Ȼ����ʾ����ֵ
		System.out.println(flag == true);//false
		
		if(flag == true){//if(false)����ʾ����������
			System.out.println("��������");
		}
		
		if(flag = true){//��ֵ if(true)
			System.out.println("�й���Ұ���");
		}
		
		//if(a = 1){//�����С��д���ˣ����뱨��  a = 1�Ǹ�ֵ�������1��if(1)�Ǵ����
		//	System.out.println("�й���Ұ���");
		//}
	}
}