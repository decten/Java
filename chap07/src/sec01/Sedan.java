package sec01;

public class Sedan extends Car {

	int seatNum;
	
	int getSeatNum() {
		return seatNum;
	}
	
	void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	void upSpeed(int speed) {
		this.speed += speed;
		
		if (this.speed > 200) {this.speed=200;}
		System.out.println("���� �ӵ�(Sedan, �ڽ� Ŭ����)" + this.speed);
	}
	
	
}
