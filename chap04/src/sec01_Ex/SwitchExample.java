package sec01_Ex;

public class SwitchExample {
	public static void main(String args[]) {
		int score = 85;
		int grade = score / 10;

		switch (grade) {
		case 10:
		case 9:
			System.out.println("������ 100~90 �Դϴ�.");
			System.out.println("����� A �Դϴ�.");
			
		case 8:
			System.out.println("������ 90~80 �Դϴ�.");
			System.out.println("����� B �Դϴ�.");
			
		case 7:
			System.out.println("������ 80~70 �Դϴ�.");
			System.out.println("����� C �Դϴ�.");
			
		default:
			System.out.println("������ 70�� �̸� �Դϴ�.");
			System.out.println("����� D �Դϴ�.");
			
		}
	}
}
