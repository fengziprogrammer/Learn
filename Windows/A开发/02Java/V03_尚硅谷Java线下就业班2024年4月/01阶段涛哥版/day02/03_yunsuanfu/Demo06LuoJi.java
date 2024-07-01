public class Demo06LuoJi{
	public static void main(String[] args){
		int i = 10;
		int j = 20;
		int k = 10;
		
		boolean result01 = (i>j)&&(i==k);//false&&true
		System.out.println(result01);//false
		
		boolean result02 = (i>j)||(i==k);//false||true
		System.out.println(result02);//true
		
		boolean result03 = !(i>j);//!false
		System.out.println(result03);//true
		
		boolean result04 = (i>j)^(i==k);//false^true
		System.out.println(result04);//true
	}
}