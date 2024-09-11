package PrimeNumber;

public class PrintPrimeNo {

	public static void main(String[] args) {
		
		int n = 7;			// prime number divisible by 1 and itself.
		int count = 0;
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				count++;
			}
		}
		if (count==2) {
			System.out.println("given number is prime numbers ");
		}
		else {
			System.out.println("given number is not prime number");
		}
	}

}
