package sec02_ex;
/*
메모 기능을 몰라 주석으로 답변 작성하게 되었습니다.

switch 문은 break를 사용 하지 않으면 해당 경우와 그 밑에 있는 다른 경우의 코드도 같이 실행 되지만
(예를 들어 case 1, case 2, default가 있을 때 case 2에 해당하는 사건이라면 case 2 경우의 코드와 default 코드가 모두 실행 됩니다)
if의 경우는 그렇지 않아서 케이스마다 모두 적어줘야 합니다.
(if,else if, else에서 else if에 해당하면 else if에 해당하는 코드만 실행 되고 else의 코드는 실행 되지 않습니다)

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
