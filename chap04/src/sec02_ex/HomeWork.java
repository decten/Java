package sec02_ex;
/*
�޸� ����� ���� �ּ����� �亯 �ۼ��ϰ� �Ǿ����ϴ�.

switch ���� break�� ��� ���� ������ �ش� ���� �� �ؿ� �ִ� �ٸ� ����� �ڵ嵵 ���� ���� ������
(���� ��� case 1, case 2, default�� ���� �� case 2�� �ش��ϴ� ����̶�� case 2 ����� �ڵ�� default �ڵ尡 ��� ���� �˴ϴ�)
if�� ���� �׷��� �ʾƼ� ���̽����� ��� ������� �մϴ�.
(if,else if, else���� else if�� �ش��ϸ� else if�� �ش��ϴ� �ڵ常 ���� �ǰ� else�� �ڵ�� ���� ���� �ʽ��ϴ�)

*/
public class HomeWork {
	public static void main(String[] args) {
		for(int i=1; i<10; i++) {
			for(int j=2; j<10; j++) {
				System.out.print(j+" x "+i+"= "+i*j+"\t");
			}
			System.out.println();
		}
	}

}
