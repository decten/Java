package chap02;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		System.out.println("정수값 2개를 입력해주세요");
		
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
		System.out.printf("%d * %d = %d 입니다.", x,y,x*y);
		
	}

}
