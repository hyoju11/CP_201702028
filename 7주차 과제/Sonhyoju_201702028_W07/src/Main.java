import java.util.Scanner;
public class Main {
	private static Scanner scanner=new Scanner(System.in);

	private static int inputScore() {
		int score;
		score=scanner.nextInt();
		return score;
	}

	private static double grade2Point(char aGrade) {
		if (aGrade=='A') {

			return 4.0;
		}
		else if (aGrade=='B') {
			return 3.0;
		}
		else if (aGrade=='C') {
			return 2.0;
		}
		else if (aGrade=='B') {
			return 1.0;
		}
		else {
			return 0.0;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("> �� ���� (����, ����, ��ǻ��)�� ������ ���ʷ� �Է��մϴ�:");

		int count1=0,count2=0,count3=0,count4=0,count5=0;
		int score_Korean=inputScore();
		int score_English=inputScore();
		int score_Computer=inputScore();

		while(score_Korean>=0 && score_English>=0 && score_Computer>=0) {

			if(score_Korean>100 || score_English>100 || score_Computer>100) {
				System.out.println("����: 100�� �Ѿ, �������� ������ �ƴմϴ�.");
			}
			else {
				char grade_Korean=score2grade(score_Korean);
				char grade_English=score2grade(score_English);
				char grade_Computer=score2grade(score_Computer);

				double point_Korean=grade2Point(grade_Korean);
				double point_English=grade2Point(grade_English);
				double point_Computer=grade2Point(grade_Computer);

				double gpa=calGPA(point_Korean,point_English,point_Computer);

				if(gpa>=4.0) {
					count1++;
				}
				else if(gpa>=3.0) {
					count2++;
				}
				else if(gpa>=2.0) {
					count3++;
				}
				else if(gpa>=1.0) {
					count4++;
				}
				else {
					count5++;
				}

				System.out.println("[��  ��] ����:"+score_Korean+", ����:"+grade_Korean+", ����:"+point_Korean);
				System.out.println("[��  ��] ����:"+score_English+", ����:"+grade_English+", ����:"+point_English);
				System.out.println("[��ǻ��] ����:"+score_Computer+", ����:"+grade_Computer+", ����:"+point_Computer);
				System.out.println("�� �л��� ��������� "+gpa+" �Դϴ�.");
			}
			System.out.print("> �� ���� (����, ����, ��ǻ��)�� ������ ���ʷ� �Է��մϴ�:");
			score_Korean=inputScore();
			score_English=inputScore();
			score_Computer=inputScore();
		}
		System.out.println("���� ������ �ԷµǾ� �Է��� �����մϴ�.");
		System.out.println();
		System.out.println("��������� 4.0 �̻��� �л��� "+count1+" ���Դϴ�.");
		System.out.println("��������� 3.0 �̻� 4.0 �̸��� �л��� "+count2+" ���Դϴ�.");
		System.out.println("��������� 2.0 �̻� 3.0 �̸��� �л��� "+count3+" ���Դϴ�.");
		System.out.println("��������� 1.0 �̻� 2.0 �̸��� �л��� "+count4+" ���Դϴ�.");
		System.out.println("��������� 1.0 �̻��� �л��� "+count5+" ���Դϴ�.");
		System.out.println("���α׷��� �����մϴ�.");
	}

	private static char score2grade(int aScore) {
		if (aScore>=90) {
			return 'A';
		}
		else if (aScore>=80) {
			return 'B';
		}
		else if (aScore>=70) {
			return 'C';
		}
		else if (aScore>=60) {
			return 'D';
		}
		else {
			return 'F';
		}
	}

	private static double calGPA(double point_Korean, double point_English, double point_Computer) {
		double gpa=(point_Korean+point_English+point_Computer)/3.0;
		return gpa;
	}

}




