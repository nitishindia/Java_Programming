package SwapNumber;

public class Swap {

	public static void main(String[] args) {
		
		int a = 100;
		int b = 200;
		int c = a; // c=100
		
		a=b;		// a=200
		b=c;		// b=100
		
		System.out.println(a);
		System.out.println(b);
	}
}
