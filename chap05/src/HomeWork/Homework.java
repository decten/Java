package HomeWork;

public class Homework {

	public static void main(String[] args) {

		// 1��:1,3,5,7,9,12,14,16,18,20������ args �迭�� ���ڷ� ��ȯ��
		int[] arg = new int[10];

		for (int i = 0; i < args.length; i++) {
			arg[i] = Integer.parseInt(args[i]);
		}

		// 2��
		for (int k : arg) {
			System.out.print(k + " ");
		}
		System.out.println();

		// 3��
		int sum = 0;
		for (int i = 0; i < args.length; i++) {
			sum += arg[i];
		}
		System.out.println("���� : " + sum);
		double avg;
		avg = (double) sum / args.length;
		System.out.println("����� : " + avg);

	}

}
