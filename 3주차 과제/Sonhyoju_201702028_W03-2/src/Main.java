import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScanner=new Scanner(System.in);
		int givenN, sum, count;
		
		System.out.print("1부터 N 까지 합계를 구하려고 합니다. N 값 을 입력하십시오:");
		givenN=myScanner.nextInt();
		sum=0;
		count=0;
		while(count<givenN) {
		count=count+1;
		sum=sum+count;
		System.out.println("Sum is " + sum);
		}
		
		myScanner.close();
		
   }
 }
