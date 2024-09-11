package Practice;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		
//		int n = 9;
//		for(int i=1; i<=n; i++) {
//			if(n%i==0) {
//				System.out.println(i + "= factor of i");
//			}
//			else{
//				System.out.println(i + "= Not factor of i");
//			}
//		}
//	}
//}
		
	
	
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the Number");
	int n = s.nextInt();
	int sum = 0;
	for(int i=1; i<=n; i++) {
		if(n%i==0) {
			System.out.println(i);
		sum=sum+i;
			}
		}
	System.out.println(sum);
	}
}