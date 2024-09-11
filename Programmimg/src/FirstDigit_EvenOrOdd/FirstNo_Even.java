package FirstDigit_EvenOrOdd;

public class FirstNo_Even {

	public static void main(String[] args) {
		
		int n = 23;
		int rev = 0;
		
		while(n>0) {
			int d = n%10;
			rev=rev*10+d;
			n=n/10;
		}
		int a=rev%10;
			if(a%2==0) {
				System.out.println(a+" "+"first number is even ");
			}
		

	}

}
