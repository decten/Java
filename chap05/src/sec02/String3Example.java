package sec02;

public class String3Example {

	public static void main(String[] args) {
		String strVar1 = "Java ������";
		String strVar2 = "Java ������";
		
		if(strVar1==strVar2) {
			System.out.println("strVar1�� strVar2�� ������ ����");
		}
		else {
			System.out.println("strVar1�� strVar2�� ������ �ٸ�");
		}
		if(strVar1.equals(strVar2))
			System.out.println("strVar1�� strVar2�� ���ڿ��� ����");
		
		String strVar3 = new String("Java ������");
		String strVar4 = new String("Java ������");
		
		if(strVar3==strVar4) {
			System.out.println("strVar3�� strVar4�� ������ ����");
		}
		else {
			System.out.println("strVar3�� strVar4�� ������ �ٸ�");
		}
		if(strVar3.equals(strVar4))
			System.out.println("strVar3�� strVar4�� ���ڿ��� ����");
	}

}
