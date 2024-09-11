package FirstDigit_EvenOrOdd;

import java.util.Scanner;

public class FirstNo_Odd {

	public static void main(String[] args) {
		
//		int n = 1234;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = s.nextInt();
		
		int rev = 0;
		
		while(n>0) {
			int d = n%10;
			rev = rev*10+d;
			n=n/10;
		}
		int a=rev%10;
		if(a%2==0)
		System.out.println(a+" "+"= first number is even");
		else {
			System.out.println(a+" "+"= first number is odd");
		}
	}
}
