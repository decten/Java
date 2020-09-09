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
		
		myCar1.color = "빨간색";
		myCar1.speed=0;
		System.out.println("자동차1의 색상은 " +myCar1.color+"이며, 현재 속도는 "+myCar1.speed+"km 입니다");
		
		myCar2.color = "파란색";
		myCar2.speed=0;
		System.out.println("자동차2의 색상은 " +myCar2.color+"이며, 현재 속도는 "+myCar2.speed+"km 입니다");
		
		myCar3.color = "노란색";
		myCar3.speed=0;
		System.out.println("자동차3의 색상은 " +myCar3.color+"이며, 현재 속도는 "+myCar3.speed+"km 입니다");
	}

}
