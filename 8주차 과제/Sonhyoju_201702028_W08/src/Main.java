import java.util.Scanner;

public class Main {
	private static Scanner scanner = new Scanner(System.in);
	private static final int MAX_SIZE=100;
	private static int inputScore() {
		int scoreFormScanner;
		scoreFormScanner=scanner.nextInt();
		return scoreFormScanner;
	}
	public static void main(String[] args) {
		System.out.print(">�� ���� (����, ��ǻ��)�� ������ ���ʷ� �Է��Ͻÿ�: ");
		int score_Korean;
		int[] scores_Korean=new int[MAX_SIZE];
		int score_Computer;
		int[] scores_Computer=new int[MAX_SIZE];
		int numberOfStudents=0;
		double[] studentAverage=new double[MAX_SIZE];
		score_Korean=inputScore();
		score_Computer=inputScore();
		while(score_Korean>=0 && score_Computer>=0) {
			if(score_Korean>100 || score_Computer>100) {
				System.out.println("����: 100�� �Ѿ, �������� ������ �ƴմϴ�.");
			}
			else {
				scores_Korean[numberOfStudents]=score_Korean;
				scores_Computer[numberOfStudents]=score_Computer;
				studentAverage[numberOfStudents]=(double)(scores_Korean[numberOfStudents]+scores_Computer[numberOfStudents])/2.0;
				numberOfStudents++;
			}
			System.out.print(">�� ���� (����, ��ǻ��)�� ������ ���ʷ� �Է��Ͻÿ�: ");
			score_Korean=inputScore();
			score_Computer=inputScore();
		}
		double sumOfAverage=0.0;
		int count=0;
		while(count<numberOfStudents) {
			sumOfAverage=sumOfAverage+studentAverage[count];
			count++;
		}
		System.out.println("���� ������ �ԷµǾ� �Է��� �����մϴ�.");
		System.out.println();
		System.out.println("��� "+numberOfStudents+"���� ������ �ԷµǾ����ϴ�.");
		System.out.println();
		System.out.println("�Էµ� ������ ���� ����� ������ �����ϴ�.");
		count=0;
		while(count<numberOfStudents) {
			System.out.print("["+count+"]"+scores_Korean[count]+" "+scores_Computer[count]);
			System.out.println(" (��� "+studentAverage[count]+")");
			count++;
		}
		System.out.println("�б� ����� "+sumOfAverage/numberOfStudents+"�Դϴ�.");
		int aboveAverage=0;
		count=0;
		while(count<numberOfStudents) {
			if((double)studentAverage[count]>=sumOfAverage/numberOfStudents) {
				aboveAverage++;
			}
			count++;
		}
		System.out.println("��� �̻��� �л��� ���� "+aboveAverage+"���Դϴ�.");
		System.out.println();
		System.out.println("���α׷��� �����մϴ�.");
	}


}
