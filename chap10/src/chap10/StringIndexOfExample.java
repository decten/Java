package chap10;

public class StringIndexOfExample {

	public static void main(String[] args) {
		String subject = "�ڹ� ���α׷���";
		
		int location = subject.indexOf("�ڹ� ���α׷���");
		System.out.println(location);
		
		if (subject.indexOf("�ڹ� ���α׷���") != -1) {
			System.out.println("�ڹٿ� ���õ� å�̱���");
		}
		else {
			System.out.println("�ڹٿ� ���� ���� å�̱���");
		}
		
	}

}
