package homeWork;

public class Employee {
	protected String name;
	protected double salary; 
/* 1.private���� ������ ������ �ڽ� Ŭ�������� �ʱ�ȭ �ؼ� ������ �����. 
 * �׷��� salary�� ���� ��Ű���� �ڽ� Ŭ���������� ���� �����ϵ��� protected�� �����Ѵ�(private ������ �ٸ� ���� ������ ��� ����)
 * private���� ��� ����ϰ� ������ �ڽ� Ŭ�������� salary ��� �κ��� ����� */ 
	
/*2. �θ� Ŭ�������� �⺻ �����ڸ� ������ �ʰ� �Ű����� �����ڸ� ������µ�, �� ��� �����Ϸ��� �⺻ �����ڸ� ������ �ʴ´�. 
 * ������ �ڽ� Ŭ���������� �θ� Ŭ������ �⺻ �����ڰ� ȣ�� �Ǿ�� �ϴ� ��Ȳ�̶� ������ �����
 * �׷��� �θ� Ŭ�������� �Ű����� �����ڸ� ���ִ� ��� �Ǵ� �Ű����� �����ڿ� �⺻ �����ڸ� ���� ������ִ� ������� �ذ��� �� �ִ�.*/

//1�� ���: �Ű����� �����ڸ� ������ �����Ϸ��� �⺻ �����ڸ� ���� �� �ֵ��� �Ѵ�
//	public Employee(String name, double salary) {
//		this.name = name;
//		this.salary = salary;
//	}
	
//2�� ���: �Ű����� �����ڿ� �⺻ �����ڸ� ���� ������ش�
	public Employee() {}
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
}
