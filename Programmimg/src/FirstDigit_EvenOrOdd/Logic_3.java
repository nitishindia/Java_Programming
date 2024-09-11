package FirstDigit_EvenOrOdd;

public class Logic_3 {

	public static void main(String[] args) {
		
		int n = 8754;

		while(n>9) {
			n=n/10;
		}
		if(n%2==0) {
			System.out.println(n+" "+"first number is even");
		}
		else {
			System.out.println(n+" "+"first number is odd");
		}
	}

}
