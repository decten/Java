package sec01;

public class AbstractClassDemo {
	public static void main(String args[]) {
		
		Circle c = new Circle(3);
		c.draw();
		System.out.printf("���� ���̴� %.1f\n",c.findArea());
	}
}
