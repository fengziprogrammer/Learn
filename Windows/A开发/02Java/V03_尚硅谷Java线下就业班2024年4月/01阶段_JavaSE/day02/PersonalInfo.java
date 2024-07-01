class PersonalInfo {

/*
	定义一个测试类PersonalInfo,
	用合适类型的变量存储个人信息并输出

	定义合适类型的变量用于存储自己的姓名、年龄、身高等等，
	然后打印输出这些变量的值

	// 定义变量的格式
	数据类型 变量名 = 变量值;
*/
	public static void main(String[] args) {

		// 姓名
		String name = "罗丹";

		// 年龄
		int age = 101;

		// 身高(cm)
		double heigh = 230;

		System.out.println("姓名为:" + name);
		System.out.println("年龄为:" + age + "岁");
		System.out.println("身高为:" + heigh + "cm");
	}
}
