package sec02;

public class BreakExample {

	public static void main(String[] args) {
		int sum =0;
		int i =1;
		
		while(i <= 100) {
			sum += i;
			
			
			if(sum>=1000)
				break;
			i++;
		}
		System.out.println("1~"+i+"±îÁö ÇÕ: "+sum);
	}

}
