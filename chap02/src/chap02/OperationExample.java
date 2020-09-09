package chap02;

public class OperationExample {

	public static void main(String[] args) {
		byte result1 = 10 + 20;
		System.out.println(result1);

		byte byteValue1 = 10;
		byte byteValue2 = 20;
		int result2 = byteValue1 + byteValue2;
		System.out.println(result2);

		int intValue1 = 10;
		int intValue2 = intValue1 / 4;
		System.out.println(intValue2);

		int intValue3 = 10;
		double doubleValue = intValue3 / 4.0;
		System.out.println(doubleValue);

		int intValue4 = 1;
		int intValue5 = 2;
		double result3 = (double)intValue4 / intValue5;
		System.out.println(result3);
		
		String str1 = 10 + 2 + "8";
		System.out.println("str1: "+ str1);
		
		String str2 = 10 + "2" + 8;         
		System.out.println("str2: "+ str2); 
		
		String str3 = "10" + 2 + 8;         
		System.out.println("str3: "+ str3); 
		
		String str4 = "10" + (2 + 8);         
		System.out.println("str4: "+ str4); 
	}

}
