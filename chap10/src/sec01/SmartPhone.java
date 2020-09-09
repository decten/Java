package sec01;

public class SmartPhone {
	private String model;
	private String user;
	
	public SmartPhone(String model, String user) {
		this.model = model;
		this.user = user;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof SmartPhone) {
			SmartPhone cmp = (SmartPhone) obj;
			if (cmp.model == this.model)
				return true;
		}
		return false;
	}
	//equals 메소드 오버라이딩 --> 다시 
	@Override
	public String toString() {
		return "이 폰은 " + this.user + "의 폰이다.";
	}//toString 메소드 오버라이딩

}
