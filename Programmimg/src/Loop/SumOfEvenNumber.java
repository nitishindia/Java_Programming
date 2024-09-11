package Loop;

import java.util.Scanner;

public class SumOfEvenNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Starting number");
		int S = sc.nextInt();
		System.out.println("Enter the last number");
		int E = sc.nextInt();
		int sum=0;
		for(int i=S; i<=E; i++) {
			if(i%2==0) {
				sum=sum+i;
				System.out.println(i);
			}
		}
		System.out.println("sum of the even number"+" "+ sum);
	}

}
