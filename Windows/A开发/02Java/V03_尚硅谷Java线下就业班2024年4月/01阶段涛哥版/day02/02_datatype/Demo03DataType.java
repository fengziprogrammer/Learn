public class Demo03DataType{
	public static void main(String[] args){
		//������ʧ
		int num1 = (int)2.9;
		System.out.println(num1);
		
		//�������
		
		/*
		  intռ�ڴ�4���ֽ�-> һ���ֽ���8��������λ  -> 32λ������
		  
		  100��:36λ������
		  
		  ��36λ�����Ƶ�100��ǿ�Ƹ�ֵ������ܴ�32λ�����Ƶ�int�ͱ���
		  �����4λ,�������,�ɵ�ǰ4λ
		*/
		int num2 = (int)10000000000L;
		System.out.println(num2);//1410065408
	}
}