public class Exer15_1{
	public static void main(String[] args){
		boolean x = true;
		boolean y = false;
		short z = 42;
		
		//if((z++==42)&&(y==true))	z++;
		//if((x=false) || (++z==45))  z++;
		
		/*
		(1)z++����ȡz��ֵ42���ŵ�������ջ��z����Ϊ43
		(2)�ж�==  42==42�����true
		(3)&&�������true���ұ߼�������û�������·������
		(4) y==true��������false
		(5)��&& true && false�������false
		*/
		if((z++==42)&&(y==true)){//if(false)������
			z++;//��ִ��
		}
		/*
		(1)x=false���Ǹ�ֵ���������ʽ�����false
		(2)|| �����false,�ұ߼�������û�������·������
		(3)++z��z������Ϊ44��Ȼ��ȡ44
		(4)�ж�==  44==45������false
		(5)false || false�������false
		*/
		if((x=false) || (++z==45)){//if(false)
			z++;//��ִ��
		}

		System. out.println("z="+z);//44
	}
}