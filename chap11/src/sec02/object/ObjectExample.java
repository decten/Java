package sec02.object;

import sec02.*;

public class ObjectExample {

	public static void main(String[] args) {
		Cup<Boricha> c = new Cup<>();
		
		c.setBeverage(new Boricha());
//		c.setBeverage(new Beer()); Boricha 타입을 명시해서 Beer은 못 담음
//		
//		Beer b = (Beer)c.getBeverage(); Boricha 타입이라 Beer로 못 바꿈
		Boricha b = c.getBeverage();
	}

}
