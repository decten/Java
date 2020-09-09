package sec04;

public class Car {

	int speed;
	
	int getSpeed() {
		return speed;
	}
	
	void keyTrunOn() {
		System.out.println("시동을 켭니다.");
	}
	
	void run() {
		for (int i=10; i<=50; i++) {
			speed = i;
			System.out.println("달립니다.(시속:"+speed+"km/h)");
		}
	}
}
