package chap02;

public class VariableExample {

	public static void main(String[] args) {
		int hour = 3;
		int minute = 5;
		System.out.println(hour+"�ð� "+ minute + "��");
		
		if(hour>0) {
			int newHour = 7;
			hour = newHour;
			System.out.println(hour+"�ð� "+ minute + "��");
		}
		System.out.println(hour+"�ð� "+ minute + "��");
	}

}
