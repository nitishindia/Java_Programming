package FirstDigit_EvenOrOdd;

public class Logic_2 {

	public static void main(String[] args) {
		
		int n = 234567;
		int d = 0;
		
		while(n>0) {
			 d = n%10;
			 n=n/10;
		}
		if(d%2==0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}

	}

}
