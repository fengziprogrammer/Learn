class Demo2_HomeWork {

	/*
		给定一个四位数,分别求出对应的各个位的数
		例1234,求出个位->4,十位->3,百位->2,千位->1

		分析思路
			1.1234   个位 ->   值 % 10  商 123 余4
			2.从 123 中拿到4  上一步 值 / 10 --> 123  % 10 -> 3
			3.依次类推

	*/
	public static void main(String[] args) {

		int num = 5678;

		int ge = num  / 1 % 10;
		int shi = num / 10 % 10;
		int bai = num / 100 % 10;
		int qian = num / 1000 % 10;

		System.out.println("当前这个四位数,各位:" + ge + ",十位" 
				+ shi + ",百位" + bai + ",千位是" + qian );
	}
}
