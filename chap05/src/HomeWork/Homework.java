package HomeWork;

public class Homework {

	public static void main(String[] args) {

		// 1번:1,3,5,7,9,12,14,16,18,20저장한 args 배열을 숫자로 변환함
		int[] arg = new int[10];

		for (int i = 0; i < args.length; i++) {
			arg[i] = Integer.parseInt(args[i]);
		}

		// 2번
		for (int k : arg) {
			System.out.print(k + " ");
		}
		System.out.println();

		// 3번
		int sum = 0;
		for (int i = 0; i < args.length; i++) {
			sum += arg[i];
		}
		System.out.println("합은 : " + sum);
		double avg;
		avg = (double) sum / args.length;
		System.out.println("평균은 : " + avg);

	}

}
