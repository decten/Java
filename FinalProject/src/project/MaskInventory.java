package project;

import java.util.HashMap;
import java.util.Map;

public class MaskInventory {

	Map<String, Integer> map = new HashMap<String, Integer>();

	public MaskInventory() {
		map.put("kf94", 0);
		map.put("kf80", 0);
		map.put("cotton", 0);
	}

	public void addMask(String mask, int num) {
		int tmp = map.get(mask) + num;
		map.put(mask, tmp);
		
	}

	public boolean deleteMask(String mask, int num) {
		if (map.get(mask) >= num) {
			int tmp = map.get(mask) - num;
			map.put(mask, tmp);
			return true;
		} else
			System.out.println("���� ����ũ ������ �����մϴ�. ����ũ�� �ּ� 0���Դϴ�.");
			return false;
	}

	public void showMask() {
		System.out.println("-------- ����ũ ���� ----------");
		
		System.out.print("kf94: "+map.get("kf94")+"��");
		for (int i = 0; i < map.get("kf94"); i++) {
			System.out.print("\tY");
		}
		System.out.println();

		System.out.print("kf80: "+map.get("kf80")+"��");
		for (int i = 0; i < map.get("kf80"); i++) {
			System.out.print("\tY");
		}

		System.out.println();

		System.out.print("õ ����ũ: "+map.get("cotton")+"��");
		for (int i = 0; i < map.get("cotton"); i++) {
			System.out.print("\tY");
		}
		System.out.println("\n--------------------------");
		
	}

}