package sec04;

public class Car {

	int speed;
	
	int getSpeed() {
		return speed;
	}
	
	void keyTrunOn() {
		System.out.println("�õ��� �մϴ�.");
	}
	
	void run() {
		for (int i=10; i<=50; i++) {
			speed = i;
			System.out.println("�޸��ϴ�.(�ü�:"+speed+"km/h)");
		}
	}
}
