public class Demo01DataType{
	public static void main(String[] args){
		/*
		  100Ĭ������Ϊint
		  num1����Ϊlong
		  ��100��ֵ��long�͵�num1,�൱��ȡֵ��ΧС���������͸�ֵ����ȡֵ��Χ�����������
		  �������Զ�����ת��
		*/
		long num1 = 100;
		System.out.println(num1);
		
		
		/*
		  2Ĭ������Ϊint
		  num2����Ϊdouble
		  ��2��ֵ����double�͵�num2,�൱�ڽ�ȡֵ��ΧС���������͸�ֵ����ȡֵ��Χ�����������
		  �������Զ�����ת��
		*/
		double num2 = 2;
		System.out.println(num2);
		
		int num3 = 10;
		double num4 = 2.5;
		
		/*
		  double  = int+double
		  
		  double = double+double
		  
		  С���ͺʹ�����������,С���ͻ��Զ�����Ϊ������
		*/
		double sum = num3+num4;
		System.out.println(sum);
		
	}
}