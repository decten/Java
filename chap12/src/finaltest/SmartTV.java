package finaltest;

public class SmartTV extends TV implements Serachable{

	@Override
	public void turnOn() {
		System.out.println("SmartTV�� �մϴ�");
	}

	@Override
	public void turnOff() {
		System.out.println("SmartTV�� ���ϴ�");
		
	}

	@Override
	public void serach(String url) {
		// TODO Auto-generated method stub
		
	}
	
}
