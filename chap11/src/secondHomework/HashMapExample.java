package secondHomework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapExample {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		
		map.put("서울","한국");
		map.put("오타와","캐나다");
		map.put("포르토프랭스","아이티");
		
		System.out.println("도시 이름을 입력하세요");
		
		Scanner scan = new Scanner(System.in);
		String ans = scan.next();
		
		if(map.get(ans)!=null)
			System.out.println(ans+"은 "+map.get(ans)+"의 도시입니다.");
		else
			System.out.println(ans+"에 대한 정보가 없습니다.");
	}

}
