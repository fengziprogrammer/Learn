public class Exer14_4{
	public static void main(String[] args){
		int x = 1,y = 1;

		/*
		(1)x++����ȡx��ֵ1���ŵ�������ջ�У�x����Ϊ2
		(2)�ж�== 1==1������true
		(3)||�ᷢ����·���ұ߲�����
		*/
		if(x++==1 || ++y==1){//if(true || ?) if(true)
			x =7;//ִ��
		}
		System.out.println("x="+x+",y="+y);//x=7,y=1

	}
}