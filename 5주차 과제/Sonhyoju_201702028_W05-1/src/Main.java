import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int score;
		int count=0;
		int SumOfScores=0;
		int a=0,b=0,c=0,d=0,f=0;
		char grade;

		System.out.println("<<���� ó�� ���α׷��� �����մϴ�>>");
		System.out.print("������ �Է��Ͻÿ�: ");
		score=scanner.nextInt();
		while (score>=0) {
			if (score>100) {
				System.out.println("����: 100 �� �Ѵ� ������ �ԷµǾ����ϴ�.");
			}
			else {
				if(score>=90&&score<=100) {
					grade='A';
					a++;
				}
				else if(score>=80&&score<=89) {
					grade='B';
					b++;
				}
				else if(score>=70&&score<=79) {
					grade='C';
					c++;
				}
				else if(score>=60&&score<=69) {
					grade='D';
					d++;
				}
				else {
					grade='F';
					f++;
				}

				System.out.println("(����: "+score+", ����: "+grade+")");

			}
			System.out.print("������ �Է��Ͻÿ�: ");
			score=scanner.nextInt();

		}   
		count=count+1;
		SumOfScores=SumOfScores+score;
		System.out.println();
		System.out.println("�л����� "+count+"���Դϴ�.");
		System.out.println("A�� "+a+"�� �Դϴ�.");
		System.out.println("B�� "+b+"�� �Դϴ�.");
		System.out.println("C�� "+c+"�� �Դϴ�.");
		System.out.println("D�� "+d+"�� �Դϴ�.");
		System.out.println("F�� "+f+"�� �Դϴ�.");
		double average=(double)SumOfScores/(double)count;
		System.out.println("����� "+average+"�� �Դϴ�.");
		System.out.println("<<���� ó�� ���α׷��� �����մϴ�>>");

		scanner.close();


	}

}


