package chap02;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		System.out.println("������ 2���� �Է����ּ���");
		
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
		System.out.printf("%d * %d = %d �Դϴ�.", x,y,x*y);
		
	}

}
