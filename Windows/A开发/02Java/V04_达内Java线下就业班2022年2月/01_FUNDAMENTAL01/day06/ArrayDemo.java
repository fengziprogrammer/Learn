package day06;
import java.util.Arrays;
//�������ʾ
public class ArrayDemo {
	public static void main(String[] args) {
		int[] arr = new int[10];
		for(int i=0;i<arr.length;i++) {
			arr[i] = (int)(Math.random()*100);
			System.out.println(arr[i]);
		}
		Arrays.sort(arr); //����
		System.out.println("�����:");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		//7)����ĸ���:
		int[] a = {10,20,30,40,50};
		//���������(������һ�������µ����鲢��Դ�������ݸ��ƽ�ȥ)
		a = Arrays.copyOf(a,a.length+1);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		*/
		/*
		int[] a = {10,20,30,40,50};
		//a:Դ����
		//b:Ŀ������
		//6:Ŀ������ĳ���(Ԫ�ظ���)
		//  --��Ŀ�����鳤�ȴ���Դ���鳤�ȣ���ĩβ��Ĭ��ֵ
		//  --��Ŀ�����鳤��С��Դ���鳤�ȣ���ĩβ��ȡ
		int[] b = Arrays.copyOf(a,4); //����Բ�
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
		*/
		
		/*
		int[] a = {10,20,30,40,50};
		int[] b = new int[6]; //0,0,0,0,0,0
		//a:Դ����
		//1:Դ�������ʼ�±�
		//b:Ŀ������
		//0:Ŀ���������ʼ�±�
		//4:Ҫ���Ƶ�Ԫ�ظ���
		System.arraycopy(a,1,b,0,4); //����Ժ�
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
		*/
	}
}





















