package project;

import java.sql.Date;
import java.util.Scanner;

public class Mom extends Person {

	private int count = 0;

	@Override
	public void buyMask() {
		if ((day == 2 || day == 3) && hour <= 12) {
			System.out.println("���Ͻô� ����ũ�� �Է����ּ���. kf94�� 1, kf80�� 2, õ ����ũ�� 3 �Դϴ�. >> ");
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
			System.out.println("������ ����ũ�� ������, ȭ���� �� 12�ñ����� ������ �� �ֽ��ϴ�.");
	}

	@Override
	public void useMask(String type) {
		if (mask.deleteMask(type, 1))
			count++;
		
		mask.showMask();
		System.out.println("������ ����Ͻ� ����ũ ������ �� " + count + "�� �Դϴ�.");
		
	}

}