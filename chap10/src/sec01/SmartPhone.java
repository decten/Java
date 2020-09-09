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
	//equals �޼ҵ� �������̵� --> �ٽ� 
	@Override
	public String toString() {
		return "�� ���� " + this.user + "�� ���̴�.";
	}//toString �޼ҵ� �������̵�

}
