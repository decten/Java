package homework;

public class ShapeInterface {

	public static void main(String[] args) {
		Circle c = new Circle(3);
		
		Shape s = c;
		s.draw();
		System.out.printf("원의 넓이는 %.1f\n", s.findArea());

	}

}
