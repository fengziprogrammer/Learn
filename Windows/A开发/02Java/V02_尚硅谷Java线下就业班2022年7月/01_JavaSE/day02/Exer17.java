public class Exer17{
	public static void main(String[] args){
		int m = 1;
		int n = 2;
		
		System.out.println("����֮ǰ��");
		System.out.println("m = " + m);
		System.out.println("n = " + n);
		/*
		��ʽһ���������գ���ͨ�ã��������������͵ı���������
		����������������������
		*/
		int temp = m;//��m��ֵ���ݵ�temp��
		m = n;//��n��ֵ��ֵ��m��m��ֵ�����ǵ�����Ϊ�����ˣ����Ը���û����
		n = temp;//�ѱ��ݵ�mֵ���ŵ���n��
		
		System.out.println("����֮��");
		System.out.println("m = " + m);
		System.out.println("n = " + n);
	}
}