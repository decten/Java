package sec01;

public class Car {
	private String color;
	int speed;
	
	Car(){}
	
	Car(String color, int speed){
		this.color = color;
		this.speed = speed;
	}
	
	String getColor() {
		return color;
	}
	
	void upSpeed(int value) {
		speed += value;
		
		System.out.println("���� �ӵ�(Car, �θ� Ŭ����) " + this.speed);
	}

	void downSpeed(int value) {
		speed -= value;
	}
}
