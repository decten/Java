package HomeWork;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("»ç°ú");
		list.add("µþ±â");
		list.add("¹Ù³ª³ª");
		list.add("Æ÷µµ");
		list.add("µþ±â");
		
		list.add(3, "¼ö¹Ú");
		list.remove("µþ±â");
		list.remove(4);
		
		int size = list.size();
		System.out.println("ÃÑ °´Ã¼¼ö: "+ size);
		System.out.println();
		
		for(int i=0; i<size;i++) {
			String str = list.get(i);
			System.out.println(i+":"+str);
		}
	}

}
