
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("<<Sine �� ��� ���α׷��� �����մϴ�>>");
		int n=1;
		double x,y;

		while(n>=1 && n<=180) {
			x=(double)n*(3.141592/180.0);
			y=Math.sin(x);
			System.out.println("Sine("+n+"��) �� "+y+" �Դϴ�.");
			n++;
			
		}
		System.out.println("<<Sine �� ��� ���α׷��� �����մϴ�>>");

	}

}
