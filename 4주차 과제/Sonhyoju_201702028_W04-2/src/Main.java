import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScanner=new Scanner(System.in);
		char userAnswer;
		int givenN;

		System.out.println("Factorial�� ����ϰڽ��ϱ�?");
		System.out.print("����Ϸ��� 'Y'�� ġ�ʽÿ�: ");
		userAnswer = myScanner.next().charAt(0);
		while(userAnswer=='Y'||userAnswer=='y') {
			System.out.print("N�� ���� �Է��Ͻÿ�: ");
			givenN = myScanner.nextInt();
			if (givenN<0) {
				System.out.println("����:N�� ���� �����̹Ƿ� ����� �� �� �����ϴ�.");
			}
			else if (givenN==0) {
				System.out.println("0!�� ���� 1�Դϴ�.");
			}
			else {
				int count=1;
				int fact=1;
				while(count<=givenN) {
					fact=fact*count;
					count=count+1;
				}
				System.out.println(givenN+" Factorial�� ���� "+fact+"�Դϴ�.");
			}
			System.out.println();
			System.out.println("Factorial�� ����ϰڽ��ϱ�?");
			System.out.print("����Ϸ��� 'Y'�� ġ�ʽÿ�: ");
			userAnswer = myScanner.next().charAt(0);
		}
		System.out.println();
		System.out.println("���α׷��� �����մϴ�.");
		myScanner.close();
	}

}
