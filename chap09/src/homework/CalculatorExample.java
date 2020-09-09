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
			System.out.println("0으로 나누면 안 됩니다.");
			return 0;
		}
	}

	static void resultShow(int x, int y) {
		System.out.println("x * y = " + mul(x, y));
		System.out.println("x / y = " + div(x, y));
	}

	public static void main(String[] args) {
		System.out.println("정수값 2개를 입력해주세요.");

		try (Scanner scanner = new Scanner(System.in)) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();

			resultShow(x, y);
		}catch (InputMismatchException e) {
			System.out.println("숫자만 넣어주세요.");
		}
	}

}
