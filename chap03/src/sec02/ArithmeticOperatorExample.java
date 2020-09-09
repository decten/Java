package sec02;

public class ArithmeticOperatorExample {

	public static void main(String[] args) {
		
		int v1 = 5;
		int v2 = 2;
		
		int result1 = v1/v2;
		System.out.println("result1= "+result1);
		
		double result2 = (double) v1 / v2;
		System.out.println("result2= "+result2);
		
		char c1 = 'A' + 1;
		char c2 = 'A';
		//char c3 = c2 + 1;
		int c4 = c2 +1;
		System.out.println("c1= "+c1);
		System.out.println("c2= "+c2);
		//System.out.println("c3= "+c3);
		System.out.println("c4= "+c4);
		
	}

}
