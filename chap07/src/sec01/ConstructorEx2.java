package sec01;
class AA{
	public AA() {
		System.out.println("������AA");
	}
	public AA(int x) {
		System.out.println("�Ű�����������AA");
	}
}

class BB extends AA{
	public BB() {
		System.out.println("������BB");
	}
	public BB(int x) {
		System.out.println("�Ű�����������BB");
	}
}

public class ConstructorEx2 {

	public static void main(String[] args) {
		BB b;
		b = new BB(5);
	}

}
