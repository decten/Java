package sec01;

import java.util.Scanner;

public class IfElseExample {

	public static void main(String[] args) {
		System.out.println("���ڸ� �Է��ϼ��� : ");
		Scanner scanner = new Scanner(System.in);

		int number = scanner.nextInt();

		if (number % 2 == 0) {
			System.out.println("¦��!");
		} else {
			System.out.println("Ȧ��!");
		}

		System.out.println("����!");
	}
}
