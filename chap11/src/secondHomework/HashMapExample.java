package secondHomework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapExample {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		
		map.put("����","�ѱ�");
		map.put("��Ÿ��","ĳ����");
		map.put("������������","����Ƽ");
		
		System.out.println("���� �̸��� �Է��ϼ���");
		
		Scanner scan = new Scanner(System.in);
		String ans = scan.next();
		
		if(map.get(ans)!=null)
			System.out.println(ans+"�� "+map.get(ans)+"�� �����Դϴ�.");
		else
			System.out.println(ans+"�� ���� ������ �����ϴ�.");
	}

}
