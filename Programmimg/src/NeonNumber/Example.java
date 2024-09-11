package NeonNumber;

public class Example {

	public static void main(String[] args) {
	
// Given number (9)= sum of squared value (9*9=81)     81=(8+1=9)=9  should be same 
		int n = 9;
		int sq = n*n;
		int sum = 0;
		
		while(sq>0) {
			int d = sq%10;
			sum=sum+d;
			sq=sq/10;
		}
		if(sum==n) {
			System.out.println("Neon number");
		}
		else {
			System.out.println("not neon number");
		}

	}
}
