package NthPrimNumber;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		
		
	//	int t=5;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the target number");
		int t = sc.nextInt();
		
		int count1=0;
		for(int i=1; count1<t; i++) {
			int n=i;
			int count=0;
			for(int j=1; j<=n; j++) {
				if(n%j==0) {
					count++;
				}
			}
				if(count==2) {
					count1++;	
			}
			if(count1==t) {
				System.out.println(i);
			}
		}
	}

}