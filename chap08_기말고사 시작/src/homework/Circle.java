package homework;

public class Circle implements Shape {
	int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("���� �׸���.");

	}
	
	public double findArea() {
		return PI*radius*radius;
	}
}
