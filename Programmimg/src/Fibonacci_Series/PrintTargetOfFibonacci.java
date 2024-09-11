package Fibonacci_Series;

public class PrintTargetOfFibonacci {

	public static void main(String[] args) {
		
		int a = 0;
		int b = 1;
		int c = 0;
		int n = 5;
		
		for(int i=1; i<=n; i++) {		
			if(n==i) {
				System.out.println(a);
			}
			c=a+b;
			a=b;
			b=c;
		}

	}

}
