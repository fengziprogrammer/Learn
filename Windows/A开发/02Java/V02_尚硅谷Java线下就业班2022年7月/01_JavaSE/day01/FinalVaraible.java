/*
����ı���������ĳ�����
	ͨ����Ϊ���ձ�������
	
���ĳ��������ֵ���������޸ģ���ô���԰ѱ�������Ϊfinal��
*/
public class FinalVaraible{
	public static void main(String[] args){
		/*
		����������100��
		С����������
		С��˱����ֵ�1��
		С֣����һ���
		
		���ִ��ˣ�Ҫ����Ϊ150�����������ôд����Ҫ�޸�4���ط�
		*/
		/*
		int max = 100;
		int wang = 100;
		int li = 100-1;
		int zheng = 100/2;
		
		System.out.println("���֣�" + max);
		System.out.println("С����" + wang);
		System.out.println("С�" + li);
		System.out.println("С֣��" + zheng);*/
		
		final int MAX = 150;
		//MAX = 100;//����
		int wang = MAX;
		int li = MAX-1;
		int zheng = MAX/2;
		
		System.out.println("���֣�" + MAX);
		System.out.println("С����" + wang);
		System.out.println("С�" + li);
		System.out.println("С֣��" + zheng);
	}
}