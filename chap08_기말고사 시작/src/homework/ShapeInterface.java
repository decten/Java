package homework;

public class ShapeInterface {

	public static void main(String[] args) {
		Circle c = new Circle(3);
		
		Shape s = c;
		s.draw();
		System.out.printf("���� ���̴� %.1f\n", s.findArea());

	}

}
