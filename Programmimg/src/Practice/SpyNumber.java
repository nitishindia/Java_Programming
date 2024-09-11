package Practice;

public class SpyNumber {

	public static void main(String[] args) {
		
		int n = 123;
		int sum = 0;
		int prd = 1;
		
		while(n>0) {
			int d=n%10;
			sum=sum+d;
			prd=prd*d;
			n=n/10;
		}
		if(sum==prd) {
			System.out.println("spy number");
		}
		else {
			System.out.println("not spy number");
		}

	}

}
