package PrimeNumber;

public class SumOfPrimeNo {

	public static void main(String[] args) {
		
		int s = 1;
		int e = 10;
		
		int sum = 0;
		
		for(int i=s; i<=e; i++) {
		//	int n=i;
			int count = 0;
			for(int j=1; j<=i; j++) {
				if(i%j==0) {
				count++;
				}
			}
			if(count==2) {
				sum= sum+i;
			System.out.println(i);
  		   }
		}
		System.out.println("sum of the prime number ="+" "+sum);
	}
}
