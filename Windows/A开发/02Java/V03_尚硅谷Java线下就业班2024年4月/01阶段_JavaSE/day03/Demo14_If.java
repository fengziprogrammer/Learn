class Demo14_If {

	/*
		if
		��һ�ָ�ʽ
			if(��ϵ���ʽ){
				// if�������
			}

			ִ��˳��
				1> ��ϵ���ʽ --> ���
				2> �����true --> if�������
		�ڶ��ָ�ʽ
			if(��ϵ���ʽ){
				// true --> if�������
			}else{// �������������� false
				// falseִ�е�����
			}
		�����ָ�ʽ
			if(��ϵ���ʽ1){
				// true --> if�������
			}else if(��ϵ���ʽ2){//�����ϵ���ʽ1������,
				//�����Ͻ����ٴ�����ɸѡ�ж�
					//
			}else if(��ϵ���ʽ3){// 1 2 �������� ɸѡ3
					//
			}
			...
			else{// �������������� false
				// falseִ�е�����
			}
		
		�ɼ�
		90-100  ��
		80-90  ��
		60-80  ��

		<60   ������

	*/
	public static void main(String[] args) {

		int a = 10;
		if(a > 0){
			System.out.println("��������0");// 
		}

		if(a > 0){
			System.out.println("��������0");// 
		}else{
			System.out.println("����С�ڵ���0");	
		}

		
	}
}
