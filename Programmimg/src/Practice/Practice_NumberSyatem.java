package Practice;

public class Practice_NumberSyatem {

	public static void main(String[] args) {
		
	// Prime Number
//		int n = 13;
//		int count = 0;
//		for(int i=1; i<=n; i++) {
//			if(n%i==0) {
//				count++;
//			}
//		}
//		if(count==2) {
//			System.out.println("Prime Number");
//		}
//		else {
//			System.out.println("Not Prime Number");
//		}
		
	// Factorial Program	
//		int n = 5;
//		int fact = 1;
//		for (int i=n; i>=1; i--) {
//			fact=fact*i;
//		}
//		System.out.println(fact);	
		
	// Prime Number b/w the range
		
//		int s = 1;
//		int e = 10; 
//		for (int i=s; i<=e; i++) {
//			int count=0;
//			for(int j=1; j<=i; j++) {
//				if (i%j==0) {
//					count++;
//					}
//				}
//			if(count==2) {
//				System.out.println(i);
//			}
//		}
		
	// Reverse the given Number
		
//		int n = 12345678;
//		int rev = 0;
//		while(n>0) {
//			int d = n%10;
//			rev = rev*10+d;
//			n=n/10;
//		}
//		System.out.println(rev);
		
	//Xylam and Phloam
//		int n = 1234;
//		int l = n%10;  // 4
//		int n1 = n/10; // 123
//		int innerSum = 0; 
//		while (n1>9) {
//			int d = n1%10;
//			innerSum = innerSum +d;
//			n1 = n1/10;
//		}
//		int OutterSum = n1+l;
//		
//		if (innerSum==OutterSum) {
//			System.out.println("Xylam");
//		}
//		else {
//			System.out.println("Phloam");
//		}
		
		
	// Fibonacii Number
		
//		//series = 0,1,1,2,3,5,8,13,21..
//				
//				int a=0, b=1, c=0;
//				
//				for(int i=0; i<9; i++) {
//					System.out.println(a);
//					c=a+b;
//					a=b;
//					b=c;
//				}
		
		
	// check even or Odd
//		
//		int n = 11;
//		if (n%2==0) {
//			System.out.println("Even");
//		}
//		else {
//			System.out.println("Odd");
//		}
				
	// find Nth Prime Number
		int t = 5;
		int count1 = 0;
		
		for (int i=1; count1<t; i++) {
			int count=0;
			for(int j=1; j<=i; j++) {
				if (i%j==0) {
					count++;
				}
			}
			if (count==2) {
				count1++;
			}
			if (count1==t) {
				System.out.println(i);
			}
		}
		
		
	}

}
