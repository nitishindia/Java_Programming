package Fibonacci_Series;

public class Example {

	public static void main(String[] args) {
		
		int a =0;
		int b = 1;
		int c = 0;
		
		int n = 8;
		
		for (int i=1; i<=8; i++) {
			System.out.println(a);
			
			c=a+b;
			a=b;
			b=c;
		}

	}

}
