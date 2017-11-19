import java.util.Scanner;

public class Main {
	private static Scanner scanner = new Scanner(System.in);
	private static final int MAX_SIZE=100;

	private static int inputScore() {
		int scoreFormScanner;
		System.out.print(">������ �Է��Ͻÿ�: ");
		scoreFormScanner=scanner.nextInt();
		return scoreFormScanner;
	}
	private static double calcAverage(int[]elements,int aSize) {
		int i=0;
		int sum=0;
		double average;
		while(i<aSize) {
			sum=sum+elements[i];
			i++;
		}
		average=(double)sum/(double)aSize;
		return average;
	}
	private static int calcMax(int[]elements,int aSize) {
		int max=elements[0];
		int i=1;
		while(i<aSize) {
			if(max<elements[i]) {
				max=elements[i];
			}
			i++;
		}
		return max;
	}
	private static int calcMin(int[]elements, int aSize) {
		int min=elements[0];
		int i=1;
		while(i<aSize) {
			if(min>elements[i]) {
				min=elements[i];
			}
			i++;
		}
		return min;
	}
	private static void selectionSort(int[] elements, int aSize) {
		int lastLoc=aSize-1;
		int maxLoc;
		int maxValue;

		int selectionLoc=0;
		while(selectionLoc<lastLoc) {
			maxLoc=selectionLoc;
			maxValue=elements[maxLoc];
			int curLoc=selectionLoc+1;
			while(curLoc<=lastLoc) {
				if(elements[curLoc]>maxValue) {
					maxLoc=curLoc;
					maxValue=elements[maxLoc];
				}
				curLoc++;
			}
			elements[maxLoc]=elements[selectionLoc];
			elements[selectionLoc]=maxValue;

			selectionLoc++;
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score;
		int[] scores=new int[MAX_SIZE];
		int numberOfStudents;
		double average;
		numberOfStudents=0;
		score=inputScore();
		while(score>=0) {
			if(score>100) {
				System.out.println("����:100�� �Ѿ, �������� ������ �ƴմϴ�.");
			}
			else {
				scores[numberOfStudents]=score;
				numberOfStudents++;
			}
			score=inputScore();
		}
		average=calcAverage(scores,numberOfStudents);
		System.out.println("���� ������ �ԷµǾ� �Է��� �����մϴ�.");
		System.out.println();
		System.out.println("��� "+numberOfStudents+"���� ������ �ԷµǾ����ϴ�.");
		System.out.println("����� "+average+" �Դϴ�.");
		System.out.println();
		System.out.println("�Էµ� ������ ������ �����ϴ�.");
		int count=0;
		while(count<numberOfStudents) {
			if(scores[count]<average) {
				System.out.println("["+count+"] "+scores[count]+" (��� �̸��Դϴ�.)");
			}
			else {
				System.out.println("["+count+"] "+scores[count]+" (��� �̻��Դϴ�.)");
			}
			count++;
		}
		int aboveAverage=0;
		count=0;
		while(count<numberOfStudents) {
			if(scores[count]>=average) {
				aboveAverage++;
			}
			count++;
		}
		System.out.println("��� �̻��� �л��� ���� "+aboveAverage+"���Դϴ�.");
		System.out.println();
		int maxScore=calcMax(scores,numberOfStudents);
		System.out.println("�ְ����� "+maxScore+" ���Դϴ�.");
		int minScore=calcMin(scores,numberOfStudents);
		System.out.println("�������� "+minScore+" ���Դϴ�.");
		System.out.println();
		System.out.println("�������� ������ �����ϴ�.");
		selectionSort(scores,numberOfStudents);
		count=0;
		while(count<numberOfStudents) {
			System.out.println("["+count+"] "+scores[count]);
			count++;
		}
		System.out.println("���α׷��� �����մϴ�.");

	}

}
