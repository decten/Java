package sec02;

public class NestForExample {

	public static void main(String[] args) {
		for(int i=0; i<3; i++) {
			System.out.println(i);
			for(int k=0; k<2; k++) {
				System.out.println("-------------"+k);
			}
		}
	}

}
