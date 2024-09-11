package Loop;

import java.util.Scanner;

public class PrintFactorial {

	public static void main(String[] args) {   // Fctorial : 5!=5*4*3*2*1 = 120
		
//		int fact =1;
//		int n=5;
//		for(int i=n; i>=1; i--) {
//			fact = fact*i;
//			
//		}
//		System.out.println(fact);
//
//	}
//
//}
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = s.nextInt();
		int fact = 1;
		for (int i=n; i>=1; i--) {
			fact = fact*i;
		}
		System.out.println(fact);
	}
}