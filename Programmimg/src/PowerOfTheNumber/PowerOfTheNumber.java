package PowerOfTheNumber;

import java.util.Scanner;

public class PowerOfTheNumber {

	public static void main(String[] args) {
		
//		int n = 5;
//		int p = 5;
//		int power = 1;
//		
//		for (int i=1; p>=i; i++) {
//			power = power*n;
//		}
//		 System.out.println(power);
//	}
//}


	Scanner s = new Scanner(System.in);
	System.out.println("Enter the number");
	int n = s.nextInt();
	System.out.println("enter the power number");
	int p = s.nextInt();
	int power = 1;
	for(int i=1; p>=i; i++) {
		power = power*n;
	}
	System.out.println(power);
 }
}