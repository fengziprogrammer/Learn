public class Demo04Var{
	public static void main(String[] args){
		int i = 10;
		System.out.println(i);
		
		//int j;// jû�б���ʼ��,����ֱ��ʹ��
		//System.out.println(j);
		
		//int i = 20;  ���������ǰ����������������,�������¶���
		
		i = 20;//������ǰ��û��ָ��������������,���������¶���,�����ٴθ�ֵ
		System.out.println(i);
		
		{
			int k = 100;
			System.out.println(k);
			System.out.println(i);//��С����������ֱ�ӷ��ʴ��������е�����
		}
		
		//System.out.println(k);�ڴ��������в���ֱ�ӷ���С�������е�����
	}
}