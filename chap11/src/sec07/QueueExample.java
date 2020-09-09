package sec07;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		Queue<String> q = new LinkedList<>();
		
		System.out.println(q.poll());
		q.offer("���");
		q.offer("�ٳ���");
		
		q.add("ü��");
		System.out.println("���� ���: " + q.peek());
		
		String head = null;
		
		head = q.poll();
		System.out.println(head + " �����ϱ�");
		System.out.println("���ο� ���: " + q.peek());
		
		head = q.remove();
		System.out.println(head + " �����ϱ�");
		System.out.println("���ο� ���: " + q.peek());
		
		System.out.println("ü���� �����ϰ� �ֳ���? " + q.contains("ü��"));
		System.out.println("����� �����ϰ� �ֳ���? " + q.contains("���"));
	}

}
