package project;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		Mom mom = new Mom();
		Dad dad = new Dad();
		Me me = new Me();

		System.out.println("마스크 관리 프로그램입니다.");
		System.out.println("마스크를 엄마는 월,화 낮에 아빠는 수,목 낮에 본인은 금요일 언제든지 구매 가능합니다.");
		System.out.print("엄마 1, 아빠 2, 본인 3 입니다.\n계정을 선택해주세요 >> ");
		int user = scan.nextInt();
		scan.nextLine();
		System.out.println("랜덤 마스크 획득은 -1~3개를 랜덤으로 획득할 수 있고, 한번만 가능합니다.");

		while (true) {
			
			switch (user) {
			case 1:
				mom.printMenu();
				break;

			case 2:
				dad.printMenu();
				break;
			case 3:
				me.printMenu();
				break;
			default:
				System.out.println("계정을 잘못 선택하셨습니다.");
				System.exit(0);
				break;

			}

		}
	}

}
