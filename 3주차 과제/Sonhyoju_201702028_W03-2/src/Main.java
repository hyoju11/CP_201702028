import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScanner=new Scanner(System.in);
		int givenN, sum, count;
		
		System.out.print("1���� N ���� �հ踦 ���Ϸ��� �մϴ�. N �� �� �Է��Ͻʽÿ�:");
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
