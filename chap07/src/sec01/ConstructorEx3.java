package sec01;

class AAA{
	public AAA() {
		System.out.println("생성자AAA");
	}
	public AAA(int x) {
		System.out.println("매개변수생성자AAA "+x);
	}
}

class BBB extends AAA{
	public BBB() {
		System.out.println("생성자BBB");
	}
	public BBB(int x) {
		super(x);
		System.out.println("매개변수생성자BBB "+x);
	}
}

public class ConstructorEx3 {
	
	public static void main(String[] args) {
		BBB b;
		b = new BBB(5);
	}

}
