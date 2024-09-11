package ReverseOrder;

import java.util.Scanner;

public class ReverseTheNumber {

	public static void main(String[] args) {
//		n=1234
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		int n = s.nextInt();
		int rev = 0;
		while(n>0) {
			int d = n%10;
			rev=rev*10+d;
			n=n/10;
		}
		System.out.println(rev);
	}

}
