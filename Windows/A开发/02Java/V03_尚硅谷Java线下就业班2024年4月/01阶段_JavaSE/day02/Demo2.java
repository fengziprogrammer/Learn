class Demo2 {

	/*
	������������(�ص�)
		���� 8��
			������
				byte 1���ֽ�   -128  127
				short 2���ֽ�
				int 4���ֽ�     Ĭ��
				long 8���ֽ�

				long ����ʱ һ������� ���l/L
			������
				float double
			�ַ���
				char
			������	
				boolean
	*/
	public static void main(String[] args) {

		byte b = 3;// ����byte���͵ı��� ������b ��ֵΪ3
		System.out.println(b);//

		//byte b2 = 300;
		//System.out.println(b2);//����,300������byte��ȡֵ��Χ

		short s = 300;
		System.out.println(s);

		int i = 300;
		System.out.println(i);

		long l = 80000000000000L;
		System.out.println(l);
	}
}
