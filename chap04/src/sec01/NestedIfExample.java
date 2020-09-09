package sec01;

import java.util.Scanner;

public class NestedIfExample {

	public static void main(String[] args) {
		System.out.println("나이를 입력하세요 : ");
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		
		if (age <= 7) {
			System.out.println("유아");
		}
		else if (age <= 13) {
			System.out.println("어린이");
		}
		else if (age <= 19) {
			System.out.print("청소년");
			if(age <= 16) {
				System.out.println("- 중학생");
			}
			else {
				System.out.println("- 고등학생");
			}
		}
		else {
			System.out.println("어른");
		}
	}

}
