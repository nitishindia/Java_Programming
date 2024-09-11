package ProductOfGivenNumber;

public class Example {

	public static void main(String[] args) {
		
		int n = 123456;
		int prod = 1;
		
		while(n>0) {
			int d = n%10;
			prod=prod*d;
			n=n/10;
		}
		System.out.println(prod);

	}

}
