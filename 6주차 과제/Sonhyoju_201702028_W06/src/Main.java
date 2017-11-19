
public class Main {

	private static double  mySine(double x) {
		double  xSquare = x * x ; 
		double  currentTerm = x ; int  n = 2 ; 
		double sineValue = currentTerm ;
		while ( Math.abs(currentTerm) >= 0.000001 ) { 
			currentTerm = - currentTerm * xSquare / (double) ( n*(n+1) ) ; 
			sineValue = sineValue + currentTerm ;
			n = n + 2 ;
		} 
		return  sineValue ;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		double radian,sineValue;
		while(a>=1 && a<=180) {
			int numberOfAsterisks;
			radian = ( (double) a / 180.0) * 3.141592 ;
			sineValue=mySine(radian);
			numberOfAsterisks = (int) ((sineValue * 40.0) + 0.5 ) ;
			System.out.print("sine("+a+"µµ):");
			a= a+5;
			printAsterisks(numberOfAsterisks);
			System.out.println();
		}
	}
	
	private static void printAsterisks (int n) {
		int x=0;
		while(x<n) {
			System.out.print("*");
			x++;
		}
	}
	
}