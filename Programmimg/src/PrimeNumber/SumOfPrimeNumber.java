package PrimeNumber;

public class SumOfPrimeNumber {

	public static void main(String[] args) {
		
		int s = 1;
		int e = 10;
		int sum = 0;
		
		
		for(int i=s; i<=e; i++) {
			int n=i;
			int count = 0;
			
			
			for(int j=1; j<=n; j++) {
				if(n%j==0) {
					count++;
				}	
			}
			if(count==2) {
				sum=sum+n;
				System.out.println(n);
			}
		}
		System.out.println(sum);	
	}
}
