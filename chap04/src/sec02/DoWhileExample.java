package sec02;

public class DoWhileExample {

	public static void main(String[] args) {
		int i =100;
		
		while(i==200) {
			System.out.println("while문 내부 실행");
		}
		do {
			System.out.println("do-while문 내부 실행");
		}while(i==200);
	}

}
