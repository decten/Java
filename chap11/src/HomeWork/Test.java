package HomeWork;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("���");
		list.add("����");
		list.add("�ٳ���");
		list.add("����");
		list.add("����");
		
		list.add(3, "����");
		list.remove("����");
		list.remove(4);
		
		int size = list.size();
		System.out.println("�� ��ü��: "+ size);
		System.out.println();
		
		for(int i=0; i<size;i++) {
			String str = list.get(i);
			System.out.println(i+":"+str);
		}
	}

}
