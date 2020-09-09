package homeWork;

public class Employee {
	protected String name;
	protected double salary; 
/* 1.private으로 선언한 변수를 자식 클래스에서 초기화 해서 오류가 생겼다. 
 * 그래서 salary를 동일 패키지의 자식 클래스에서도 접근 가능하도록 protected로 변경한다(private 제외한 다른 접근 제한자 모두 가능)
 * private으로 계속 사용하고 싶으면 자식 클래스에서 salary 사용 부분을 지운다 */ 
	
/*2. 부모 클래스에서 기본 생성자를 만들지 않고 매개변수 생성자만 만들었는데, 이 경우 컴파일러가 기본 생성자를 만들지 않는다. 
 * 하지만 자식 클래스에서는 부모 클래스의 기본 생성자가 호출 되어야 하는 상황이라 오류가 생긴다
 * 그래서 부모 클래스에서 매개변수 생성자를 없애는 방법 또는 매개변수 생성자와 기본 생성자를 같이 만들어주는 방법으로 해결할 수 있다.*/

//1번 방법: 매개변수 생성자를 지워서 컴파일러가 기본 생성자를 만들 수 있도록 한다
//	public Employee(String name, double salary) {
//		this.name = name;
//		this.salary = salary;
//	}
	
//2번 방법: 매개변수 생성자와 기본 생성자를 같이 만들어준다
	public Employee() {}
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
}
