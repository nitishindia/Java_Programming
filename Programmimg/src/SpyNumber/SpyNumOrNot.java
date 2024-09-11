package SpyNumber;

public class SpyNumOrNot {				

	public static void main(String[] args) {
		
		int n = 123;		// Sum and multiplication of given number should be same is called SPY Number
		int sum = 0;
		int prod = 1;
		
		while(n>0) {
			int d = n%10;
			sum=sum+d;
			prod=prod*d;
			n=n/10;		
		}
		if(sum==prod) {
		System.out.println(sum+"="+prod+" "+"(Spy Number)");
		}
		else {
			System.out.println("Not Spy Number");
		}
	}

}
