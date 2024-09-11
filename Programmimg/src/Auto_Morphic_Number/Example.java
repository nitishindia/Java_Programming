package Auto_Morphic_Number;

public class Example {

	public static void main(String[] args) {
		
	int n=25;
	int sq=n*n;
	
	while(n>0) {
		if(n%10==sq%10) {
			n=n/10;
			sq=sq/10;
		}
		else {
			break;
		}
	}
		if(n==0) {
			System.out.println("autoMorphic number");
		}
		else {
			System.out.println("Not automorphic number");
		}
	}
}
