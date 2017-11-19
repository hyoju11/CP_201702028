import java.util.Scanner;

public class Main {
	private static Scanner scanner=new Scanner(System.in);
	private static int inputScore() {
		int score;
		score=scanner.nextInt();
		return score;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student currentStudent;
		currentStudent=new Student();
		
		GPACounter counter;
		counter=new GPACounter();

		System.out.print(">�� ����(����.����,��ǻ��)�� ������ ���ʷ� �Է��Ͻÿ�:");
		int aScoreKorean;
		int aScoreEnglish;
		int aScoreComputer;

		char aGradeKorean=0;
		char aGradeEnglish=0;
		char aGradeComputer=0;

		aScoreKorean=inputScore();
		currentStudent.setScoreKorean(aScoreKorean);

		aScoreEnglish=inputScore();
		currentStudent.setScoreEnglish(aScoreEnglish);

		aScoreComputer=inputScore();
		currentStudent.setScoreComputer(aScoreComputer);

		while(aScoreKorean>=0 && aScoreEnglish>=0 && aScoreComputer>=0) {
			if(aScoreKorean>100 || aScoreEnglish>100 || aScoreComputer>100) {
				System.out.println("����: 100�� �Ѿ, �������� ������ �ƴմϴ�.");
			}
			else {
				aGradeKorean=currentStudent.gradeKorean();
				aGradeEnglish=currentStudent.gradeEnglish();
				aGradeComputer=currentStudent.gradeComputer();

				double point_Korean=currentStudent.pointKorean();
				double point_English=currentStudent.pointEnglish();
				double point_Computer=currentStudent.pointComputer();


				System.out.println("[��  ��] ����:"+aScoreKorean+", ����:"+aGradeKorean+", ����:"+point_Korean);
				System.out.println("[��  ��] ����:"+aScoreEnglish+", ����:"+aGradeEnglish+", ����:"+point_English);
				System.out.println("[��ǻ��] ����:"+aScoreComputer+", ����:"+aGradeComputer+", ����:"+point_Computer);
				double gpa=counter.calGPA(point_Korean,point_English,point_Computer);
				System.out.println("�� �л��� ��������� "+gpa+"���Դϴ�.");
				counter.count(gpa);
				
			}
			System.out.print(">�� ����(����.����,��ǻ��)�� ������ ���ʷ� �Է��Ͻÿ�:");

			aScoreKorean=inputScore();
			currentStudent.setScoreKorean(aScoreKorean);

			aScoreEnglish=inputScore();
			currentStudent.setScoreEnglish(aScoreEnglish);

			aScoreComputer=inputScore();
			currentStudent.setScoreComputer(aScoreComputer);
		}

	


		System.out.println("���� ������ �ԷµǾ� �Է��� �����մϴ�.");
		System.out.println();
		System.out.println("��������� 3.0 �̻��� �л��� "+counter.numberOfGPA3()+" ���Դϴ�.");
		System.out.println("��������� 2.0 �̻� 3.0 �̸��� �л��� "+counter.numberOfGPA2()+" ���Դϴ�.");
		System.out.println("��������� 1.0 �̻� 2.0 �̸��� �л��� "+counter.numberOfGPA1()+" ���Դϴ�.");
		System.out.println("��������� 1.0 �̸��� �л��� "+counter.numberOfGPA0()+" ���Դϴ�.");
		System.out.println("���α׷��� �����մϴ�.");
	}

}
