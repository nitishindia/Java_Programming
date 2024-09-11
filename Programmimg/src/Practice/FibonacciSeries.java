package Practice;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int a=0, b=1, c=0, n=8;
		
		for(int i=1; i<=n; i++) {
			System.out.println(a);
			
			c=a+b;
			a=b;
			b=c;
			
			if(i==n) {
				System.out.println("Nth fibonacci Number is "+a);
			}
			
		}
	}
}
