package sec01;

public class SmartPhoneExample {

	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("Phone1", "ȫ�浿");
		SmartPhone yourPhone = new SmartPhone("Phone1", "ȫ����");
		
		System.out.println(myPhone.toString());
		System.out.println(yourPhone.toString());
		if (myPhone.equals(yourPhone))
			System.out.println("����Ʈ�� ���� phone1�� �����ϴ�");
	}

}
