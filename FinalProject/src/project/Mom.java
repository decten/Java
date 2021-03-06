package project;

import java.sql.Date;
import java.util.Scanner;

public class Mom extends Person {

	private int count = 0;

	@Override
	public void buyMask() {
		if ((day == 2 || day == 3) && hour <= 12) {
			System.out.println("원하시는 마스크를 입력해주세요. kf94는 1, kf80은 2, 천 마스크는 3 입니다. >> ");
			Scanner scan = new Scanner(System.in);
			int user = scan.nextInt();
			scan.nextLine();
			switch (user) {
			case 1:
				mask.addMask("kf94", 1);
				break;
			case 2:
				mask.addMask("kf80", 1);
				break;
			case 3:
				mask.addMask("cotton", 1);
				break;

			}
		} else
			System.out.println("엄마는 마스크를 월요일, 화요일 낮 12시까지만 구매할 수 있습니다.");
	}

	@Override
	public void useMask(String type) {
		if (mask.deleteMask(type, 1))
			count++;
		
		mask.showMask();
		System.out.println("엄마가 사용하신 마스크 개수는 총 " + count + "개 입니다.");
		
	}

}
