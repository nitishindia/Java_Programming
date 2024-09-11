package StrongNumber;

public class StrongNumber {

	public static void main(String[] args) {
		int n=145;
		int copy=n;
		int sum=0;
		while (n>0)
		{
			
			int d = n%10;
			int fact =1;
			for(int i=d; i>=1; i--) {
				fact=fact*i;
			}
			sum=sum+fact;
			n=n/10;
		}
		if (copy==sum) {
			System.out.println("Given number is Strong number");
		}
		else {
			System.out.println("given number is not strong number");
		}
	}

}
