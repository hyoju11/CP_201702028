import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		char userAnswer;

		System.out.println("이차방정식을 풀겠습니까?");
		System.out.print("풀겠으면 'Y'를 치십시오: ");
		userAnswer = scanner.next().charAt(0);
		while(userAnswer == 'Y'|| userAnswer == 'y') {
		
			scanner=new Scanner(System.in);
			double a,b,c, determinant, x1, x2;

			System.out.print("이차항의 계수를 입력하시오:");
			a=scanner.nextDouble();
			System.out.print("일차항의 계수를 입력하시오:");
			b=scanner.nextDouble();
			System.out.print("상수항의 계수를 입력하시오:");
			c=scanner.nextDouble();
			determinant=b*b-4*a*c;
			if(determinant<0) {
				System.out.println("실근이 존재하지 않습니다.");

			}
			else if(Math.abs(a)<0.00000001) {
				System.out.println("오류:이차항의 계수가 0이므로, 이차방정식을 풀 수 없습니다.");

			}
			else {
				x1=(-b+Math.sqrt(determinant))/(2.0*a);
				x2=(-b-Math.sqrt(determinant))/(2.0*a);
				System.out.println("The solution is either "+x1+ " or" +x2);
			}
			System.out.println();
			System.out.println("이차방정식을 풀겠습니까?");
			System.out.print("풀겠으면 'Y'를 치십시오: ");
			userAnswer = scanner.next().charAt(0);
			
		}
		scanner.close();
		System.out.println("이차방정식 풀이를 종료합니다.");


	}
}
