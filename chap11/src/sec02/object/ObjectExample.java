package sec02.object;

import sec02.*;

public class ObjectExample {

	public static void main(String[] args) {
		Cup<Boricha> c = new Cup<>();
		
		c.setBeverage(new Boricha());
//		c.setBeverage(new Beer()); Boricha Ÿ���� ����ؼ� Beer�� �� ����
//		
//		Beer b = (Beer)c.getBeverage(); Boricha Ÿ���̶� Beer�� �� �ٲ�
		Boricha b = c.getBeverage();
	}

}
