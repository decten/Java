package sec01;

import java.util.Scanner;

public class NestedIfExample {

	public static void main(String[] args) {
		System.out.println("���̸� �Է��ϼ��� : ");
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		
		if (age <= 7) {
			System.out.println("����");
		}
		else if (age <= 13) {
			System.out.println("���");
		}
		else if (age <= 19) {
			System.out.print("û�ҳ�");
			if(age <= 16) {
				System.out.println("- ���л�");
			}
			else {
				System.out.println("- ����л�");
			}
		}
		else {
			System.out.println("�");
		}
	}

}
