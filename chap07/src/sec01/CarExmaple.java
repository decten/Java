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
		
//		System.out.println("승용차 속도는 "+ sedan1.speed + "km, 색상은 "+sedan1.color +", 좌석수는" + sedan1.getSeatNum()+"개 입니다.");
		System.out.println("승용차 속도는 "+ sedan1.speed + "km, 좌석수는 "+ sedan1.getSeatNum()+"개 입니다.");
		System.out.println("트럭 속도는 "+ truck1.speed + "km, 적재량은 "+ truck1.getCapacity()+"톤 입니다.");
	}

}
