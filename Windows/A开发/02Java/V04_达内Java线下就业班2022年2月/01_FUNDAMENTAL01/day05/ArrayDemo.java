package day05;
//数组的演示
public class ArrayDemo {
	public static void main(String[] args) {
		//4.数组的遍历:
		int[] arr = new int[10];
		for(int i=0;i<arr.length;i++) { //遍历arr数组
			arr[i] = (int)(Math.random()*100); //给每个元素赋值为0到99的随机数
			System.out.println(arr[i]); //输出每个元素的值
		}
		/*
		 * 任务:
		 * 1.数组的遍历
		 * 2.将数组的定义、初始化、访问、遍历重写一次
		 * 3.去吃饭(6:30职业素质课，8:00晚课)
		 */
		
		
		
		
		
		
		
		
		
		
		
		/*
		//3.数组的访问:
		int[] arr = new int[3];
		System.out.println(arr.length); //输出arr的长度
		arr[0] = 100; //给arr中第1个元素赋值为100
		arr[1] = 200; //         2           200
		arr[2] = 300; //         3           300
		//arr[3] = 400; //运行时--发生数组下标越界的异常
		System.out.println(arr[arr.length-1]); //输出最后一个元素的值
		*/
		
		
		
		
		
		
		
		
		/*
		//1)数组的定义:
		//声明整型数组arr，包含10个元素，每个元素都是int类型，默认值为0
		int[] arr = new int[10];
		
		//2)数组的初始化: 初始化数组中的元素
		int[] arr1 = new int[4]; //0,0,0,0
		int[] arr2 = {2,5,7,9}; //2,5,7,9
		int[] arr3 = new int[] {2,5,7,9}; //2,5,7,9
		int[] arr4;
		//arr4 = {2,5,7,9}; //编译错误，此方式只能声明同时初始化
		arr4 = new int[] {2,5,7,9}; //正确
		*/
	}
}


















