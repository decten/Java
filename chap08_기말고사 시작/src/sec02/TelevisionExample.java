package sec02;

public class TelevisionExample {

	public static void main(String[] args) {
		Television tv = new Television();
		
		RemoteControl rc = tv;
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(5);
		
		System.out.println();
		
		SmartTelevision smt = new SmartTelevision();
		
		RemoteControl rc1 = smt;
		
		rc1.turnOn();
		rc1.turnOff();
		rc1.setVolume(5);
		
		Searchable searchable = smt;
		searchable.search("www.swu.ac.kr");
	
	}

}
