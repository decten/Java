package sec01;

class A{
	public A() {
		System.out.println("������A");
	}
	public A(int x) {
		//...
	}
}

class B extends A{
	public B() {
		System.out.println("������B");
	}
}

public class ConstructorEx {

	public static void main(String[] args) {
		B b;
		b = new B();
	}

}
