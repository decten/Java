package sec01;

public class ExceptionExample{

	public static void main(String[] args) {
		try {
			method1();
		} catch (ClassNotFoundException e) {
			System.out.println("Ŭ���� �������� ����");
		}
	}
	
	static void method1() throws ClassNotFoundException{
		Class clazz = Class.forName("java.lang.String2");
	}

}
