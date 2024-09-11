package GreatestCommonDivision;

public class Example {

	public static void main(String[] args) {
		
		int n1 = 6;
		int n2 = 18;
		
		int GDC=0;
		
		for(int i=1; i<=n1 && i<=n2; i++) {
			if(n1%i==0 && n2%i==0) {
				GDC=i;
			}
			
		}
		System.out.println(GDC);

	}

}
