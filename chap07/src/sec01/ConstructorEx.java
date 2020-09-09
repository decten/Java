package sec01;

class A{
	public A() {
		System.out.println("持失切A");
	}
	public A(int x) {
		//...
	}
}

class B extends A{
	public B() {
		System.out.println("持失切B");
	}
}

public class ConstructorEx {

	public static void main(String[] args) {
		B b;
		b = new B();
	}

}
