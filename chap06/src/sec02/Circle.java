package sec02;

public class Circle {
	
	int radius;
	String name;
	
	public static void main(String[] args) {
		Circle pizza;
		pizza = new Circle();
		pizza.radius = 10;
		pizza.name = "�ڹ�����";
		System.out.println(pizza.name + "�� �������� "+pizza.radius);
		
		Circle donut;
		donut = new Circle();
		donut.radius = 2;
		donut.name = "�ڹٵ���";
		System.out.println(donut.name + "�� �������� "+donut.radius);
	}

}
