package sec04;

import java.util.Iterator;
import java.util.Vector;

public class IteratorExample {

	public static void main(String[] args) {
		
		Vector<Integer> v = new Vector<>();
		v.add(5);
		v.add(4);
		v.add(-1);
		v.add(2,100);
		
		Iterator<Integer> it = v.iterator();
		while(it.hasNext()) {
			int n = it.next();
			System.out.println(n);
			if(n == 5)
				it.remove();
		}
		
		int sum = 0;
		it = v.iterator();
		while(it.hasNext()) {
			int n = it.next();
			System.out.println(n);
			sum+=n;
		}
		System.out.println("���Ϳ� �ִ� ���� �� : " + sum);
		
	}

}