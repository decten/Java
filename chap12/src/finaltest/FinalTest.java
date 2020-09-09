package finaltest;

import java.util.Stack;

public class FinalTest {

	public static void main(String[] args) {
		Stack<String> s = new Stack<>();
		
		s.add("ÆÄ¶û");
		s.push("ÃÊ·Ï");
		s.add("º¸¶ó");
		
		System.out.println(s.peek());
		
		s.add("ÆÄ¶û");
		
		while(!s.empty()) {
			System.out.println(s.pop()+" ");
		}
	}
}
