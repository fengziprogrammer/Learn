package day06;
import java.util.Arrays;
//������Ԫ�����ֵ���������ֵ�����������һ��Ԫ�ص���һ��λ��
public class MaxOfArray {
	public static void main(String[] args) {
		int[] arr = new int[10];
		for(int i=0;i<arr.length;i++) {
			arr[i] = (int)(Math.random()*100);
			System.out.println(arr[i]);
		}
		
		int max = arr[0]; //�����1��Ԫ��Ϊ���ֵ
		for(int i=1;i<arr.length;i++) { //����ʣ��Ԫ��
			if(arr[i]>max) {  //��ʣ��Ԫ�ش���max
				max = arr[i]; //��max�޸�Ϊ�ϴ��ֵ
			}
		}
		System.out.println("���ֵΪ:"+max);
		
		arr = Arrays.copyOf(arr,arr.length+1); //����
		arr[arr.length-1] = max; //�����ֵmax��ֵ��arr�����һ��Ԫ��λ��
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}
}






















