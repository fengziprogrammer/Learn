class Demo7 {

	/*
		�Զ�ת��(��ʽת��)
			1> byte short char --> int
			2> С�����Ĳ�������  С -> ��
		ǿ��ת��(��ʽת��)
			��Ҫ��ȡֵ��Χ���ֵ -> ȡֵ��ΧС��ֵ
			��ʽ
			Ŀ����������  ������ = (Ŀ����������)ת����ֵ;

		ע��
			ȡֵ��Χ
			byte  -128  127
			������ȡֵ��Χ��ǿת,���ܻ�õ����벻���Ľ��
	*/
	public static void main(String[] args) {
		
		

		short s1 = 3;
		//short s2 = s1 + 5;//?
		int i = 10;
		long l = 88;

		// s1 �Զ� -> int -> long
		// i  int -> long
		long l2 = s1 + i + l;
		int i2 = (int)(s1 + i + l);
		
		System.out.println(i2);// 8
		System.out.println("-------------------");

		byte b1 = 127;
		byte b2 = 3;

		// byte  = int 3 + int 4;
		byte b3 = (byte)(b1 + b2);
		System.out.println(b3);//128
		
	}
}
