class Demo15_If {

	/*
	�ɼ�
		90-100  ��  [90,100]
		80-90  ��   [80,90)
		60-80  ��   [60,80)
		<60   ������

		 else if ����������������е��ٴ�ɸѡ
		 else    ����������������

		 // ���ϰ�� 
		 1.����˼·дע��  
		 2.��д�߲���
		 3.��ɹ���  ˳��1> ��ȷ���� 2> ��Ե���� 3>��������
	*/
	public static void main(String[] args) {

		int num = 99;

		// �Ƿ������ݵ��ų�
		/*if((num <= 0) || num > 100 ){
			System.out.println("�Ƿ�����");
		}else if( (num >= 90)&& (num <=100)){
			System.out.println("��");
		}else if((num >= 80) && (num < 90)){
			System.out.println("��");
		}else if((num >= 60) && (num < 80)){
			System.out.println("��");
		}else{// ����������������
			System.out.println("������");
		}*/

		// �Ż���Ĵ���
		if((num <= 0) || num > 100 ){
			System.out.println("�Ƿ�����");
		}else if( num >= 90){
			System.out.println("��");
		}else if(num >= 80){
			System.out.println("��");
		}else if(num >= 60){
			System.out.println("��");
		}else{// ����������������
			System.out.println("������");
		}

		
	}
}
