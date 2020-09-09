package project;

import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public abstract class Person {
	protected int day = Calendar.DAY_OF_WEEK;
	protected int hour = Calendar.HOUR;
	
	MaskInventory mask = new MaskInventory();

	protected int todayMask = 3;

	public void printMenu() {

		System.out.println("마스크 획득은 1, 마스크 사용은 2, 랜덤 마스크 획득은 3, 마스크 수 확인은 4, 종료는 5 입니다. >> ");

		Scanner scan = new Scanner(System.in);
		int flag = scan.nextInt();
		scan.nextLine();
		switch (flag) {
		case 1:
			buyMask();
			break;
		case 2:
			System.out.println("원하시는 마스크를 입력해주세요. kf94는 1, kf80은 2, 천 마스크는 3 입니다. >> ");
			int type = scan.nextInt();
			scan.nextLine();
			switch (type) {
			case 1:
				useMask("kf94");
				break;
			case 2:
				useMask("kf80");
				break;
			case 3:
				useMask("cotton");
				break;
			}
			break;
		case 3:
			randomMask();
			break;
		case 4:
			mask.showMask();
			break;
		case 5:
			System.out.println("프로그램을 종료합니다.");
			System.exit(0);
			break;
		}
	}

	public abstract void buyMask();

	public abstract void useMask(String type);

	public void randomMask() {
		if (todayMask!=0) {
			System.out.println("-------- 랜덤 마스크 ----------");
			System.out.println("마스크 종류를 입력해주세요. kf94는 1, kf80은 2, 천 마스크는 3 입니다. >> ");
			Scanner scan = new Scanner(System.in);
			int type = scan.nextInt();
			scan.nextLine();

			Random random = new Random();
			int amount = random.nextInt(4) - 1;
			System.out.println("-------- 결과 ----------");
			System.out.println(amount + "개 획득!");

			if (amount == -1) {
				switch (type) {
				case 1:
					mask.deleteMask("kf94", 1);
					break;
				case 2:
					mask.deleteMask("kf80", 1);
					break;
				case 3:
					mask.deleteMask("cotton", 1);
					break;
				}
			}

			else {
				switch (type) {
				case 1:
					mask.addMask("kf94", amount);
					break;
				case 2:
					mask.addMask("kf80", amount);
					break;
				case 3:
					mask.addMask("cotton", amount);
					break;
				}
			}
			--todayMask;
		}

		else
			System.out.println("한번만 할 수 있습니다.");

	}
}
