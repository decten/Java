package sec01;

class AAA{
	public AAA() {
		System.out.println("������AAA");
	}
	public AAA(int x) {
		System.out.println("�Ű�����������AAA "+x);
	}
}

class BBB extends AAA{
	public BBB() {
		System.out.println("������BBB");
	}
	public BBB(int x) {
		super(x);
		System.out.println("�Ű�����������BBB "+x);
	}
}

public class ConstructorEx3 {
	
	public static void main(String[] args) {
		BBB b;
		b = new BBB(5);
	}

}
