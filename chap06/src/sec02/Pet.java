package sec02;

public class Pet {

	String type;
	String name;
	int month;
	
	public static void main(String[] args) {
		Pet animal1, animal2, animal3;
		animal1 = new Pet();
		animal2 = new Pet();
		animal3 = new Pet();
		
		animal1.type="������";
		animal1.name="�ڹ�";
		animal1.month=5;
		System.out.println(animal1.name+"�� " +animal1.type+"�̰� "+ animal1.month+"�����Դϴ�");
		
		animal2.type="�����";
		animal2.name="���";
		animal2.month=9;
		System.out.println(animal2.name+"�� " +animal2.type+"�̰� "+ animal2.month+"�����Դϴ�");
		
		animal3.type="�����";
		animal3.name="Ŭ����";
		animal3.month=27;
		System.out.println(animal3.name+"�� " +animal3.type+"�̰� "+ animal3.month+"�����Դϴ�");
		
	}

}
