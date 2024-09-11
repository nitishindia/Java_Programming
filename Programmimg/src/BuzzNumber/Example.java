package BuzzNumber;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);		// Buzz No. = Number should be divisible by 7 or Reminder should be 0,7 
		System.out.println("enter the number");
		int n = s.nextInt();
		if(n%7==0||n%7==7) {
			System.out.println("Buzz Number");
		}
		else {
			System.out.println("Not Buzz Number");
		}

	}

}
