package Practice;

public class AutoMorphic_Number {

	public static void main(String[] args) {

		int n=25;
		int n1 = n*n;
		
		while(n>0) {
			if(n%10==n1%10) {
				n=n/10;
	//			n1=n1/10;
		}
//			else {
//				break;
//			}
		}
		if(n==0) {
			System.out.println("Automorphic Number");
		}
		else {
			System.out.println("Not Automorphic Number");
		}
	}

}
