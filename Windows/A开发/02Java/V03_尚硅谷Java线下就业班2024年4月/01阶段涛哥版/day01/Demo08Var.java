public class Demo08Var{
	public static void main(String[] args){
		//byte
		byte num1 = 100;
		num1 = 101;
		//num1 = 200;������byte��ȡֵ��Χ��
		System.out.println(num1);
		
		//short
		short num2 = 100;
		System.out.println(num2);
		
		//int ����Ĭ������
		int num3 = 100000000;
		System.out.println(num3);
		
		/*
		  long ����long�͵ı���,ϰ������ֵ�ú������L����l
		  ������L
		*/
		long num4 = 100000000L;
		System.out.println(num4);
		
		/*
		  float ����float�͵ı���,����С�������F����f
		  ������F
		*/
		float num5 = 2.5F;
		System.out.println(num5);
		
		/*
		  double
		*/
		double num6 = 2.5;
		System.out.println(num6);
		
		/*
		  char �����ַ�����
		*/
		char num7 = '��';
		System.out.println(num7);
		
		/*
		  boolean
		  true false
		*/
		
		boolean num8 = true;
		boolean num9 = false;
		System.out.println(num8);
		System.out.println(num9);
		
		/*
		  num9�������false
		  �൱�ڽ�num9��false��ֵ���˱���num8,��ʱnum8��true��������,�����num9��false��
		*/
	    num8 = num9;
		System.out.println(num8);
		
		/*
		  String �ַ���
		*/
		String s = "atguigu";
		s = "taoge";
		System.out.println(s);
	}
}