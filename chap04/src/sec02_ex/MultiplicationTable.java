package sec02_ex;

public class MultiplicationTable {

	public static void main(String[] args) {
		for(int i=2; i<10; i++) {
			System.out.println("------- "+i+"´Ü -------");
			for(int k=1; k<10; k++) {
				System.out.print(i+" x "+k+"= "+i*k+" ");
			}
			System.out.println();
		}
	}

}
