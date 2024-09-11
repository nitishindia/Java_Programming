package Fibonacci_Series;

public class PrintTargetOfFibonacciNumber {

	public static void main(String[] args) {
		
		int a = 0;
		int b = 1;
		int c = 0;
		int t = 5;
		
		for(int i=1; i<5; i++) {
			
			c=a+b;
			a=b;
			b=c;
		}
		System.out.println(a);

	}

}
