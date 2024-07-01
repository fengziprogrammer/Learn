/*
1�������������
�ӣ�+
	�����String���룬+�ͱ����ƴ�ӡ�
	���������ʾ��͡�
����-
�ˣ�*
����/
	�����������������ֻ���������֡�
	������������������Ϊ0���ᷢ��ArithmeticException�����쳣
	�����С�����������Ϊ0���õ�Infinity�������
ģ/ȡ�ࣺ%
	ģ�Ľ����������ֻ��������/��ģ����
	���������ȡģ������Ϊ0���ᷢ��ArithmeticException�����쳣
	�����С��ȡģ������Ϊ0���õ�NaN(Not a Number������)

���ţ�+
���ţ�-
	
������++
	����������1
�Լ���--
	����������1
	
	����������Լ����ʽ�Ƕ����ģ�ֱ�Ӽ�;����䣬��ô++/--��ǰ�ں�û������
	����������Լ����ʽ�����������һ���֣���ô++/--��ǰ�ں�������
		������Ϊ��
		++��ǰ����������������1��Ȼ��ȡ������������ֵ������������
		++�ں���ȡ������������ֵ�����ڲ�����ջ����ʱ�洢�ط�����Ȼ��������������1��ȡ���ڲ�����ջ��ֵ������������

Arithmetic������
Operator�������

*/
public class ArithmeticOperator{
	public static void main(String[] args){
		int x = 1;
		int y = 2;
		System.out.println(x/y);//0
		
		//System.out.println(x/0);//java.lang.ArithmeticException: / by zero
		System.out.println(1.0/0.0); //Infinity
		System.out.println("------------------------");
		
		System.out.println(5%2);//1
		System.out.println(2%5);//2
		System.out.println("------------------------");
		
		System.out.println(5%2);//1
		System.out.println(5%-2);//1  ��-2������1
		System.out.println(-5%2);//-1 ��-2��������-1
		System.out.println(-5%-2);//-1 ��2��������-1
		//��*���� + ���� = ������
		
		System.out.println("------------------------");
		//System.out.println(5%0);java.lang.ArithmeticException: / by zero
		System.out.println(5.6%1.2);//0.7999999999999998 ����ֵ
		System.out.println(5.6%0.0);//NaN
		
		System.out.println("------------------------");
		int a = -1;
		int b = +a;
		int c = -b;
		System.out.println(a);//-1
		System.out.println(b);//-1
		System.out.println(c);//+1
		
		System.out.println("------------------------");
		int i = 1;
		i++;
		System.out.println("i=" + i);//i=2
		++i;
		System.out.println("i=" + i);//i=3
		
		System.out.println("------------------------");
		int j= 1;
		System.out.println(j++);//1
		/*
		��1����ȡj��ֵ��������1���ŵ�������ջ��
		��2��Ȼ��j������j=2
		��3��ȡ������ջ�е�ֵ�����
		*/
		
		System.out.println(++j);//3
		/*
		��1���ȶ�j������j=3
		��2��Ȼ��ȡj��ֵ���ŵ�������ջ��
		��3��ȡ������ջ�е�ֵ�����
		*/
		
		System.out.println("------------------------");
		int m = 1;
		m = ++m;
		System.out.println("m = " + m);//2
		/*
		˵������ֵ��������
		�����ұ� ++m
		(1)�ȶ�m����������m =2
		(2)ȡ��m��ֵ���ŵ�������ջ��
		(3)�Ѳ�����ջ��ֵ�����¸�ֵ��m
		*/
		
		m = m++;
		System.out.println("m = " + m);//2
		/*
		˵������ֵ��������
		�����ұ� m++
		(1)��ȡ��m��ֵ 2���ŵ�������ջ��
		(2)�����Ŷ�m����������m = 3
		(3)�Ѳ�����ջ��ֵ2 �����¸�ֵ��m
		*/
		
	}
}