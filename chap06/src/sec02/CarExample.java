package sec02;

class Car {
	String color;
	int speed;
}

public class CarExample {

	public static void main(String[] args) {
		Car myCar1,myCar2,myCar3;
		myCar1 = new Car();
		myCar2 = new Car();
		myCar3 = new Car();
		
		myCar1.color = "������";
		myCar1.speed=0;
		System.out.println("�ڵ���1�� ������ " +myCar1.color+"�̸�, ���� �ӵ��� "+myCar1.speed+"km �Դϴ�");
		
		myCar2.color = "�Ķ���";
		myCar2.speed=0;
		System.out.println("�ڵ���2�� ������ " +myCar2.color+"�̸�, ���� �ӵ��� "+myCar2.speed+"km �Դϴ�");
		
		myCar3.color = "�����";
		myCar3.speed=0;
		System.out.println("�ڵ���3�� ������ " +myCar3.color+"�̸�, ���� �ӵ��� "+myCar3.speed+"km �Դϴ�");
	}

}