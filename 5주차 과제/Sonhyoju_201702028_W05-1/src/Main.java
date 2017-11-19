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

		System.out.println("<<성적 처리 프로그램을 시작합니다>>");
		System.out.print("성적을 입력하시오: ");
		score=scanner.nextInt();
		while (score>=0) {
			if (score>100) {
				System.out.println("오류: 100 이 넘는 성적이 입력되었습니다.");
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

				System.out.println("(성적: "+score+", 학점: "+grade+")");

			}
			System.out.print("성적을 입력하시오: ");
			score=scanner.nextInt();

		}   
		count=count+1;
		SumOfScores=SumOfScores+score;
		System.out.println();
		System.out.println("학생수는 "+count+"명입니다.");
		System.out.println("A는 "+a+"명 입니다.");
		System.out.println("B는 "+b+"명 입니다.");
		System.out.println("C는 "+c+"명 입니다.");
		System.out.println("D는 "+d+"명 입니다.");
		System.out.println("F는 "+f+"명 입니다.");
		double average=(double)SumOfScores/(double)count;
		System.out.println("평균은 "+average+"점 입니다.");
		System.out.println("<<성적 처리 프로그램을 종료합니다>>");

		scanner.close();


	}

}


