package Practice;

import java.util.Scanner;

public class Happy_Unhappy_Number {

	public static void main(String[] args) {
	
//		int n = 13;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = s.nextInt();
		
		while(true) {
		int sum = 0;
		
		while(n>0) {
			int d = n%10;
			sum=sum+(d*d);
			n=n/10;
		}
		if(sum==1) {
			System.out.println("happy number");
			break;
		}
		else if(sum==4) {
			System.out.println("Unhappy number");
			break;
		}
		n=sum;
		}
	}

}
