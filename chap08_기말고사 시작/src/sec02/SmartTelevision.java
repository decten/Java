package sec02;

public class SmartTelevision extends Television implements RemoteControl,Searchable{

	@Override
	public void turnOn() {
		System.out.println("SmartTV�� �մϴ�.");
	}
	
	@Override
	public void turnOff() {
		System.out.println("SmartTV�� ���ϴ�.");
	}

	@Override
	public void search(String url) {
		System.out.println(url+"�� �˻��մϴ�.");
		
	}
}
