package finaltest;

public class SmartTV extends TV implements Serachable{

	@Override
	public void turnOn() {
		System.out.println("SmartTV¸¦ ÄÕ´Ï´Ù");
	}

	@Override
	public void turnOff() {
		System.out.println("SmartTV¸¦ ²ü´Ï´Ù");
		
	}

	@Override
	public void serach(String url) {
		// TODO Auto-generated method stub
		
	}
	
}
