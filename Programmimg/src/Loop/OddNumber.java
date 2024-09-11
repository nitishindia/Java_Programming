package Loop;

import java.util.Scanner;

public class OddNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting number");
		int S = sc.nextInt();
		System.out.println("Enter the End Number");
		int E = sc.nextInt();
//		int S = 1;
//		int E = 10;
		for (int i=S; i<=E; i++) {
			if(i%2!=0) {
			System.out.println(i);
			}
		}	
	}
}
