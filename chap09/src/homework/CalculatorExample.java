package homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorExample {
	static int mul(int x, int y) {
		int result = x * y;
		return result;
	}

	static int div(int x, int y) {
		try {
			int result = x / y;
			return result;
		} catch (ArithmeticException e) {
			System.out.println("0���� ������ �� �˴ϴ�.");
			return 0;
		}
	}

	static void resultShow(int x, int y) {
		System.out.println("x * y = " + mul(x, y));
		System.out.println("x / y = " + div(x, y));
	}

	public static void main(String[] args) {
		System.out.println("������ 2���� �Է����ּ���.");

		try (Scanner scanner = new Scanner(System.in)) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();

			resultShow(x, y);
		}catch (InputMismatchException e) {
			System.out.println("���ڸ� �־��ּ���.");
		}
	}

}
