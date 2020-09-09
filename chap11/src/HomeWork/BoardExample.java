package HomeWork;

import java.util.Scanner;

class OpenBoard {
	String subject;
	String content;
	String writer;

	public OpenBoard(String subject, String content, String writer) {
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}

	@Override
	public String toString() {
		return this.writer+this.subject;
	}

}

class QABoard {
	String subject;
	String content;
	String writer;

	public QABoard(String subject, String content, String writer) {
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}

	@Override
	public String toString() {
		return this.writer+this.subject;
	}
	
	
}

public class BoardExample {
	static <T> String findSubject(T[] b, String name) {
		for (int i = 0; i < b.length; i++) {
			String tmp = b[i].toString();
			String cmp = tmp.substring(0, 4);
			if (cmp.equals(name)) {
				return tmp.substring(4, 7);
			}

		}
		return "";
	}

	public static void main(String[] args) {
		OpenBoard[] ob = { new OpenBoard("����1", "����1", "�۾���1"), new OpenBoard("����2", "����2", "�۾���2"),
				new OpenBoard("����3", "����3", "�۾���3") };
		QABoard[] qab = { new QABoard("����4", "����4", "�۾���1"), new QABoard("����5", "����5", "�۾���4"),
				new QABoard("����6", "����6", "�۾���3") };

		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();

		System.out.println(name + "�� �ۼ��� �� ����: " + findSubject(ob, name));
		
//		�������� ������ qab �۵� Ȯ�� �ڵ��Դϴ�.
		String name2 = scanner.next();
		System.out.println(name2 + "�� �ۼ��� �� ����: " + findSubject(qab, name2));

	}

}
