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
		
		animal1.type="강아지";
		animal1.name="자바";
		animal1.month=5;
		System.out.println(animal1.name+"는 " +animal1.type+"이고 "+ animal1.month+"개월입니다");
		
		animal2.type="고양이";
		animal2.name="언어";
		animal2.month=9;
		System.out.println(animal2.name+"는 " +animal2.type+"이고 "+ animal2.month+"개월입니다");
		
		animal3.type="고양이";
		animal3.name="클래스";
		animal3.month=27;
		System.out.println(animal3.name+"는 " +animal3.type+"이고 "+ animal3.month+"개월입니다");
		
	}

}
