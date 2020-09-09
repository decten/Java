package sec01;
class AA{
	public AA() {
		System.out.println("생성자AA");
	}
	public AA(int x) {
		System.out.println("매개변수생성자AA");
	}
}

class BB extends AA{
	public BB() {
		System.out.println("생성자BB");
	}
	public BB(int x) {
		System.out.println("매개변수생성자BB");
	}
}

public class ConstructorEx2 {

	public static void main(String[] args) {
		BB b;
		b = new BB(5);
	}

}
