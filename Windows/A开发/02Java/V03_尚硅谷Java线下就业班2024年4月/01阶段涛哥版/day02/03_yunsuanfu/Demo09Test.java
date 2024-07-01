public class Demo09Test{
	public static void main(String[] args){
		int heShang1 = 150;
		int heShang2 = 210;
		int heShang3 = 170;
		
		int temp = (heShang1>heShang2)?heShang1:heShang2;
		int max = (temp>heShang3)?temp:heShang3;
		System.out.println("三个和尚的最高身高为:"+max);
	}
}