package sec01;

public class CarExmaple {

	public static void main(String[] args) {
		Sedan sedan1 = new Sedan();
		sedan1.upSpeed(300);
		sedan1.seatNum = 5; 
		//sedan1.color="red";
		
		Truck truck1 = new Truck("Blue",0,0);
		truck1.upSpeed(100);
		truck1.capacity = 50;
		
//		System.out.println("�¿��� �ӵ��� "+ sedan1.speed + "km, ������ "+sedan1.color +", �¼�����" + sedan1.getSeatNum()+"�� �Դϴ�.");
		System.out.println("�¿��� �ӵ��� "+ sedan1.speed + "km, �¼����� "+ sedan1.getSeatNum()+"�� �Դϴ�.");
		System.out.println("Ʈ�� �ӵ��� "+ truck1.speed + "km, ���緮�� "+ truck1.getCapacity()+"�� �Դϴ�.");
	}

}
