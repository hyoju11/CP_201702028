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
		System.out.print("> 세 과목 (국어, 영어, 컴퓨터)의 점수를 차례로 입력합니다:");

		int count1=0,count2=0,count3=0,count4=0,count5=0;
		int score_Korean=inputScore();
		int score_English=inputScore();
		int score_Computer=inputScore();

		while(score_Korean>=0 && score_English>=0 && score_Computer>=0) {

			if(score_Korean>100 || score_English>100 || score_Computer>100) {
				System.out.println("오류: 100이 넘어서, 정상적인 점수가 아닙니다.");
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

				System.out.println("[국  어] 점수:"+score_Korean+", 학점:"+grade_Korean+", 평점:"+point_Korean);
				System.out.println("[영  어] 점수:"+score_English+", 학점:"+grade_English+", 평점:"+point_English);
				System.out.println("[컴퓨터] 점수:"+score_Computer+", 학점:"+grade_Computer+", 평점:"+point_Computer);
				System.out.println("이 학생의 평균평점은 "+gpa+" 입니다.");
			}
			System.out.print("> 세 과목 (국어, 영어, 컴퓨터)의 점수를 차례로 입력합니다:");
			score_Korean=inputScore();
			score_English=inputScore();
			score_Computer=inputScore();
		}
		System.out.println("음의 정수가 입력되어 입력을 종료합니다.");
		System.out.println();
		System.out.println("평균평점이 4.0 이상인 학생은 "+count1+" 명입니다.");
		System.out.println("평균평점이 3.0 이상 4.0 미만인 학생은 "+count2+" 명입니다.");
		System.out.println("평균평점이 2.0 이상 3.0 미만인 학생은 "+count3+" 명입니다.");
		System.out.println("평균평점이 1.0 이상 2.0 미만인 학생은 "+count4+" 명입니다.");
		System.out.println("평균평점이 1.0 미상인 학생은 "+count5+" 명입니다.");
		System.out.println("프로그램을 종료합니다.");
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




