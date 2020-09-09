package chap10;

public class SystemExample {

	public static void main(String[] args) {
		System.out.println(System.getenv("JAVA_HOME"));
		System.out.println(System.getProperty("java.version"));
		
		long time1 = System.nanoTime();
		
		int sum = 0;
		for(int i = 0; i<1000000; i++) {
			sum+=i;
		}
		
		long time2= System.nanoTime();
		
		System.out.println("��꿡 �ҿ�� �ð�: " + (time2-time1)+"������");
		
		for (int i =0; i<10; i++) {
			if(i==5)
				System.exit(0);
		}
		System.out.println("����");
	}

}
