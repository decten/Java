package finaltest;

public class SmartTVExample {

	public static void main(String[] args) {
		SmartTV smarttv = new SmartTV();
		Serachable s = new SmartTV();
		TV tv = new SmartTV();
		
		smarttv.turnOn();
		smarttv.turnOff();
		smarttv.setVolume(6);
		System.out.println("www.swu.ac.kr을 검색합니다");
	}

}
