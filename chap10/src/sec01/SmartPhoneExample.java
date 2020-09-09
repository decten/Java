package sec01;

public class SmartPhoneExample {

	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("Phone1", "홍길동");
		SmartPhone yourPhone = new SmartPhone("Phone1", "홍길현");
		
		System.out.println(myPhone.toString());
		System.out.println(yourPhone.toString());
		if (myPhone.equals(yourPhone))
			System.out.println("스마트폰 모델이 phone1로 동일하다");
	}

}
