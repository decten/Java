package sec01;

import java.util.Scanner;

public class SimpleIfExample {

	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요 : ");
		Scanner scanner = new Scanner(System.in);
		
		int number = scanner.nextInt();
		
		if (number % 2 ==0) {
			System.out.println("짝수!");
		}
		if (number % 2 ==1) {
			System.out.println("홀수!");
		}
		
		System.out.println("종료!");
	}

}
