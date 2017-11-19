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

		System.out.print(">세 과목(국어.영어,컴퓨터)의 점수를 차례로 입력하시오:");
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
				System.out.println("오류: 100이 넘어서, 정상적인 점수가 아닙니다.");
			}
			else {
				aGradeKorean=currentStudent.gradeKorean();
				aGradeEnglish=currentStudent.gradeEnglish();
				aGradeComputer=currentStudent.gradeComputer();

				double point_Korean=currentStudent.pointKorean();
				double point_English=currentStudent.pointEnglish();
				double point_Computer=currentStudent.pointComputer();


				System.out.println("[국  어] 점수:"+aScoreKorean+", 학점:"+aGradeKorean+", 평점:"+point_Korean);
				System.out.println("[영  어] 점수:"+aScoreEnglish+", 학점:"+aGradeEnglish+", 평점:"+point_English);
				System.out.println("[컴퓨터] 점수:"+aScoreComputer+", 학점:"+aGradeComputer+", 평점:"+point_Computer);
				double gpa=counter.calGPA(point_Korean,point_English,point_Computer);
				System.out.println("이 학생의 평균평점은 "+gpa+"점입니다.");
				counter.count(gpa);
				
			}
			System.out.print(">세 과목(국어.영어,컴퓨터)의 점수를 차례로 입력하시오:");

			aScoreKorean=inputScore();
			currentStudent.setScoreKorean(aScoreKorean);

			aScoreEnglish=inputScore();
			currentStudent.setScoreEnglish(aScoreEnglish);

			aScoreComputer=inputScore();
			currentStudent.setScoreComputer(aScoreComputer);
		}

	


		System.out.println("음의 정수가 입력되어 입력을 종료합니다.");
		System.out.println();
		System.out.println("평균평점이 3.0 이상인 학생은 "+counter.numberOfGPA3()+" 명입니다.");
		System.out.println("평균평점이 2.0 이상 3.0 미만인 학생은 "+counter.numberOfGPA2()+" 명입니다.");
		System.out.println("평균평점이 1.0 이상 2.0 미만인 학생은 "+counter.numberOfGPA1()+" 명입니다.");
		System.out.println("평균평점이 1.0 미만인 학생은 "+counter.numberOfGPA0()+" 명입니다.");
		System.out.println("프로그램을 종료합니다.");
	}

}
