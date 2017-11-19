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
		System.out.print(">두 과목 (국어, 컴퓨터)의 점수를 차례로 입력하시오: ");
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
				System.out.println("오류: 100이 넘어서, 정상적인 점수가 아닙니다.");
			}
			else {
				scores_Korean[numberOfStudents]=score_Korean;
				scores_Computer[numberOfStudents]=score_Computer;
				studentAverage[numberOfStudents]=(double)(scores_Korean[numberOfStudents]+scores_Computer[numberOfStudents])/2.0;
				numberOfStudents++;
			}
			System.out.print(">두 과목 (국어, 컴퓨터)의 점수를 차례로 입력하시오: ");
			score_Korean=inputScore();
			score_Computer=inputScore();
		}
		double sumOfAverage=0.0;
		int count=0;
		while(count<numberOfStudents) {
			sumOfAverage=sumOfAverage+studentAverage[count];
			count++;
		}
		System.out.println("음의 정수가 입력되어 입력을 종료합니다.");
		System.out.println();
		System.out.println("모두 "+numberOfStudents+"명의 성적이 입력되었습니다.");
		System.out.println();
		System.out.println("입력된 성적과 개인 평균은 다음과 같습니다.");
		count=0;
		while(count<numberOfStudents) {
			System.out.print("["+count+"]"+scores_Korean[count]+" "+scores_Computer[count]);
			System.out.println(" (평균 "+studentAverage[count]+")");
			count++;
		}
		System.out.println("학급 평균은 "+sumOfAverage/numberOfStudents+"입니다.");
		int aboveAverage=0;
		count=0;
		while(count<numberOfStudents) {
			if((double)studentAverage[count]>=sumOfAverage/numberOfStudents) {
				aboveAverage++;
			}
			count++;
		}
		System.out.println("평균 이상인 학생의 수는 "+aboveAverage+"명입니다.");
		System.out.println();
		System.out.println("프로그램을 종료합니다.");
	}


}
