import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScanner=new Scanner(System.in);
		char userAnswer;
		int givenN;

		System.out.println("Factorial을 계산하겠습니까?");
		System.out.print("계산하려면 'Y'를 치십시오: ");
		userAnswer = myScanner.next().charAt(0);
		while(userAnswer=='Y'||userAnswer=='y') {
			System.out.print("N의 값을 입력하시오: ");
			givenN = myScanner.nextInt();
			if (givenN<0) {
				System.out.println("오류:N의 값이 음수이므로 계산을 할 수 없습니다.");
			}
			else if (givenN==0) {
				System.out.println("0!의 값은 1입니다.");
			}
			else {
				int count=1;
				int fact=1;
				while(count<=givenN) {
					fact=fact*count;
					count=count+1;
				}
				System.out.println(givenN+" Factorial의 값은 "+fact+"입니다.");
			}
			System.out.println();
			System.out.println("Factorial을 계산하겠습니까?");
			System.out.print("계산하려면 'Y'를 치십시오: ");
			userAnswer = myScanner.next().charAt(0);
		}
		System.out.println();
		System.out.println("프로그램을 종료합니다.");
		myScanner.close();
	}

}
