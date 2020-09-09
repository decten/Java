package sec08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("황금을");
		list.add("돌");
		list.add("같이");
		list.add("보라");
		
		Collections.sort(list);
		System.out.println(list);
		int i = Collections.binarySearch(list, "돌");
		System.out.println(i);
		
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
		
		Collections.reverse(list);
		System.out.println(list);
	}

}
