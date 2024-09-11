package PerfactNumber;

public class Example {

	public static void main(String[] args) {
		
		int n = 6;			// factor of 6 = 1,2,3
							// given number = sum of Factor to the digit (6=1+2+3=(6)) is called perfact number.
		int sum = 0;
		
		for (int i=1; i<n; i++) {
			if(n%i==0) {
				sum=sum+i;
			}		
		}
		if(sum==n) {
		System.out.println("perfact number");
		}
		else {
			System.out.println("Not perfact number");
		}
	}
}
