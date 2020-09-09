package sec04;

public class ArrayPassing {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 };

		increase(a);
		
		int j=0;
		for(int i:a) {//a는 배열의 값을 저장하므로 인덱스 저장하는 변수 j를 따로 선언!!
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
