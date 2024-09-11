package Xylem_phlom;

public class Practice {

	public static void main(String[] args) {
		
		int n= 21346;
		
		int l = n%10;
		n=n/10;
		int IS = 0;
		
		while(n>9) {
			int d = n%10;
			IS = IS+d;
			n=n/10;
		}
		int OS = n+l;
		if(IS==OS) {
			System.out.println("xylem number");
		}
		else {
			System.out.println("phloem number");
		}
	}

}
