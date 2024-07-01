class CircleTest {

	
	public static void main(String[] args) {

		final double PI = 3.14;// 圆周率

		double r = 3.3;//圆的半径
		double  perimeter;// 圆的周长
		double area ;//圆的面积

		perimeter = 2 * PI * r;
		area = PI * r * r;

		System.out.println("一个圆的周长" + perimeter);
		System.out.println("一个圆的面积" + area);
	}
}
