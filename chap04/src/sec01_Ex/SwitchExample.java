package sec01_Ex;

public class SwitchExample {
	public static void main(String args[]) {
		int score = 85;
		int grade = score / 10;

		switch (grade) {
		case 10:
		case 9:
			System.out.println("점수가 100~90 입니다.");
			System.out.println("등급은 A 입니다.");
			
		case 8:
			System.out.println("점수가 90~80 입니다.");
			System.out.println("등급은 B 입니다.");
			
		case 7:
			System.out.println("점수가 80~70 입니다.");
			System.out.println("등급은 C 입니다.");
			
		default:
			System.out.println("점수가 70점 미만 입니다.");
			System.out.println("등급은 D 입니다.");
			
		}
	}
}
