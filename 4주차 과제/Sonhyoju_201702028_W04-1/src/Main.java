import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		char userAnswer;

		System.out.println("������������ Ǯ�ڽ��ϱ�?");
		System.out.print("Ǯ������ 'Y'�� ġ�ʽÿ�: ");
		userAnswer = scanner.next().charAt(0);
		while(userAnswer == 'Y'|| userAnswer == 'y') {
		
			scanner=new Scanner(System.in);
			double a,b,c, determinant, x1, x2;

			System.out.print("�������� ����� �Է��Ͻÿ�:");
			a=scanner.nextDouble();
			System.out.print("�������� ����� �Է��Ͻÿ�:");
			b=scanner.nextDouble();
			System.out.print("������� ����� �Է��Ͻÿ�:");
			c=scanner.nextDouble();
			determinant=b*b-4*a*c;
			if(determinant<0) {
				System.out.println("�Ǳ��� �������� �ʽ��ϴ�.");

			}
			else if(Math.abs(a)<0.00000001) {
				System.out.println("����:�������� ����� 0�̹Ƿ�, ������������ Ǯ �� �����ϴ�.");

			}
			else {
				x1=(-b+Math.sqrt(determinant))/(2.0*a);
				x2=(-b-Math.sqrt(determinant))/(2.0*a);
				System.out.println("The solution is either "+x1+ " or" +x2);
			}
			System.out.println();
			System.out.println("������������ Ǯ�ڽ��ϱ�?");
			System.out.print("Ǯ������ 'Y'�� ġ�ʽÿ�: ");
			userAnswer = scanner.next().charAt(0);
			
		}
		scanner.close();
		System.out.println("���������� Ǯ�̸� �����մϴ�.");


	}
}
