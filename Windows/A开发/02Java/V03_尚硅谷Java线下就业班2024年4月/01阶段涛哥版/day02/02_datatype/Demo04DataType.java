public class Demo04DataType{
	public static void main(String[] args){
		byte num1 = 100;//�Ⱥ��ұ���һ��ֵ,��������Χ,���ᱨ��,jvm�Զ�ǿת
		System.out.println(num1);
		
		byte num2 = (byte)200;//���������Χ,��Ҫ�����Լ�ǿת
		System.out.println(num2);
		
		byte num3 = 10+1;
		System.out.println(num3);
		
		byte num4 = 1;
		
		/*
		  byte = byte+int
		  byte = int+int -> ��Ҫ�ֶ�ת
		*/
		byte num5 = (byte)(num4+1);
		System.out.println(num5);
		
		System.out.println("=====================");
		
		char num6 = '0';
		System.out.println(num6+0);
		
		System.out.println('��'+0);//20013
		
		int num7 = '��';
		System.out.println(num7);
	}
}