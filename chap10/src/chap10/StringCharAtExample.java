package chap10;

public class StringCharAtExample {

	public static void main(String[] args) {
		String ssn = "010624-2345678";

		char sex = ssn.charAt(7);
		switch (sex) {
		case '0':
		case '2':
			System.out.println("�����Դϴ�.");
			break;
		default:
			System.out.println("�ѳ��Դϴ�.");
			}
	}

}
