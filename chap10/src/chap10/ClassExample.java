package chap10;

public class ClassExample {

	public static void main(String[] args) throws ClassNotFoundException {
		Class clazz1 = KeyBoard.class;
		
		Class clazz2 = Class.forName("chap10.KeyBoard");
		
		KeyBoard keyboard = new KeyBoard("Å°º¸µå");
		Class clazz3 = keyboard.getClass();
		
		System.out.println(clazz1.getName());
		System.out.println(clazz2.getSimpleName());
		System.out.println(clazz3.getPackage().getName());
	}

}
