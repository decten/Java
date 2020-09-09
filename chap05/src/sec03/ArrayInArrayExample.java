package sec03;

public class ArrayInArrayExample {

	public static void main(String[] args) {
		int[][] aa = new int[3][3];
		
		int i,j;
		int value= 1;
		
		for(i=0; i<aa.length;i++) {
			for(j=0; j<aa.length;j++) {
				aa[i][j]=value;
				value++;
			}
		}
		
		for(i=0; i<aa.length;i++) {
			for(j=0; j<aa.length;j++) {
				System.out.printf("%3d", aa[i][j]);
			}
			System.out.println();
		}
		
	}

}
