package Practice;

public class Neon_Number {

	public static void main(String[] args) {
	
		int n = 9;
		int n1 = n*n;
		int sum = 0;
		
		while(n1>0) {
			int d=n1%10;
			sum=sum+d;
			n1=n1/10;
			
		}
		if(sum==n) {
			System.out.println("Neon number");
		}
		else {
			System.out.println("Not Neon number");
		}
	}

}
