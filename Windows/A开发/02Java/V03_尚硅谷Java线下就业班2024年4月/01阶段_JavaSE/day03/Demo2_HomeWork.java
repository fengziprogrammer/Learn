class Demo2_HomeWork {

	/*
		����һ����λ��,�ֱ������Ӧ�ĸ���λ����
		��1234,�����λ->4,ʮλ->3,��λ->2,ǧλ->1

		����˼·
			1.1234   ��λ ->   ֵ % 10  �� 123 ��4
			2.�� 123 ���õ�4  ��һ�� ֵ / 10 --> 123  % 10 -> 3
			3.��������

	*/
	public static void main(String[] args) {

		int num = 5678;

		int ge = num  / 1 % 10;
		int shi = num / 10 % 10;
		int bai = num / 100 % 10;
		int qian = num / 1000 % 10;

		System.out.println("��ǰ�����λ��,��λ:" + ge + ",ʮλ" 
				+ shi + ",��λ" + bai + ",ǧλ��" + qian );
	}
}
