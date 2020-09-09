package sec06;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<Coin>();
		
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(10));
		
		Coin coin1 = coinBox.peek();
		System.out.println("������ ���� : " + coin1.getValue() + "��");
		System.out.println();
		
		while(!coinBox.isEmpty()) {
			Coin coin2 = coinBox.pop();
			System.out.println("������ ���� : " + coin2.getValue() + "��");
		}
	}

}
