package finaltest;

import java.util.Stack;

public class FinalTest {

	public static void main(String[] args) {
		Stack<String> s = new Stack<>();
		
		s.add("�Ķ�");
		s.push("�ʷ�");
		s.add("����");
		
		System.out.println(s.peek());
		
		s.add("�Ķ�");
		
		while(!s.empty()) {
			System.out.println(s.pop()+" ");
		}
	}
}
