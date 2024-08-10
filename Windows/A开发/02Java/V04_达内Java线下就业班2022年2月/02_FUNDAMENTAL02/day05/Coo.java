package oo.day05.vis;
import oo.day05.Aoo;
public class Coo { //ÑİÊ¾Í¬°üµÄ
	void show() {
		Aoo o = new Aoo();
		o.a = 1;
		//o.b = 2; //±àÒë´íÎó
		//o.c = 3; //±àÒë´íÎó
		//o.d = 4; //±àÒë´íÎó
	}
}

class Doo extends Aoo{ //¿ç°ü¼Ì³Ğ--ÑİÊ¾protected
	void show() {
		a = 1;
		b = 2;
		//c = 3; //±àÒë´íÎó
		//d = 4; //±àÒë´íÎó
	}
}
















