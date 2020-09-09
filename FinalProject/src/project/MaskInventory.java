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
			System.out.println("현재 마스크 개수가 부족합니다. 마스크는 최소 0개입니다.");
			return false;
	}

	public void showMask() {
		System.out.println("-------- 마스크 개수 ----------");
		
		System.out.print("kf94: "+map.get("kf94")+"개");
		for (int i = 0; i < map.get("kf94"); i++) {
			System.out.print("\tY");
		}
		System.out.println();

		System.out.print("kf80: "+map.get("kf80")+"개");
		for (int i = 0; i < map.get("kf80"); i++) {
			System.out.print("\tY");
		}

		System.out.println();

		System.out.print("천 마스크: "+map.get("cotton")+"개");
		for (int i = 0; i < map.get("cotton"); i++) {
			System.out.print("\tY");
		}
		System.out.println("\n--------------------------");
		
	}

}