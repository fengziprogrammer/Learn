import java.util.Scanner;//����
class Demo10_Scanner {

	/*
		- ����
			��ʽ�� import java.util.Scanner; //��  �ļ�
			λ�ã���class���档
		- ��������¼�����
			��ʽ��Scanner sc = new Scanner(System.in);//��׼������
			new �ؼ��� ����һ�������������͵Ķ���
		- ͨ�������ȡ����
			��ʽ��int x = sc.nextInt();
		- �ͷ���Դ
			��ʽ:sc.close();
	*/
	public static void main(String[] args) {
		
		// ��������¼�����  
		// int   a = 10/;
		Scanner sc = new Scanner(System.in);
		
		// ͨ�������ȡ���� ͨ������¼����� ���Ի�ȡ����¼���һ������
		int x = sc.nextInt(); // = �ұ�  ��ȡ����¼���һ������
		System.out.println(x);

		sc.close();//�ͷ���Դ
	
	}


}
