package sec04;

public class ArrayPassing {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 };

		increase(a);
		
		int j=0;
		for(int i:a) {//a�� �迭�� ���� �����ϹǷ� �ε��� �����ϴ� ���� j�� ���� ����!!
			System.out.println(a[j] +" ");
			j++;
		}
	}

	static void increase(int[] array) {
		for (int i=0; i<array.length; i++) {
			array[i]++;
		}
	}
}
