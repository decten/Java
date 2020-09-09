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
		OpenBoard[] ob = { new OpenBoard("제목1", "내용1", "글쓴이1"), new OpenBoard("제목2", "내용2", "글쓴이2"),
				new OpenBoard("제목3", "내용3", "글쓴이3") };
		QABoard[] qab = { new QABoard("제목4", "내용4", "글쓴이1"), new QABoard("제목5", "내용5", "글쓴이4"),
				new QABoard("제목6", "내용6", "글쓴이3") };

		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();

		System.out.println(name + "가 작성한 글 제목: " + findSubject(ob, name));
		
//		과제에는 없지만 qab 작동 확인 코드입니다.
		String name2 = scanner.next();
		System.out.println(name2 + "가 작성한 글 제목: " + findSubject(qab, name2));

	}

}
