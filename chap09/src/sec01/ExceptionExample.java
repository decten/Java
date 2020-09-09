package sec01;

public class ExceptionExample{

	public static void main(String[] args) {
		try {
			method1();
		} catch (ClassNotFoundException e) {
			System.out.println("클래스 존재하지 않음");
		}
	}
	
	static void method1() throws ClassNotFoundException{
		Class clazz = Class.forName("java.lang.String2");
	}

}
