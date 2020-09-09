package chap10;

public class WrapperExample {
	public static void main(String[] args) {
		Integer obj1 = new Integer(100); // 사용은 되지만 jdk9부터 공식적인 지원 하지 않음
		Integer obj2 = new Integer("100");
		Integer obj3 = Integer.valueOf(300);
		Integer obj4 = Integer.valueOf("400");
		
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();
		int value4 = obj4.intValue();
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		
		//자동 박싱
		Integer obj =100;
		System.out.println(obj.intValue());
		
		//자동 언박싱
		int value = obj;
		System.out.println(value);
		
		int result = obj+10;
		System.out.println(result);
	}
}

