public class Exer15_2{
	public static void main (String []  args)  {
		boolean x = true;
		boolean y = false;
		short z = 42;
		/*
		if(y=true)
		if((z++==42)&&(y==true))	z++;
		if((x=false) || (++z==45))  z++;*/
		
		//�����������y=true��ֵ���� ���if(true),����y���޸�Ϊtrue
		if(y=true){
			/*
			(1)z++����ȡz��ֵ42���ŵ�������ջ�У�Ȼ��z����Ϊ43
			(2)�ж�== 42==42����
			(3)&&��û�������·���ұ߼���
			(4)y==true����������
			(5)&&  true && true������
			*/
			if((z++==42)&&(y==true)){//if(true)
				z++;//ִ�� z = 44
			}
		}
		/*
		(1)x=false,��Ȼ�Ǹ�ֵ��false
		(2)|| ��û�������·���ұ߼���
		(3)++z��z������Ϊ45��ȡ45
		(4)�ж� 45==45����
		(5)||  false || true�����Ϊtrue
		*/
		if((x=false) || (++z==45)){//if(true)
			z++;//ִ�� z = 46
		}

		System.out.println("z="+z);//z=46
	}
}